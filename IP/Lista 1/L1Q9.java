import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in =new Scanner(System.in);
        int comp, larg, cdndX, cdndY;
        String tipoLance;
        comp = in.nextInt();
        larg  = in.nextInt();
        in.nextLine();
        tipoLance = in.nextLine();
        cdndX = in.nextInt();
        cdndY = in.nextInt();
        if(tipoLance.equals("Saque")){
            if((cdndX < comp/2) && (cdndX >= (comp/4)) && (cdndY>=0) &&(cdndY<=larg))
                System.out.println("A bola foi rebatida");
            else
                System.out.println("A bola foi para fora");
        }
        else{
            if((cdndX < comp/2) && (cdndX >= 0) && (cdndY>=0) &&(cdndY<=larg))
                System.out.println("A bola foi rebatida");
            else
                System.out.println("A bola foi para fora");
        }
        in.close();
  }
}