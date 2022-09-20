package POO;

public class Cachorro extends Animal{
	
	public Cachorro(String name, String species){
        super(name,species);
    }

   
    @Override
    public void som(){
        System.out.println("\nO Cachorro "+getName()+" da espécie "+getSpecies()+" late");
    } 
    @Override
    public void movi(){
        System.out.println("\nO cachorro "+getName()+" da espécie "+getSpecies()+ " corre");
    }

}

