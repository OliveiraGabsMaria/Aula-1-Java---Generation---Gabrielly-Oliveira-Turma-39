package br.com.generation.Exerciciosdia09Nov;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro n�mero:");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero2 > numero3) {
			System.out.println("Ordem: " + numero1 + " , " + numero2 + " , " + numero3);
		}
		if(numero1 > numero3 && numero3 > numero2) {
			System.out.println("Ordem: " + numero1 + " , "+ numero3 + " , "+ numero2);
		}
		if(numero2 > numero1 && numero1 > numero3) {
			System.out.println("Ordem: " + numero2 + " , " + numero1 + " , " + numero3);
		}
		if(numero2 > numero3 && numero3 > numero2) {
			System.out.println("Ordem: " + numero2 + " , " + numero3 + " , " + numero1);
		}
		if(numero3 > numero2 && numero2 > numero1) {
			System.out.println("Ordem: " + numero3 + " , " + numero2 + " , " + numero1);
		}
		if(numero3 > numero1 && numero1 > numero2) {
			System.out.println("Ordem: " + numero1 + " , " + numero2 + " , " + numero3);
		}
		
		leia.close();

	}

}
