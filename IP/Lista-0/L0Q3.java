import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int lado;
		int altura;
		int volume;
		lado = in.nextInt();
		altura = in.nextInt();
		volume = (lado * lado) * altura;
		System.out.println(volume);
		in.close();
  }
}