package com.braindata.bankmanagement_Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	   @Id

                private int userid;
		private int accNo;
		private String name;
		private long mobNo;
		private long adharNo;
		private String panNo;
		private String gender;
		private int age;
		private double balance;
		
		public void setAccNo(int accNo)
		{
			this.accNo=accNo;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setMobNo(long mobno2)
		{
			this.mobNo=mobno2;
		}
		public void setAdharNo(long adharNo)
		{
			this.adharNo=adharNo;
		}
		public void setPanNo(String panNo)
		{
			this.panNo=panNo;
		}
		public void setGender(String gender)
		{
			this.gender=gender;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public void setBalance(double balance)
		{
			this.balance=balance;
		}
		public int getAccNo()
		{
			return accNo;
		}
		public String getName()
		{
			return name;
		}
		public long getMobNo()
		{
			return mobNo;
		}
		public long getAdharNo()
		{
			return adharNo;
		}
		public String getPanNo()
		{
			return panNo;
		}
		public String getGender()
		{
			return gender;
		}
		public int getAge()
		{
			return age;
		}
		public double getBalance()
		{
			return balance;
		}
		
		
		
		
		
		

}
