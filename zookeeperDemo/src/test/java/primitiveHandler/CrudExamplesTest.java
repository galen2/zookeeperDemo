package primitiveHandler;

import org.apache.curator.framework.CuratorFramework;
import org.junit.Before;
import org.junit.Test;

import framework.CreateClientExamples;
import framework.CrudExamples;

public class CrudExamplesTest {

	
	public static String hostPort = "192.168.33.14:2181";
	
	public CuratorFramework cura = null;
	String path = "/zk_tt";
	
	@Before
	public void createZK(){
		cura = CreateClientExamples.createSimple(hostPort);
		cura.start();
	}
	
	@Test
	public void getDataTest(){
		String data = CrudExamples.getData(cura, path);
		System.out.println(data);
	}
	
	
}
