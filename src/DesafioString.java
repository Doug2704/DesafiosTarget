
//Escreva um programa que inverta os caracteres de um string.

import java.util.Scanner;

public class DesafioString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um texto");
		String texto = sc.nextLine();
		String textoReverso = "";
		for (int i = texto.length() - 1; i >= 0; i--) {
			textoReverso += texto.charAt(i);
		}
		System.out.println(textoReverso);
		sc.close();
	}

}
