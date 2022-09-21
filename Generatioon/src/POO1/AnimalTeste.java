package POO1;

import java.util.Scanner;

public class AnimalTeste {

	public static void main(String[] args) {
	
				Scanner leia = new Scanner (System.in);
				Cachorro cachorro = new Cachorro();
				Cavalo cavalo = new Cavalo();
				Preguica preguica = new Preguica();
				Animal animal = null;
				int x=0;
				do {
				System.out.println("Seu animal é: \n1- Cachorro  \n2- Cavalo \n3- Preguiça \n");
				x = leia.nextInt();
				if (x==1) {
					animal = cachorro;
					System.out.println("Qual é o nome do seu cachorro?");
					String nome = leia.next();
					System.out.println("Quantos anos tem o seu cachorro?");
					int idade = leia.nextInt();
					System.out.println("Qual é o som que seu cachorro emite?");
					String som = leia.next();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					cachorro.Nome(nome);
					cachorro.Idade(idade);
					cachorro.Som(som);
					cachorro.Corre();
				}
				else if (x==2) {
					animal = cavalo;
					System.out.println("Qual é o nome do seu cavalo?");
					String nome = leia.next();
					System.out.println("Quantos anos tem o seu cavalo?");
					int idade = leia.nextInt();
					System.out.println("Qual é o som seu cavalo emite?");
					String som = leia.next();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					cavalo.Nome(nome);
					cavalo.Idade(idade);
					cavalo.Som(som);
					cavalo.Corre();
				}
				else if (x==3) {
					animal = preguica;
					System.out.println("Qual é o nome do sua preguiça?");
					String nome = leia.next();
					System.out.println("Quantos anos tem a sua preguiça?");
					int idade = leia.nextInt();
					System.out.println("Qual é o som que sua preguiça emite?");
					String som = leia.next();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					preguica.Nome(nome);
					preguica.Idade(idade);
					preguica.Som(som);
					preguica.Subirarvores();
				}
				else{
					System.out.println("Informação inválida, tente novamente!");
				}}while(x<=0 || x>=4);
								
			}}