package org.bluetooth.bledemo;

import android.util.Log;
import android.widget.Toast;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * Created by jenny on 2016-05-21.
 */
public class SendData implements Runnable {
    //ServerSocket socket=null;
    DataOutputStream out= null;
    Socket sock=null;
    public static ArrayList<Integer> data=new ArrayList<Integer>();

    public SendData(Socket socket) {
        this.sock=socket;
    }

    @Override
    public void run() {

        try {
           // sock= socket.accept();
            out = new DataOutputStream(sock.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=0; i<data.size();i++) {
            try {
                out.writeInt(data.get(i));
                Thread.sleep(1000);
                out.flush();
                Log.d(PeripheralActivity.TAG, "sending:" + data.get(i));
                    } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        }
    public void endOutputStream(){
        if(out!=null){
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    }

