import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int nDias;
		int nCasas;
		int nTicks;
		int nTicksPorCasa;
		nDias = in.nextInt();
		nCasas = in.nextInt();
		nTicks = nDias * 108000;
		nTicksPorCasa = nTicks / nCasas;
		System.out.println(nTicksPorCasa);
		in.close();
  }
}