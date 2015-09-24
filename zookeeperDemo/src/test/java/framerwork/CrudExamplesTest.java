package framerwork;

import org.junit.Test;

import framework.CrudExamples;

public class CrudExamplesTest extends curaBaseTest{

	String path = "/zk_tt";

	@Test
	public void getDataTest(){
		String data = CrudExamples.getData(client, path);
		System.out.println(data);
	}
	
	
}
