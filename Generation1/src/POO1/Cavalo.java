package POO1;

public class Cavalo extends Animal{
	

	public Cavalo() {
		super("Cavalo");
	}
	

	public void Nome (String nomeanimal) {
		System.out.println("Nome do cavalo: "+nomeanimal);
	}
	public void Idade (int idadeanimal) {
		System.out.println("Idade: "+idadeanimal);
	}
	public void Som (String somanimal) {
		System.out.println("Som que o seu cavalo emite: "+somanimal);
	}
	public void Corre () {
		System.out.println("Uma das caracteristicas do seu cavalo é correr!");
	}
	
}