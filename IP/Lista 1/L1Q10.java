import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		 int dt1M, dt2M, dt3M, dt4M, dstsM; 
		 int dt1T, dt2T, dt3T, dt4T, dstsT, dt1Y, dt2Y, dt3Y, dt4Y, dstsY;
		 String cv1M, cv2M, cv3M, cv4M;
		 String cv1T, cv2T, cv3T, cv4T,cv1Y, cv2Y, cv3Y, cv4Y;
		 String menor = "";
		 boolean mario =true;
		 boolean yoshi = true;
		 boolean toad = true;
		 cv1M = in.next();
		 dt1M = in.nextInt();
		 in.nextLine();
		 cv2M = in.next();
		 dt2M = in.nextInt();
		 in.nextLine();
		 cv3M = in.next();
		 dt3M = in.nextInt();
		 in.nextLine();
		 cv4M = in.next();
		 dt4M = in.nextInt();
		 in.nextLine();
		 dstsM = dt1M +dt2M +dt3M + dt4M;
		 cv1Y = in.next();
		 dt1Y = in.nextInt();
		 in.nextLine();
		 cv2Y = in.next();
		 dt2Y = in.nextInt();
		 in.nextLine();
		 cv3Y = in.next();
		 dt3Y = in.nextInt();
		 in.nextLine();
		 cv4Y = in.next();
		 dt4Y = in.nextInt();
		 in.nextLine();
		 dstsY = dt1Y +dt2Y +dt3Y + dt4Y;
		 cv1T = in.next();
		 dt1T = in.nextInt();
		 in.nextLine();
		 cv2T = in.next();
		 dt2T = in.nextInt();
		 in.nextLine();
		 cv3T = in.next();
		 dt3T = in.nextInt();
		 in.nextLine();
		 cv4T = in.next();
		 dt4T = in.nextInt();
		 dstsT = dt1T +dt2T+dt3T + dt4T;
		 if((cv1M.charAt(0)=='E' && cv2M.charAt(0)=='E' && cv3M.charAt(0)=='E')
		 || (cv2M.charAt(0)=='E' && cv3M.charAt(0)=='E' && cv4M.charAt(0)=='E')) {
			 mario = false;
			 System.out.println("Mario caiu em um buraco negro.");
		 }
		 if((cv1Y.charAt(0)=='E' && cv2Y.charAt(0)=='E' && cv3Y.charAt(0)=='E')
		 || (cv2Y.charAt(0)=='E' && cv3Y.charAt(0)=='E' && cv4Y.charAt(0)=='E')) {
			 yoshi = false;
			 System.out.println("Yoshi caiu em um buraco negro.");
		 }
		 if((cv1T.charAt(0)=='E' && cv2T.charAt(0)=='E' && cv3T.charAt(0)=='E')
		 || (cv2T.charAt(0)=='E' && cv3T.charAt(0)=='E' && cv4T.charAt(0)=='E')) {
			 toad = false;
			 System.out.println("Toad caiu em um buraco negro.");
		 }
		 if((dstsM<=dstsY && dstsM<=dstsT && mario)
		 || (dstsM<=dstsY && !toad && mario) || (dstsM<=dstsT && !yoshi && mario)
		 || (!yoshi && !toad))
			 menor = "Mario";
		 else if((dstsY<=dstsM && dstsY<=dstsT && yoshi)
		 || (dstsY<=dstsM && !toad && yoshi) || (dstsY<=dstsT && !mario && yoshi)
		 || (!mario && !toad))
			 menor = "Yoshi";
		 else
			 menor ="Toad";
		 System.out.println(menor + " venceu a corrida!");
		 in.close();
  }
}