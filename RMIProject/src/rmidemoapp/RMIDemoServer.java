package rmidemoapp;

import java.rmi.Naming;

public class RMIDemoServer {
	public static void main(String[] args) throws Exception {
		RMIDemoImpl impl = new RMIDemoImpl();
		Naming.rebind("RMIDemo", impl);
		System.out.println("RMIDemoServer.main() Object Bound...");
	}
}
