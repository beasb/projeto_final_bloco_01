package lojaP;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import lojaP.controller.PerfumeController;
import lojaP.model.Perfume;
import lojaP.model.PerfumeAmbiente;

public class Perfumaria {

	public static void main(String[] args) {

		int cod, tipo;
		String nome, marca, ambiente;
		Double preco;
		
		PerfumeController perfume = new PerfumeController();

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nSaindo..");
				leia.close();
				System.exit(0);
			}

			
			switch (opcao) {

			case 1:
				System.out.println("Cadastrar Perfume \n\n");
				
				System.out.println("\nDigite o codigo do Perfume: ");
				cod = leia.nextInt();
				leia.nextLine(); 
				System.out.println("\nDigite o nome do Perfume: ");
				nome = leia.nextLine();
				System.out.println("\nDigite a marca do Perfume: ");
				marca = leia.nextLine();
				System.out.println("\nDigite o preco do Perfume: ");
				preco = leia.nextDouble();
				
				ambiente = "";
				
				do {
					System.out.println("\nDigite o tipo do Perfume: (1- Eau Toilette ou 2- Ambiente) ");
					tipo = leia.nextInt();
				}while(tipo < 1 || tipo > 2);
				
				switch (tipo) {
				case 1 -> {
			         perfume.cadastrar(new Perfume(cod, nome, marca, tipo, preco));
				}
				case 2 -> {
			         perfume.cadastrar(new PerfumeAmbiente(cod, nome, marca, tipo, preco, ambiente));
			         ambiente = leia.nextLine();
				}
				}
					
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os Perfumes \n\n");
				perfume.listarTodas();
				keyPress();
				break;
			case 3:
				System.out.println("Buscar Perfume por Código\n\n");
				
				System.out.println("Digite o Código: ");
				cod = leia.nextInt();
				
				perfume.procurarPorCod(cod);
				
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar os Dados do Perfume\n\n");
				
				System.out.println("\nDigite o Código do Perfume: ");
				cod = leia.nextInt();
				
				Perfume buscaPerfume = perfume.buscarCod(cod);
				
				tipo = buscaPerfume.getTipo();
				
				leia.nextLine();
				System.out.println("\nDigite o novo nome do Perfume: ");
				nome = leia.nextLine();
				System.out.println("\nDigite a nova marca do Perfume: ");
				marca = leia.nextLine();
				System.out.println("\nDigite o novo preco do Perfume: ");
				preco = leia.nextDouble();
				
				ambiente = "";
				
				do {
					System.out.println("\nDigite o novo tipo do Perfume: (1- Eau Toilette ou 2- Ambiente) ");
					tipo = leia.nextInt();
				}while(tipo < 1 || tipo > 2);
				
				switch (tipo) {
				case 1 -> {
			         perfume.atualizar(new Perfume(cod, nome, marca, tipo, preco));
				}
				case 2 -> {
			         perfume.atualizar(new PerfumeAmbiente(cod, nome, marca, tipo, preco, ambiente));
			         ambiente = leia.nextLine();
				}
				}
				
				
                perfume.atualizar(new Perfume(cod, nome, marca, tipo, preco));
				
				keyPress();
				break;
			case 5:
				System.out.println("Apagar a Cadastro do Perfume\n\n");
				
				System.out.println("Digite o Código do Perfume: ");
				cod = leia.nextInt();
				
				perfume.deletar(cod);
				
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}

		}

	}

	public static void keyPress() {

		try {
			System.out.println("Pressione Enter para Continuar..");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
	}

}
