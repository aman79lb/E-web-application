/*

import java.util.Scanner;

public class NamePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        int length = name.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(name.charAt(j));
                }
            }
            for (int j = length - 2; j >= i; j--) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
}

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NamePattern {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a name: ");
		String name = br.readLine();

		int length = name.length();

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print(name.charAt(j));
				}
			} 
			System.out.print(" | ");  

			for (int j = length - 1; j >= i; j--) {
				System.out.print(name.charAt(j));
			}
			System.out.println();
		}
	}
}


