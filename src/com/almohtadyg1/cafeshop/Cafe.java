package com.almohtadyg1.cafeshop;

import java.util.HashMap;
import java.util.Scanner;

public class Cafe {
	private static final void invalid() {
		System.out.println("============================================");
        System.out.println("Invalid Input\n<Please Enter A Valid Number>");
        System.out.println("============================================");
	}

	public static void main(String[] args) {
		String[] menuItems = { "Coffee", "Tea", "Chocolate Cake" };
		HashMap<String, Byte> menuPrices = new HashMap<String, Byte>();
		
		byte times = 0;
		for (String i: menuItems) {
			Byte r = (byte) Math.round((Math.random() * 15)+5);
			menuPrices.put(i, r);
			times++;
		}
		times = 0;
		
		System.out.print("Welcome to the Cafe!\n-----------------------------------------------------\nThis is our menu:");
		for (String i: menuItems) {
			times++;
			System.out.print("\n" + times + "- " + i + " -> " + menuPrices.get(i) + " EGP");
		}
		times = 0;
		
		System.out.print("\n-----------------------------------------------------\n");
		
		Scanner sc;
		byte choice;
		while (true) {
			try {
				sc = new Scanner(System.in);
				System.out.print("\nSo, What Do You Want Sire?\n I want number: ");
				choice = sc.nextByte();
				if (choice > menuItems.length) {
					invalid();
					continue;
				}
				break;
			}
			catch (Exception e) {
				invalid();
	        }
		}
		
		sc.close();
		
		byte price = 0;
		String lastItem = "";
		for (String i: menuItems) {
			if (choice == times) {
				price = menuPrices.get(lastItem);
				break;
			}
			lastItem = i;
			times++;
		}
		System.out.println("\nSo, You Want " + menuItems[choice-1] + " for " + price + " EGP");
		System.out.println("\n-----------------------------------------------------\n");
		System.out.println("Here is your order. Have A Nice Day Sire!");
	}

}
