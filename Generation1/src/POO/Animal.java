package POO;

public class Animal {
	
	private String species;
    private String name;


    public Animal(String name, String species) {
        this.setSpecies(species);
        this.setName(name);

    }


    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void som(){System.out.println("Som do animal: ");}
    public void movi(){System.out.println("Movimento do animal: ");}

}
