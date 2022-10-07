package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;


public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("DIGITE O NOME DO ALUNO: ");
		aluno.nome = sc.nextLine();
		System.out.println("DIGITE A PRIMEIRA NOTA: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("DIGITE A SEGUNDA NOTA: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("DIGITE A TERCEIRA NOTA: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("REPROVOU");
			System.out.printf("FALTOU %.2f PONTOS", aluno.pontosFaltou());
		}
		else {
			System.out.println("PASSOU");
		}
		
		
		sc.close();
	}

}
