import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
		int moedas;
		int precoVerde, precoVermelho, precoRoxo, precoAmarelo;
		int minPreco;
		double custoBenVerde, custoBenVermelho, custoBenRoxo, custoBenAmarelo; 
		moedas = in.nextInt();
		precoVerde = in.nextInt();
		precoVermelho = in.nextInt();
		precoRoxo = in.nextInt();
		precoAmarelo = in.nextInt();
		minPreco = Math.min(precoVerde, precoVermelho);
		minPreco = Math.min(minPreco, precoRoxo);
		minPreco = Math.min(minPreco, precoAmarelo);
		if (minPreco>moedas)
			System.out.println("Acho que vou a pe :(");
		else
		{
			custoBenVerde = 80/ precoVerde;
			custoBenVermelho = 100/ precoVermelho;
			custoBenRoxo = 120/ precoRoxo;
			custoBenAmarelo = 80/ precoAmarelo;
			if(custoBenVerde >= custoBenVermelho && custoBenVerde >= custoBenRoxo && custoBenVerde >= custoBenAmarelo && precoVerde <= moedas)
				System.out.println("Verde");
			else
			{
				if(custoBenVermelho >= custoBenRoxo && custoBenVermelho >= custoBenAmarelo && precoVermelho <= moedas)
					System.out.println("Vermelho");
				else
				{
					if(custoBenRoxo >= custoBenAmarelo && precoRoxo <= moedas)
						System.out.println("Roxo");
					else
						System.out.println("Amarelo");
				}		
			}
		} 		
		in.close();
  }
}