package com.sophos.Capacitacion1;
import java.util.Scanner;

public class VariablesCondicionales {
	
	public void variables() {
		
		byte b1,b2;
		short s1,s2;
		int i1, i2;
		long l1,l2;
		float f1,f2;
		double d1,d2;
		boolean bo1,bo2;
		char c1,c2;
		String  cadena;
				
	}
	
	@SuppressWarnings("resource")
	public static void mayoriaEdad() {
		
		int edad=23;
//		System.out.println("digite edad de la persona:");
//		Scanner teclado = new Scanner(System.in);
//		edad=teclado.nextInt();
		
		if (edad >=18) {
			
			System.out.println("la persona es mayor de edad tiene "+edad);
		}else {System.out.println("la persona es menor de edad tiene "+edad);}	
		
	}
	

}
