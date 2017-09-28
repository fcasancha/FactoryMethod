package Heranca;

public class SilvestresFactory extends animaisFactory{
	public Animal criaAnimal(String qualAnimal){
		Animal animal=null;
		switch(qualAnimal){
			case "pássaro":
				animal = new Passaro();
				break;
			case "tamanduá":
				animal = new Tamandua();
				break;
		}
		return animal;
	}
}
