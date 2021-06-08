package exercicios;

import java.util.Scanner;

class ex005{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int P = scan.nextInt();
		int R = scan.nextInt();
		scan.close();
		
		if (P == 0)
			System.out.println("C");
		else
			if (R == 0)
				System.out.println("B");
			else
				System.out.println("A");
	}
}