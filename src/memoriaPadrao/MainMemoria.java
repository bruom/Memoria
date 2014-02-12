package memoriaPadrao;

import java.util.Scanner;

public class MainMemoria {

	//LETS DO THIS
	
	public static void main(String[]args){		

		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Jogo da mem�ria v.0.1-HUE.");
		
		System.out.println("Escolha o n�mero de pares");
		int nPairs = stdin.nextInt();
		
		Game jogo = new Game(nPairs);
		
		do{
			jogo.showOptions();
			
			System.out.println("\nEscolha uma carta para revelar.");
			jogo.pickCard(stdin.nextInt());
			
			jogo.showOptions();
			System.out.println("Escolha agora a segunda carta.");
			jogo.pickCard(stdin.nextInt());
			
			jogo.checkPair();
		}while(jogo.GG()==false);
		
	}
	
	
}
