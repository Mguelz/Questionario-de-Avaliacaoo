package avaliacao.util;

import java.util.Scanner;

public class LeitorDeDados {
	private Scanner sc;

	public LeitorDeDados() {
		sc = new Scanner(System.in);
	}

	/**
	 * Obtem o que o for digitado no console até o enter
	 * 
	 * @return nextLine
	 */
	public String pegarNextLineDigitado() {
		return sc.nextLine();
	}

	/**
	 * Obtem o que for digitado no console até o primeiro espaço
	 * 
	 * @return sc.next
	 */
	public String pegartextoCurto() {
		return sc.next();
	}

	/**
	 * Obtem um inteiro que for digitado no console
	 * 
	 * @return nextInt
	 */
	public int pegarIntDigitado() {
		return Integer.parseInt(sc.nextLine());
	}

	/**
	 * obtem um double que for digitado no console
	 * 
	 * @return nextDouble
	 */
	public double pegarDoubleDigitado() {
		return Double.parseDouble(sc.nextLine());
	}

	/**
	 * fecha o scanner
	 */
	public void close() {
		sc.close();
	}
}
