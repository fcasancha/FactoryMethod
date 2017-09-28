package Heranca;

public class SilvestresFactory extends animaisFactory{
	public Animal criaAnimal(String qualAnimal){
		Animal animal=null;
		switch(qualAnimal){
			case "p�ssaro":
				animal = new Passaro();
				break;
			case "tamandu�":
				animal = new Tamandua();
				break;
		}
		return animal;
	}
}
