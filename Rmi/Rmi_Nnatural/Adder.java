import java.rmi.*;  
public interface Adder extends Remote{  
public int add(int n)throws RemoteException;  
}  

