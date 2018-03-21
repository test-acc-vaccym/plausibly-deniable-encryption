package uk.ac.ox.thomasburton.utilities;

public class ByteArrayUtilities {

	
	// https://stackoverflow.com/a/24252932
	public static byte[] toPrimitives(Byte[] oBytes){
		
		byte[] bytes = new byte[oBytes.length];
		
		for(int i = 0; i < oBytes.length; i++) {
		    bytes[i] = oBytes[i];
		}
		
		return bytes;
	}
	

	// https://stackoverflow.com/a/24252932
	public static Byte[] toObjects(byte[] bytesPrim) {
		
		Byte[] bytes = new Byte[bytesPrim.length];
		
		int i = 0;
		for (byte b : bytesPrim) bytes[i++] = b; // Autoboxing
		
		return bytes;
	}
	
}
