import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int ferro;
		int resposta;
		int resto;
		Scanner in = new Scanner(System.in);
		ferro = Integer.parseInt(in.nextLine().toString()) ;
		resposta = ferro / 3;
		resto = ferro % 3;
		System.out.printf ("%d\n%d", resposta, resto);
		in.close();
  }
}