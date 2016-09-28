package org.bluetooth.bledemo;

import java.util.UUID;

public class BleDefinedUUIDs {
	
	public static class Service {
		final static public UUID ADC_Services             = UUID.fromString("a6322521-eb79-4b9f-9152-19daa4870418");
		final static  public UUID SENSOR_SERVICES         = UUID.fromString("7280d0b4-c973-11e4-8731-1681e6b88ec1");
	}

	public static class Characteristic {
		final static public UUID HEART_RATE_MEASUREMENT   = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");
		final static public UUID MANUFACTURER_STRING      = UUID.fromString("00002a29-0000-1000-8000-00805f9b34fb");
		final static public UUID MODEL_NUMBER_STRING      = UUID.fromString("00002a24-0000-1000-8000-00805f9b34fb");
		final static public UUID FIRMWARE_REVISION_STRING = UUID.fromString("00002a26-0000-1000-8000-00805f9b34fb");
		final static public UUID APPEARANCE               = UUID.fromString("00002a01-0000-1000-8000-00805f9b34fb");
		final static public UUID BODY_SENSOR_LOCATION     = UUID.fromString("00002a38-0000-1000-8000-00805f9b34fb");
		final static public UUID BATTERY_LEVEL            = UUID.fromString("00002a19-0000-1000-8000-00805f9b34fb");
		final static  public UUID WEIGHT_MEASUREMENT      = UUID.fromString("00001234-0000-1000-8000-00805f9b34fb");
		final static public UUID ACC                      = UUID.fromString("b928cab6-ca32-11e4-8731-1681e6b88ec1");
		final static public UUID MAG                      = UUID.fromString("b928cc14-ca32-11e4-8731-1681e6b88ec1");
		final static public UUID BAR                      = UUID.fromString("b928c85e-ca32-11e4-8731-1681e6b88ec1");
		final static public UUID GYRO                     = UUID.fromString("b928ceee-ca32-11e4-8731-1681e6b88ec1");
		final static  public UUID   TEMP                  = UUID.fromString("b928cd15-ca32-11e4-8731-1681e6b88ec1");
		final static  public UUID   ADC                   = UUID.fromString("a6322521-eb79-4b9f-9152-19daa4870418");

	}
	
	public static class Descriptor {
		final static public UUID CHAR_CLIENT_CONFIG       = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
	}
	
}
