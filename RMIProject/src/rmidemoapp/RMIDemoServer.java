package rmidemoapp;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIDemoServer {
	public static void main(String[] args) throws Exception {
		RMIDemoImpl impl = new RMIDemoImpl();
		
		/*
		 * This need rmiregistry to be started prior to running this program
		 */
		//Naming.rebind("RMIDemo", impl);	
		
		
		/*
		 * Below approach does not need rmiregistry to run prior to running this Program.
		 * This takes care of binding and starting the server. 
		 */
		Registry registry = LocateRegistry.createRegistry(2345);
		registry.rebind("RMIDemo", impl);
		System.out.println("RMIDemoServer.main() Object Bound...");
	}
}
