package rmidemoapp;

import java.rmi.Naming;

public class RMIDemoClient {
	public static void main(String[] args) throws Exception {
		String url = "rmi://localhost/RMIDemo";
		RMIDemo demo = (RMIDemo)Naming.lookup(url);
		System.out.println(demo.doCommunicate("Jayram"));
	}
}