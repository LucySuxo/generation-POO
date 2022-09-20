package POO;

public class Preguiça extends Animal {


    public Preguiça(String species, String name) {
        super(species, name);
    }

    @Override
    public void som(){
        System.out.println("\nA preguiça "+getName()+" da espécie "+getSpecies()+" emite som de alta frequencia");
    }
    @Override
    public void movi(){
        System.out.println("\nA preguiça"+getName()+" da espécie "+getSpecies()+ " escala árvores.");
    }

}
