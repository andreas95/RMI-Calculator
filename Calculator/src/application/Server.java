package application;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args)  {
		Generator Ob=null;
		try {
			Ob = new Generator();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Registry reg = null;
		try {
			reg = LocateRegistry.createRegistry(1099);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Portul este deja folosit! Conectare esuata...");
			System.exit(-1);
		}
		try {
			reg.bind("Calculator", Ob);
		} catch (AccessException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error -123");
			System.exit(-1);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error -1234");
			System.exit(-1);
		} catch (AlreadyBoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error -12345");
			System.exit(-1);
		}
		System.out.println("Serverul a pornit!");
	}
}