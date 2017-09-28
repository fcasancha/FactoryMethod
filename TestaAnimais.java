package Heranca;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TestaAnimais {
	
	//Main
	public static void main(String[] args) {
		String qualAnimal;
		Scanner entrada = new Scanner(System.in);
		qualAnimal = entrada.next();
		
		SilvestresFactory fabrica = new SilvestresFactory();
		/*  
		 * lembrando que os tipos não estão tratados, 
		* se não passar um dos descritos nos switch cases, haverá uma exception.
		 * **/
		Animal animal = fabrica.usaAnimal(qualAnimal);		
	}
}

