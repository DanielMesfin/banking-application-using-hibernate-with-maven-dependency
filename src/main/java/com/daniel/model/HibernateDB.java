package com.daniel.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;


public class HibernateDB {
	// 1, Get the session variable ;
	private static Session getConfiguration() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		Session session = cfg.buildSessionFactory().openSession();
		return session;
	}
	// 2, Create new account for the new user of the bank;
	public boolean createNewAccount(CreateAccount newAccount,AccountBalance newBalance) {
		Session session = getConfiguration();
		Transaction transaction = session.beginTransaction();
		session.save(newAccount);
		session.save(newBalance);
		transaction.commit();
		session.close();
		return true;
	}
	// f3 for checking user login ;
	public boolean logIn(LogInToAccount logInToAccount) {
            boolean hasAccount=false;
			Session session=getConfiguration();
			Transaction transaction=session.beginTransaction();
		    CreateAccount user= (CreateAccount) session.createQuery("FROM CreateAccount WHERE accountNumber =:account and password=:cpassword").setString("account",logInToAccount.getAccountNumber() ).setString("cpassword", logInToAccount.getPassword()).uniqueResult();
			if(user!=null) {
				hasAccount=true;
			}else {
				hasAccount=false;
			}
		    transaction.commit();
			session.close();
		return hasAccount;
	}
	// 4 update the user information
	public  boolean udateUserInformation(String accountNumber, CreateAccount updateAccount) {
		Session session = getConfiguration();
		Transaction transaction = session.beginTransaction();
		CreateAccount updated = (CreateAccount) session.createQuery("FROM  CreateAccount WHERE accountNumber =:accountNumber").setString("accountNumber", accountNumber).uniqueResult();
		updated.setFullName(updateAccount.getFullName());
		updated.setEmailAddress(updateAccount.getEmailAddress());
		updated.setPassword(updateAccount.getPassword());
		transaction.commit();
		session.close();
		return true;
	}
	//5  for the createAccount data selection
	public  AccountBalance unserInfomation(String accountInformation) {
		Session session=getConfiguration();
		Transaction transaction=session.beginTransaction();
		AccountBalance accoutnBalance=(AccountBalance)session.createQuery("FROM AccountBalance WHERE  accountNumber_accountNumber =:accountUpdated").setString("accountUpdated",accountInformation ).uniqueResult();		
		transaction.commit();
		session.close();
		return accoutnBalance;
	}
	public boolean udateAccountBalance(Account2Account a2a) {
		boolean excution=false;
		Session session=getConfiguration();
		Transaction transaction=session.beginTransaction();
		String transactionType=a2a.gettType();
		Double amountToBePassed=a2a.getAmountPassed();
	    AccountBalance  accountBalance= (AccountBalance) session.createQuery("FROM AccountBalance WHERE  accountNumber_accountNumber =:accountUpdated").setString("accountUpdated", a2a.getSender()).uniqueResult();
	    Double balance=accountBalance.getAccountBalance();
	    CreateAccount accountJoin = (CreateAccount)session.createQuery("FROM CreateAccount WHERE  accountNumber =:aUpdated").setString("aUpdated", a2a.getSender()).uniqueResult();
	    // for deposit 
	    if (transactionType.equals("Deposit")) {
	    	balance=balance+amountToBePassed;
	    	accountBalance.setAccountBalance(balance);
	    	excution=true;
		}// for withdrawal function
	    else if (transactionType.equals("Withdrawal")) {
			 if(balance>=amountToBePassed) {
			balance=balance-amountToBePassed;
	    	accountBalance.setAccountBalance(balance);
	    	excution=true;
	    	}else {
				excution=false;
			}
		}else if (transactionType.equals("Transfare")) {
			 if(balance>=amountToBePassed) {
			 AccountBalance  accountReciver= (AccountBalance) session.createQuery("FROM AccountBalance WHERE  accountNumber_accountNumber =:accountUpdated").setString("accountUpdated", a2a.getReciver()).uniqueResult();
		   Double balanceReciver=accountReciver.getAccountBalance();
			balance=balance-amountToBePassed;
			balanceReciver=balanceReciver+amountToBePassed;
			accountReciver.setAccountBalance(balanceReciver);
	    	accountBalance.setAccountBalance(balance);
	    	excution=true;
	    	}else {
				excution=false;
			}
		}
	    a2a.setOneAccountToManyTransaction(accountJoin);
	    session.save(a2a);
		transaction.commit();
		session.close();
		return excution;
	}
	//6 check balance 
	public Double balance(String account) {
		Session session=getConfiguration();
		Transaction transaction=session.beginTransaction();
		Double balanceValue=0.0;
		 AccountBalance  accountReciver= (AccountBalance) session.createQuery("FROM AccountBalance WHERE  accountNumber_accountNumber =:account").setString("account", account).uniqueResult();
		 balanceValue=accountReciver.getAccountBalance();
		 transaction.commit();
			session.close();
			return balanceValue;
	}
	//7 for list of transaction
	public List<Account2Account> getAllHistorys(String accountNumber) {
		Session session=getConfiguration();
		Transaction transaction=session.beginTransaction();
		List<Account2Account> history= ((Query) session.createQuery("FROM Account2Account WHERE   oneAccountToManyTransaction_accountNumber =:history").setString("history", accountNumber)).list();
		transaction.commit();
		session.close();
		return history;
	}
}
