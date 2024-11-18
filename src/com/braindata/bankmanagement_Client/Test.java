package com.braindata.bankmanagement_Client;

import java.util.Scanner;

import com.braindata.bankmanagement_ServiceImpl.Sbi;

public class Test {


	public static void main(String[] args) {
		Sbi s=new Sbi();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			s.createAccount();
			break;
		case 2:
			s.displayAllDetail();
			break;
		case 3:
			s.depositeMoney();
			
		}
		
		
		
		
		
	}

}
