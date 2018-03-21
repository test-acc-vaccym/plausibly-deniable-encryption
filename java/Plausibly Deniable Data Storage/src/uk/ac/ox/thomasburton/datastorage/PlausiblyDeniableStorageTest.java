package uk.ac.ox.thomasburton.datastorage;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.ac.ox.thomasburton.utilities.ByteArrayUtilities;

public class PlausiblyDeniableStorageTest {

	@Test
	public void test() {
		
		byte[] data = {0,1,2,3};
		
		BlockStorage ds = new PlausiblyDeniableStorage();
		ds.clear();
		ds.setRaw(data);
		
		
		for( int i = 0 ; i < data.length; i++ ){
			assertTrue( ds.getBlocks("").get(0)[i] == data[i]);
			
			System.out.println(data[i]);
			
		}
		
	}

}
