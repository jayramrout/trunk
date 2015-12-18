package rmidemoapp;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIDemoClient {
	public static void main(String[] args) throws Exception {
		String url = "rmi://localhost/RMIDemo";
		RMIDemo demo = (RMIDemo)Naming.lookup(url);
		System.out.println(demo.doCommunicate("Diyansha"));
		
		Registry registry = LocateRegistry.getRegistry("localhost",2345);
		demo = (RMIDemo)registry.lookup("RMIDemo");
		System.out.println(demo.doCommunicate("Diyansha"));
	}
}