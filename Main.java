package com.cursoceat.BombillaPOO;

import java.security.Identity;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bombilla salon = new Bombilla();
		Bombilla hab1 = new Bombilla();
		Bombilla hab2 = new Bombilla();
		Bombilla cocina = new Bombilla();
		Bombilla banio = new Bombilla();
		Bombilla terraza = new Bombilla();
		int opcion;
		Scanner scn = new Scanner(System.in);
	do {
		System.out.println("Que Bombilla desea utilizar");
		System.out.println("1. Salon"+ "[" +salon.muestraEstado()+ "]");
		System.out.println("2. Cocina"+ "[" +cocina.muestraEstado()+ "]");
		System.out.println("3. Baño"+ "[" +banio.muestraEstado()+ "]");
		System.out.println("4. Hab1"+ "[" +hab1.muestraEstado()+ "]");
		System.out.println("5. Hab2"+ "[" +hab2.muestraEstado()+ "]");
		System.out.println("6. Terraza"+ "[" +terraza.muestraEstado()+ "]");
		System.out.println("7. Interructor general"+ "[" +Bombilla.interruptorGeneral+ "]");
		System.out.println("8. Salir");
		System.out.print("Indique su opcion >> ");
		opcion = scn.nextInt();
		String mensaje = "El estado de la bombilla es >> ";
		switch (opcion) {
		case 1 ->{
			salon.encederApagar();
		}
		case 2 ->{
			cocina.encederApagar();
		}
		case 3 ->{
			banio.encederApagar();
		}
		case 4 ->{
			hab1.encederApagar();
		}
		case 5 ->{
			hab2.encederApagar();
		}
		case 6 ->{
			terraza.encederApagar();
		}
		case 7 ->{
			if (Bombilla.interruptorGeneral) {
				Bombilla.interruptorGeneral = false;
			}else {
				Bombilla.interruptorGeneral = true;
			}
		}
		default ->
		System.err.println("Opción no válida");
		}
		
	}while(opcion !=8);
	}

}
