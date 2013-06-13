package spike;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spike.Account;
import spike.AccountService;

public class SimpleObjectMain {
	static JLabel label = new JLabel();
	static AccountService service = null;
	public static void main(String[] args) {
		System.out.println("Creating ApplicationContext");
		ApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
		System.out.println("Creating Simple Object");
		SimpleObject simple = (SimpleObject) context.getBean("simpleObject");
		System.out.println("Starting Service");
		service = simple.getAccountService();	
		System.out.println("New number of accounts: " + service.accountsSize());	
		
		JFrame frame = new JFrame("Web App Test");
		JButton button = new JButton ("Add Account");
		label = new JLabel("The number of accounts is "+getNumberOfAccounts());
		button.addActionListener(new ActionListener() {
        	 
            public void actionPerformed(ActionEvent e)
            {
            	addAccount();
            	label.setText("The number of accounts is "+getNumberOfAccounts());
            }
        });     
		JPanel jpanel = new JPanel (new FlowLayout());
		
		jpanel.add(label);
		jpanel.add(button);
		frame.add(jpanel);
		frame.setLayout(new FlowLayout());
		frame.setSize(400,150);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	private static void addAccount(){
		System.out.println("Adding Account");
		service.insertAccount(new Account());
	}
	
	private static int getNumberOfAccounts(){
		return service.accountsSize();
	}

}
