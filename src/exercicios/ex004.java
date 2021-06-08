package exercicios;

import java.util.Scanner;

class ex004{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		System.out.println((n1+n2)/2);
		scan.close();
	}
}