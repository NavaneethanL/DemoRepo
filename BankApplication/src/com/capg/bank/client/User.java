package com.capg.bank.client;

import java.util.Scanner;

import com.capg.bank.service.Bank2;
import com.capg.bank.service.IBank;
import com.capg.bank.service.Util;

public class User {  // shanti

	public static void main(String[] args) {
		
	
		
		

		Scanner sc = new Scanner(System.in); // HAS - A relationship

		System.out.println("******WELCOME TO CAPG ATM*********");

		boolean flag = true;
		
			IBank  bank =	Util.getInstance();
			
			
				

		while (flag) {

			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:

					// deposit
				bank.deposit();
				
				break;
			case 2:
					// withdraw
				
				bank.withdraw();
				break;
			case 3:

				
						flag = false;
				break;

			default:
				break;
			}

		}

	}

}
