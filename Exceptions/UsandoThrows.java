package Exceptions;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um numero decimal: ");
		try {
		double num = leNumero();
		System.out.println("Voc� digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inv�lida");
			e.printStackTrace();
		}
	}
	
	public static Double leNumero() throws Exception{
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		return num;
	}

}
