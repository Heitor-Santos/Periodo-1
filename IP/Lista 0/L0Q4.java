import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String nome;
		String sobrenome;
		String nickname;
		nome = in.nextLine();
		sobrenome = in.nextLine();
		nickname = nome+sobrenome;
		System.out.print(nickname);
		in.close();
  }
}