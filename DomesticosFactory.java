package Heranca;

public class DomesticosFactory extends animaisFactory {
	public Animal criaAnimal(String qualAnimal){
		Animal animal=null;
		switch(qualAnimal){
			case "cachorro":
				animal = new Cachorro();
				break;
			case "gato":
				animal = new Gato();
				break;
		}
		return animal;
	}
}
