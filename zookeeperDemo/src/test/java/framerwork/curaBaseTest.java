package framerwork;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.utils.CloseableUtils;
import org.junit.After;
import org.junit.Before;

import framework.CreateClientExamples;

public class curaBaseTest {

	
	public static String hostPort = "192.168.33.14:2181,192.168.33.22:2181";
	
	public CuratorFramework client = null;
	
	@Before
	public void createCuraClient(){
		client = CreateClientExamples.createSimple(hostPort);
		client.start();
	}
	
	
	@After
	public void closeCuraClient(){
		CloseableUtils.closeQuietly(client);
	}
	
}
