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
	
	
	
	/**
	 * Concatenate two byte arrays
	 * @param a First array
	 * @param b Second array
	 * @return The combined array
	 */
	public static byte[] concat(byte[] a, byte[] b) {
	   int aLen = a.length;
	   int bLen = b.length;
	   byte[] c= new byte[aLen+bLen];
	   System.arraycopy(a, 0, c, 0, aLen);
	   System.arraycopy(b, 0, c, aLen, bLen);
	   return c;
	}
	
}
