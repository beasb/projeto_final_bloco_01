package lojaP;

import java.util.Scanner;
import lojaP.model.Perfume;
import lojaP.model.PerfumeAmbiente;

public class Perfumaria {

	public static void main(String[] args) {
		
		Perfume p1 = new Perfume(02, "Mad", "Chanel", "Eau Toilette", 1500.0);
		p1.visualizar();
		
		PerfumeAmbiente p2 = new PerfumeAmbiente(12, "Ross", "Le Labo", "Eau Toilette", 3500.0, "Cozinha");
		p2.visualizar(); 

		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
		
			System.out.println("****************************************************");
			System.out.println("**            Perfumaria PAR                      **");
			System.out.println("****************************************************");
			System.out.println("                                                    ");
			System.out.println("              1 - Cadastrar Perfume                 ");
			System.out.println("              2 - Listar todos os Perfumes          ");
			System.out.println("              3 - Buscar Perfume por Código         ");
			System.out.println("              4 - Atualizar Dados do Perfume        ");
			System.out.println("              5 - Apagar Cadastro do Perfume        ");
			System.out.println("              6 - Sair                              ");
			System.out.println("                                                    ");
			System.out.println("****************************************************");
			System.out.println("**           Entre com a opção desejada:          **");
			System.out.println("                                                    ");
			opcao = leia.nextInt();
			
			if (opcao == 6) {
				System.out.println("\nSaindo..");
				leia.close();
				System.exit(0);
			}

switch (opcao) {
			
			case 1:
				System.out.println("Cadastrar Perfume \n\n");
				break;
			case 2:
				System.out.println("Listar todos os Perfumes \n\n");
				break;
			case 3:
				System.out.println("Buscar Perfume por Código\n\n");
				break;
			case 4:
				System.out.println("Atualizar os Dados do Perfume\n\n");
				break;
			case 5:
				System.out.println("Apagar a Cadastro do Perfume\n\n");
				break;
			default:
				System.out.println( "\nOpção Inválida!\n");
				break;
			}
		}
		
	}

}
