import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int min;
		min = in.nextInt();
		if(min>100)
			System.out.println("Nenhum");
		else
			if(min<=10)
				System.out.println("Arthur");
			else
				if(min<=30)
					System.out.println("Luiz");
				else
					if(min<=100)
						System.out.println("Pedro");
		in.close();
  }
}