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
		 * lembrando que os tipos n�o est�o tratados, 
		* se n�o passar um dos descritos nos switch cases, haver� uma exception.
		 * **/
		Animal animal = fabrica.usaAnimal(qualAnimal);		
	}
}

