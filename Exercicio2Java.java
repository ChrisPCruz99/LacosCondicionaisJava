package DesenvolvimentoJava;
import java.util.Scanner;

public class Exercicio2Java {

	public static void main(String[] args) {
		int idade;
		Scanner leia= new Scanner(System.in);
		
		System.out.printf("Digite sua idade");
		idade=leia.nextInt();
		leia.nextLine();
		
		if(idade>=16 && idade<18)
		{
			System.out.printf("\nVocê está apto a votar e seu voto é facultativo");			
		}
		if(idade>=18 && idade<65)
		{
			System.out.printf("\nVocê está apto a votar e seu voto é obrigatorio");
		}
		if(idade>=65)
		{
			System.out.printf("\nVocê está apto a votar e seu voto é facultativo");
		}
		if(idade<16)
		{
			System.out.printf("\nVocê não está apto a votar");
		}
				
	}

}
