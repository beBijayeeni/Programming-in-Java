import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello{
	public Server(){}
	public String sayHello(){ //sayHello -- method of remote interface
		return "Hello, world! from server";
	}
	public static void main(String args[]){
		try{
			Server obj = new Server();
			Hello stub = (Hello) UnicastRemoteObject.exportObject(obj,13);
			
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello",stub);
			System.err.println("Server Ready");
		}
		catch(Exception e){
			System.err.println("Server Exception: "+e.toString());
			e.printStackTrace();
		}
	}
}