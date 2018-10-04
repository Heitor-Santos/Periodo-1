import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		String pes1, pes2, pes3, pes4, pes5, pos1, pos2, pos3, pos4, pos5;
		pes1 = in.nextLine();
		pes2 = in.nextLine();
		pes3 = in.nextLine();
		pes4 = in.nextLine();
		pes5 = in.nextLine();
		pos1 = pes1;
		pos2 = pos3 = pos4 = pos5 ="";
		if(pes2.equals("Mario") ||pes4.equals("Mario")) {
			pos2 = "Mario";
			if(pes2.equals("Toad") ||pes4.equals("Toad")) {
				pos4="Toad";
				pos3="Luigi";
				pos5="Yoshi";
			}		
			else if(pes2.equals("Luigi") ||pes4.equals("Luigi")) {
				pos4 ="Luigi";
				pos3="Toad";
				pos5="Yoshi";
			}
			else if(pes2.equals("Yoshi") ||pes4.equals("Yoshi")) {
				pos4="Yoshi";
				pos3="Toad";
				pos5="Luigi";
			}
		}
		else {
			pos3 = "Mario";
			if(pes3.equals("Toad") ||pes5.equals("Toad")) {
				pos5="Toad";
				pos2="Luigi";
				pos4="Yoshi";
			}		
			else if(pes3.equals("Luigi") ||pes5.equals("Luigi")) {
				pos5 ="Luigi";
				pos2="Toad";
				pos4="Yoshi";
			}
			else if(pes3.equals("Yoshi") ||pes5.equals("Yoshi")) {
				pos5="Yoshi";
				pos2="Toad";
				pos4="Luigi";
			}
		}
		System.out.println(pos1 + "\n" +pos2 + "\n" +pos3 + "\n" +pos4 + "\n" +pos5);
		in.close();
  }
}