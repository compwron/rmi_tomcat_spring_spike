package spike;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

	private List<Account> accounts;
	
	public AccountServiceImpl(){
		accounts = new ArrayList<Account>();
		
		for(int i = 0; i < 5; i++){
			insertAccount(new Account());
		}
	}
	
	public void insertAccount(Account account) {
		accounts.add(account);
		System.out.println("Adding an account.");
	}

	public List<Account> getAccounts(String name) {
		return accounts;
	}
	
	public int accountsSize(){
		return accounts.size();
	}
}