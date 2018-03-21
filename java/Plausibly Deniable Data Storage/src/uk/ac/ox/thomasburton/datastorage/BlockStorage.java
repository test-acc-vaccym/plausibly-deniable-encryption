package uk.ac.ox.thomasburton.datastorage;

import java.util.List;

public interface BlockStorage {

	
	public byte[] getBlock(String decryptionKey, int index);
	public List<Byte[]> getBlocks(String decryptionKey);
	public void setBlock(String encryptionKey, List<Byte[]> data);
	public void addBlock(String encryptionKey, byte[] data);
	public void addBlock(String encryptionKey, byte[] data, int index);
	
	public boolean readFile( String filename );
	public boolean WriteFile( String filename );
	public boolean setRaw( byte[] raw );
	public boolean setRaw( List<Byte[]> raw );
	public boolean clear();
	
	
}
