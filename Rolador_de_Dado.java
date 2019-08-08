package rolador_de_dados;


import java.util.Random;
import java.util.Scanner;

public class Rolador_de_Dado {

	public static void main(String[] args) {
	
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		
	do {	
		System.out.println("\n\n------ Escolha um dado ------\n\n");
		
		System.out.println("(1):D4 \n(2):D6 \n(3):D8\n(4):D10\n(5):D12\n(6):D20\n(0)Sair");
		int dados = sc.nextInt();
		
			switch(dados) {
			case 1:
					int d4 = r.nextInt(4);
				System.out.println("\n Resultado D12 = " + d4 + "\n");
					break;
			case 2:
					int d6 = r.nextInt(6);
				System.out.println("\n Resultado D12 = " + d6 + "\n");
					break;
					
			case 3:
					int d8 = r.nextInt(8);
				System.out.println("\n Resultado D12 = " + d8 + "\n");
					break;
					
			case 4:
					int d10 = r.nextInt(10);
				System.out.println("\n Resultado D12 = " + d10 + "\n");
					break;

			case 5:
					int d12 = r.nextInt(12);
				System.out.println("\n Resultado D12 = " + d12 + "\n");
					break;
					
			case 6:
					int d20 = r.nextInt(20);
				System.out.println("\n Resultado D20 = " + d20 + "\n");
					break;
				
		default:
					if(dados >6 || dados == 0) {
				System.out.println("Invalido");
					break;
				
				}
			}
			}while(r == r);
	}
}
	
	
	
	
	
	
	
	
	