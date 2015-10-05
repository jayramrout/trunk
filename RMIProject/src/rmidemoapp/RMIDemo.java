package rmidemoapp;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIDemo extends Remote {
	public String doCommunicate(String name) throws RemoteException;
}
