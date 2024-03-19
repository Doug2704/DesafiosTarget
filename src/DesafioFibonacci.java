import java.util.Scanner;

/*
 *  Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 *  escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */
public class DesafioFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fibonacci = 0;
		int proximoTermo = 1;
		int incremento = 0;
		boolean pertence = true;
		System.out.print("Informe um número que deseja verificar se está na sequência de Fibonacci: ");
		int entrada = sc.nextInt();

		while (fibonacci <= entrada) {
			if (entrada == fibonacci) {
				pertence = true;
			} else {
				pertence = false;
			}

			System.out.print(fibonacci + ", ");
			incremento = fibonacci + proximoTermo;
			fibonacci = proximoTermo;
			proximoTermo = incremento;

		}

		System.out.println();
		if (pertence) {
			System.out.println("O número [" + entrada + "] pertence à sequência de Fibonacci");
		} else {
			System.out.println("O número [" + entrada + "] NÃO pertence à sequência de Fibonacci");
		}
		sc.close();
	}

}
/*
 * a9 b128 c49 d49 e13
 */