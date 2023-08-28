package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.account.Account;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String name,city;
		int accno,amt;
		ArrayList<Account> list=new ArrayList<>();
		list.add(new Account("Azam","Delhi",50000));
		list.add(new Account("kamal","benglore",52000));
		list.add(new Account("Faiyaj","Hydrabaad",45000));
		list.add(new Account("Sidd", "Pune", 55000));

		System.out.println("  select operations  ");
		System.out.println("1. open account");
		System.out.println("2. deposit");
		System.out.println("3. withdraw");
		System.out.println("4. balance enquiry");
		System.out.println("5. list all");
		System.out.println("6. exit");

		boolean found;
		int choice;
		do {
		System.out.println("enter choice here :");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("....account open....");
			System.out.println("enter name :");
			name=sc.next();
			System.out.println("enter city :");
			city=sc.next();
			System.out.println("enter amount :");
			amt=sc.nextInt();
			Account acc=new Account(name,city,amt);
			list.add(acc);
			System.out.println("account opened......");

			break;

		case 2:
			System.out.println("....deposit....");
			found=false;
			System.out.println("enter account no :");
			accno=sc.nextInt();
			for(Account ac:list) {
				if(accno==ac.getAccno()) {
					found=true;
					System.out.println("customer name :"+ac.getName());
					System.out.println("city :"+ac.getCity());
					System.out.println("account balance :"+ac.getBal());

					System.out.println("\n enter amount to deposit ");
					amt=sc.nextInt();
					ac.setBal(ac.getBal()+amt);
					System.out.println("deposit successfully.......");
					break;
				}
			}
			if(!found) {
				System.out.println("invalid account number.........");
			}
			break;

		case 3:
			System.out.println("....withdraw....");
			found=false;
			System.out.println("enter account no :");
			accno=sc.nextInt();
			for(Account ac:list) {
				if(accno==ac.getAccno()) {
					found=true;
					System.out.println("customer name :"+ac.getName());
					System.out.println("city :"+ac.getCity());
					System.out.println("account balance :"+ac.getBal());

					System.out.println("\n enter amount to withdraw ");
					amt=sc.nextInt();
					if(amt<=ac.getBal()) {
						ac.setBal(ac.getBal()-amt);
						System.out.println("withdraw successfully.......");
					} else {
						System.out.println("insufficient balance...");
					}

					break;
				}
			}
			if(!found) {
				System.out.println("invalid account number.........");
			}
			break;

		case 4:
			System.out.println("....balance enquiry....");
			found=false;
			System.out.println("enter account no :");
			accno=sc.nextInt();
			for(Account ac:list) {
				if(accno==ac.getAccno()) {
					found=true;
					System.out.println("customer name :"+ac.getName());
					System.out.println("city :"+ac.getCity());
					System.out.println("account balance :"+ac.getBal());

					break;
				}
			}
			if(!found) {
				System.out.println("invalid account number.........");
			}
			break;

		case 5:
			System.out.println("....list all....");
			for(Account ac:list) {
				System.out.println(ac);
			}
			break;

		case 6:
			System.out.println("....thanks for visiting us....");

			break;

		default:
			System.out.println(".....invalid choice....");


		}

		} while(choice!=6);
		
    }
}
