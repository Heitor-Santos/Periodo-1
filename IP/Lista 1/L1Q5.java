import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int x, y, z, a, b, c;
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		if(x>=y && x>=z) {
			a = x;
			if(y>=z) {
				b = y;
				c = z;
			}
			else {
				b = z;
				c = y;
			}
		}
		else if(y>=x && y>=z) {
			a = y;
			if(x>=z) {
				b = x;
				c = z;
			}
			else {
				b = z;
				c = x;
			}
		}
		else{
			a = z;
			if(x>=y) {
				b = x;
				c = y;
			}
			else {
				b = y;
				c = x;
			}
		}
		System.out.printf("%d %d %d",a ,b ,c);
		in.close();
  }
}