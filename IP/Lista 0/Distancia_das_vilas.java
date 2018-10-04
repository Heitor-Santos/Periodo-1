import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int longitude;
		int latitude;
		double distanciaHogsmeade;
		double distanciaKakariko;
		double distanciaSolitude;
		Scanner in = new Scanner(System.in);
		longitude = in.nextInt();
		latitude = in.nextInt();
		distanciaHogsmeade = Math.sqrt((Math.pow(longitude-34, 2))+(Math.pow(latitude-220, 2)));
		distanciaKakariko = Math.sqrt((Math.pow(longitude-0, 2))+(Math.pow(latitude-0, 2)));
		distanciaSolitude = Math.sqrt((Math.pow(longitude-140, 2))+(Math.pow(latitude-456, 2)));
		System.out.printf("Distancia para Hogsmeade: %.2f\n", distanciaHogsmeade);
		System.out.printf("Distancia para Kakariko: %.2f\n", distanciaKakariko);
		System.out.printf("Distancia para Solitude: %.2f\n", distanciaSolitude);
		in.close();
  }
}