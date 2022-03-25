package Application;
import java.util.Scanner;
import Program.Program_Destino;
import Program.Program_Pacote;

public class Main {
	public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);        
		Boolean opcao = true;
		do {	
			
			System.out.println("1 - Destino");
			System.out.println("2- Pacotes");
			System.out.println("3 - Sair");
			
			int op = entrada.nextInt();		
			
			Program_Destino destino = new Program_Destino();
			Program_Pacote pacote = new Program_Pacote();

			
			
			switch (op) {			
			case 1:				
				destino.Menu();			
				break;
			case 2:			
				pacote.Menu();				
				break;	
			case 3:				
				System.out.println("------------------");
				System.out.println("|  volte sempre! |");
				System.out.println("------------------");
				System.exit(op);
				break;
			default: System.out.println("Opçção inválida!");
				break;
			}
		} while (opcao);
	}
	
	
	
	}


