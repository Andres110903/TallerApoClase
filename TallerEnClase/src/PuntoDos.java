import java.util.Scanner;
import java.util.*;
import java.io.*;
public class PuntoDos {
	public static void main(String[] args) throws IOException {
		
		Scanner capn = new Scanner(System.in);
		
		int n, can;
		char des;
		
		do {
			System.out.println("Digite un número entero: ");
			n = capn.nextInt();
			can = 0;
			while(n!= 0){
					n = n/10;
					can++;
			}
			System.out.println("El número digitado tiene " + can + " cifras");
			System.out.println("¿Desea ingresar otro número?: ");
			des = (char)System.in.read();
		}while(des!= 'n' && des!= 'N');
		System.out.print("Gracias por usar el programa");
	}
}
