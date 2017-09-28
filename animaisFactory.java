package Heranca;

public abstract class animaisFactory {

	public Animal usaAnimal(String qualAnimal){
		Animal animal;
		animal = criaAnimal(qualAnimal);
		animal.emitirSom();
		return animal;
	}
	
	//Método de criação do animal abstrato para que as subclasses sejam responsáveis pela implementação
	protected abstract Animal criaAnimal(String qualAnimal);
	
	//outros métodos aqui...
}
