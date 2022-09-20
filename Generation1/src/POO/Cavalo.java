package POO;

public class Cavalo extends Animal{


    public Cavalo(String species, String name) {
        super(species, name);
    }

    @Override
    public void som(){
        System.out.println("\nO Cavalo "+getName()+" da espécie "+getSpecies()+" grunhe");
    } 
    @Override
    public void movi(){
        System.out.println("\nO cavalo "+getName()+" da espécie "+getSpecies()+ " corre");
    }

}
