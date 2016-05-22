package application;

import java.rmi.*; 
import java.rmi.server.*;

public class Generator extends UnicastRemoteObject implements IGenerator {
	private static final long serialVersionUID = 1L;
	Generator() throws RemoteException {}
	
	public ICalculator server_propriu() throws  Exception {
		return new Calculator();
	}
}
