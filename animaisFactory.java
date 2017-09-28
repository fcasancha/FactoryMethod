package Heranca;

public abstract class animaisFactory {

	public Animal usaAnimal(String qualAnimal){
		Animal animal;
		animal = criaAnimal(qualAnimal);
		animal.emitirSom();
		return animal;
	}
	
	//M�todo de cria��o do animal abstrato para que as subclasses sejam respons�veis pela implementa��o
	protected abstract Animal criaAnimal(String qualAnimal);
	
	//outros m�todos aqui...
}
