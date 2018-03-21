package uk.ac.ox.thomasburton.datastorage;

import java.util.ArrayList;
import java.util.List;

import uk.ac.ox.thomasburton.utilities.ByteArrayUtilities;

public class PlausiblyDeniableStorage implements DataStorage{

	
	private List<Byte[]> raw = null;
	
	public PlausiblyDeniableStorage(){
		
	}
	
	@Override
	public List<Byte[]> getData(String decryptionKey) {
		
		if( raw != null){
			
			/*
			 *  Go through block by block:
			 *  
			 *  	1) Decrypt
			 *  	2) check if valid
			 *  	3) splice
			 *  
			 */
			
			
			return raw;
			
		} 
		return null;
	}

	@Override
	public void setData(String encryptionKey, List<Byte[]> data) {
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

}
