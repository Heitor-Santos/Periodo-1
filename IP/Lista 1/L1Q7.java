import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String nome, nomeGolpe;
		int vidaBowser, golpe=0;
		nome = in.nextLine();
		nomeGolpe = in.nextLine();
		vidaBowser = in.nextInt();
		if(nome.equals("Mario")) {
			if(nomeGolpe.equals("FireFlower"))
		    golpe = 73;
			else if (nomeGolpe.equals("IceFlower"))
			golpe = 50;
			else if(nomeGolpe.equals("BoomerangFlower"))
			golpe = 32;
		}
		else {
			if(nomeGolpe.equals("FireFlower"))
		    golpe = 70;
			else if (nomeGolpe.equals("IceFlower"))
			golpe = 45;
			else if(nomeGolpe.equals("BoomerangFlower"))
			golpe = 28;
		}
		if(vidaBowser<= (golpe*4))
			System.out.println(nome +" conseguiu derrotar o Bowser e salvar a princesa Peach.");
		else
			System.out.println("O Bowser conseguiu escapar.");
		in.close();
  }
}