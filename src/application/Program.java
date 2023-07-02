package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
		method1();
		}
	public static void method1 () {
		System.out.println("******METHOD 2 START******");
		method2();
		System.out.println("******METHOD 2 FINISH******");

	}	
	
	public static void method2() {
		System.out.println("******METHOD 2 START******");
		Scanner sc = new Scanner(System.in);
		try {	
		System.out.print("Enter some random names: ");
		String[] vect = sc.nextLine().split(" ");
		int positian = sc.nextInt();
		System.out.print(vect[positian]);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Numero excedido do vector");
			e.printStackTrace();
		}
		
		catch (InputMismatchException e) {
		System.out.println("Digite um número, não uma letra");
		}
		sc.close();
		System.out.println("******METHOD 2 FINISH******");
	}

}
