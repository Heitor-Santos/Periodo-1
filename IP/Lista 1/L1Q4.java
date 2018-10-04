import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String placaDireita;
		String placaMeio;
		String placaEsquerda;
		placaDireita = in.nextLine().toLowerCase();
		placaMeio = in.nextLine().toLowerCase();
		placaEsquerda = in.nextLine().toLowerCase();
		char testeInic = placaDireita.charAt(0);
		char testeFin = placaDireita.charAt(placaDireita.length()-1);
		if (testeInic == 'f' && testeFin == 'r')
			System.out.println("Direita");
		else {
			testeInic = placaMeio.charAt(0);
			testeFin = placaMeio.charAt(placaMeio.length()-1);
			if (testeInic == 'f' && testeFin == 'r')
				System.out.println("Meio");
			else {
				testeInic = placaEsquerda.charAt(0);
				testeFin = placaEsquerda.charAt(placaEsquerda.length()-1);
				if (testeInic == 'f' && testeFin == 'r')
					System.out.println("Esquerda");
				else
					System.out.println("Vou em frente");
			}		
		}				
		in.close();
  }
}