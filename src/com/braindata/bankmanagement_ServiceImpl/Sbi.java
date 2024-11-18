package com.braindata.bankmanagement_ServiceImpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.braindata.bankmanagement_Model.Account;
import com.braindata.bankmanagement_Service.Rbi;

import DBconfig.HButil;

public class Sbi implements Rbi {
	
	Scanner sc=new Scanner(System.in);
	Account ac=null;
	@Override
	public void createAccount() {
		ac=new Account();
		HButil.getSessionFactory();
		SessionFactory sf = HButil.getSessionFactory();
        Session session = sf.openSession();
		System.out.println("Enter Account Number");
		int acno=sc.nextInt();
		ac.setAccNo(acno);
		System.out.println("Enter Name");
		String name = sc.next() + sc.nextLine();
		ac.setName(name);
		System.out.println("Enter Mobile Number");
		long mobno = sc.nextLong();
		ac.setMobNo(mobno);
		System.out.println("Enter Pan Number");
		String panno = sc.next();
		ac.setPanNo(panno);
		System.out.println("Enter Adhar Number");
		long adrno = sc.nextLong();
		ac.setAdharNo(adrno);
		System.out.println("Enter Gender");
		String gender = sc.next();
		ac.setGender(gender);
		System.out.println("Enter age");
		int age = sc.nextInt();
		ac.setAge(age);
		System.out.println("Enter Your Deposite Amount");
		float amt = sc.nextFloat();
		ac.setBalance(amt);
        session.save(ac);
        session.beginTransaction().commit();
        
      System.out.println("Account Created Sucssfully...");	
      
	}

	@Override
	public void displayAllDetail() {
		HButil.getSessionFactory();
		SessionFactory sf = HButil.getSessionFactory();
		 Session session = sf.openSession();
		System.out.println("Your Account Number");
		int acno=sc.nextInt();
		Account ac = session.get(Account.class, acno);
		System.out.println("Name is="+ac.getName());
		System.out.println("Mobile No="+ac.getMobNo());
		System.out.println("Adhar No is="+ac.getAdharNo());
		System.out.println("Age="+ac.getAge());
		System.out.println("Pan No="+ac.getPanNo());
		System.out.println("Balance="+ac.getBalance());
		
	}

	@Override
	public void depositeMoney() {
		HButil.getSessionFactory();
		SessionFactory sf = HButil.getSessionFactory();
		Session session = sf.openSession();
		System.out.println("Enter Account Number");
		int acno=sc.nextInt();
	    System.out.println("Enter Amount You Want To Deposite");
	    System.out.println("4");
		float amount = sc.nextFloat();
		Account ac = session.get(Account.class, acno);
		double newbalance=ac.getBalance()+amount;
		System.out.println("5");
		String sql="update Account set balance=" + newbalance + " where AC_no=" + acno + "";
        Query query=session.createSQLQuery(sql).addEntity(Account.class);
		System.out.println("Done...");
	}

	@Override
	public void withdrawl() {
	
		
	}

	@Override
	public void balanceCheck() {
		
	
		
	}

	@Override
	public void updateDetails() {
		
		
		
	}

}
