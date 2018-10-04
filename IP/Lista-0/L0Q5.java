import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int diamantesArthur;
		int diamantesLuiz;
		int diamantesPedro;
		int horas;
		int max;
		diamantesArthur = in.nextInt();
		diamantesLuiz = in.nextInt();
		diamantesPedro = in.nextInt();
		horas = in.nextInt();
		max = (diamantesArthur + diamantesLuiz + (Math.abs(diamantesArthur - diamantesLuiz))) / 2;
		max = (max + diamantesPedro + (Math.abs(max - diamantesPedro))) / 2;
		max *= horas;
		System.out.println(max);
		in.close();
  }
}