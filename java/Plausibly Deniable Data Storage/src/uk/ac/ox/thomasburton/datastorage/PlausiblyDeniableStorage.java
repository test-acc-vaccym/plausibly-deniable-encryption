package uk.ac.ox.thomasburton.datastorage;

import java.util.ArrayList;
import java.util.List;

import uk.ac.ox.thomasburton.utilities.ByteArrayUtilities;

public class PlausiblyDeniableStorage implements BlockStorage{

	/*
	 * 		The block storage uses an array of encrypted blocks of size 512 bytes.
	 * 
	 * 		Block format:
	 * 
	 * 			   Bytes	 Description					 Encrypted
	 * 			  0 - 15     AES IV						     No
	 * 			 16 - 19     Decrypt Validation [0,0,0,0]    Yes
	 * 			20 - 511     Data (Length: 492)			     Yes
	 */
	
	
	/**
	 * 	A List of raw encrypted blocks. An encrypted block is 512 bytes long.
	 */
	private List<Byte[]> raw = null;
	
	
	
	public PlausiblyDeniableStorage(){
		
	}
	
	
	@Override
	public List<Byte[]> getBlocks(String decryptionKey) {
		
		if( raw != null){
			
			/*
			 *  Go through block by block:
			 *  
			 *  	1) Decrypt
			 *  	2) check if valid
			 *  	3) splice
			 *  
			 */
			
			List<Byte[]> validBlocks = new ArrayList<Byte[]>();
			
			for( int i = 0 ; i < raw.size(); i++ ){
				
				validBlocks.add(raw.get(i));
				
			}
			
			return validBlocks;
			
		} 
		return null;
	}

	@Override
	public void setBlock(String encryptionKey, List<Byte[]> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean readFile(String filename) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean WriteFile(String filename) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setRaw(byte[] raw) {
		this.raw = new ArrayList<Byte[]>();
		this.raw.add(ByteArrayUtilities.toObjects(raw));
		return true;
	}

	@Override
	public boolean setRaw(List<Byte[]> raw) {
		this.raw = new ArrayList<Byte[]>();
		this.raw = raw;	
		return false;
	}

	@Override
	public boolean clear() {
		raw = new ArrayList<Byte[]>();
		return true;
	}


	@Override
	public void addBlock(String encryptionKey, byte[] data) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void addBlock(String encryptionKey, byte[] data, int index) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public byte[] getBlock(String decryptionKey, int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
