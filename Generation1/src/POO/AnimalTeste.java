package POO;

public class AnimalTeste {

	public static void main(String[] args) {
		Animal animal = new Animal("","");
        animal.som();
        animal.movi();
 
        animal = new Cachorro("Spyke","lhasa apso");      
        animal.som();
        animal.movi();
        
        animal = new Cavalo("Valente","Branco");
        animal.som();
        animal.movi();
        
        animal = new Preguiça("Zumbu","Raro");
        animal.som();
        animal.movi();




    }
}