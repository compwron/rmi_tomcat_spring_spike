package spike;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RemoteAccountService extends Remote {

	public void insertAccount(Account account) throws RemoteException;

	public List<Account> getAccounts(String name) throws RemoteException;
	
	public int accountsSize() throws RemoteException;
}