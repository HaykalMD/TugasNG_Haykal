package TugasGL;
import java.util.Scanner;
public class pohon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukan tinggi: ");
		int t = scanner.nextInt();
		scanner.close();
		
		//perulangan daun
		for (int i = 1; i<=t+1; i++) {
			for (int j = t-1; j>=i-1;j--) {
				System.out.print(" ");
			}
			for (int k = 1; k<=i; k++ ) {
				System.out.print(" *");
			}
			System.out.println();
		}
		//perulangan batang
		for (int i = 1; i<=t; i++) {
			for (int j = t-1; j>=0-1;j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
	}

}
