import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		double alturaSalto, alturaMario;
		int impulso, distancia, peso;
		String escolha;
		impulso = in.nextInt();
		alturaMario = in.nextDouble();
		distancia = in.nextInt();
		peso = in.nextInt();
		in.nextLine();
		escolha = in.nextLine();
		if(escolha.equals("Sim")) {
			impulso+=5;
			peso+=50;
		}			
		alturaSalto = Math.pow(impulso, 3)/(Math.sqrt(alturaMario)+distancia/2+peso/3);
		if(alturaSalto>=100)
			System.out.println("Voce consegue");
		else
			System.out.println("Isso e perda de tempo");
		in.close();
  }
}