package rmidemoapp;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIDemoImpl extends UnicastRemoteObject implements RMIDemo , Serializable{
	private static final long serialVersionUID = 1L;
	protected RMIDemoImpl() throws RemoteException {
		super();
	}
	@Override
	public String doCommunicate(String name) throws RemoteException {
		return "Hello " + name;
	}

}
