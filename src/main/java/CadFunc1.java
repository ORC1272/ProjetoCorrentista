import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class CadFunc1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		ArrayList<CadastroCliente> cadastroCliente = new ArrayList();

		String ag = null;
		String conta = null;
		String nome = null;
		String email = null;
		String fone = null;
		String saldo = null;
		String opcao;

	

		boolean rodando = true;

		while (rodando) {
			System.out.println("\t === Opções do Cadastrados de Correntistas ===");
			System.out.println("[1] Cadastrar correntista.");
			System.out.println("[2] Visualizar cadastro de correntistas.");
			System.out.println("[3] Localizar correntista por nome.");
			System.out.println("[4] Atualizar nome do correntista. ");
			System.out.println("[5] Excluir correntista. ");
			System.out.println("[6] Sair do programa. ");
			System.out.println("\t Digite a opção: ");
			System.out.println(" ");
			opcao = ler.nextLine();

			
			switch (opcao) {

			case "1": {
				System.out.println("=== Cadastro de Correntista ===");
				System.out.print("\t Nome do cliente: ");
				nome = ler.nextLine();

				System.out.print("\t Agência: ");
				ag = ler.nextLine();

				System.out.print("\t Número da conta: ");
				conta = ler.nextLine();

				System.out.print("\t Fone: ");
				fone = ler.nextLine();

				System.out.print("\t Email: ");
				email = ler.nextLine();

				System.out.print("\t Saldo: ");
				saldo = ler.nextLine();
				System.out.println(" ");

				CadastroCliente c = new CadastroCliente();
				c.setNome(nome);
				c.setAg(ag);
				c.setConta(conta);
				c.setFone(fone);
				c.setEmail(email);
				c.setSaldo(saldo);
				System.out.println(" ");
				cadastroCliente.add(c);
				break;
			}
			

			
			case "2": {
				
				for (int i = 0; i < cadastroCliente.size(); i++) {

					CadastroCliente uTemp = cadastroCliente.get(i);
					System.out.print(" ");
					System.out.print("\t"+cadastroCliente.get(i).getNome());
					System.out.print("\t"+cadastroCliente.get(i).getAg());
					System.out.print("\t"+cadastroCliente.get(i).getConta());
					System.out.print("\t"+cadastroCliente.get(i).getFone());
					System.out.print("\t"+cadastroCliente.get(i).getEmail());
					System.out.print("\t"+cadastroCliente.get(i).getSaldo());
					System.out.print(" ");
					
					CadastroCliente executa = new CadastroCliente();
					executa.mensagem(nome, ag, conta, email, fone,saldo);
									 
							 
				 }
				FileWriter executar = new
						 FileWriter("C:\\Users\\cristiano\\.swt\\Desktop\\cadastroCliente.txt");
						 PrintWriter gravarArquivo = new PrintWriter(executar);
						 gravarArquivo.println("Registros dos correntistas%n");
						 gravarArquivo.println("Imprimir correntistas"+"%n"); 
						 for (int i = 0; i <cadastroCliente.size(); i++) { 
							 CadastroCliente uTemp = cadastroCliente.get(i); 
							 gravarArquivo.println("[" +i+"]" + uTemp.getNome()+"   "+ uTemp.getAg()+"   "+ uTemp.getConta()+"   "+ uTemp.getSaldo()+"   "+ uTemp.getFone()+"   "+ uTemp.getEmail());
											 													 
							}
						executar.close();
				}break;
			
			
			
			case "3": {
				System.out.println("\t === Localizar Correntistas por Nome ===");
				System.out.print("\t Digite o nome do correntista : ");
				nome = ler.nextLine();
				
				boolean encontrado = false;
				for (int i = 0; i < cadastroCliente.size(); i++) {
					CadastroCliente uTemp = cadastroCliente.get(i);
					if(nome.equals(uTemp.getNome())) {
						System.out.print("Correntista encontrado ");
						System.out.print("\t nome: "+uTemp.getNome());
						System.out.print("\t nome: "+uTemp.getAg());
						System.out.print("\t nome: "+uTemp.getConta());
						System.out.print("\t nome: "+uTemp.getSaldo());
						encontrado=true;
						break;
						}
				}
				if(!encontrado) {
					System.out.println("Correntista não encontrado");
					
				}break;
			}
			
			case "4": {
				System.out.println("\t === Atualizar Nome do Correntistas ===");
				for (int i = 0; i < cadastroCliente.size(); i++) {
					CadastroCliente uTemp = cadastroCliente.get(i); 
					System.out.println("[" +i+"]" + uTemp.getNome());
				}
				System.out.print("Digite codigo referência do correntista");
				int ref = ler.nextInt();
				ler.nextLine();
							
				System.out.println("Digite o nome atualizado do correntista");
				String novoNome=ler.nextLine();
				CadastroCliente c= cadastroCliente.get(ref);
				c.setNome(novoNome);
				break;
				}
			
				
						
			case "5": {
				System.out.println("\t === Excluir Correntistas ===");
				for (int i = 0; i < cadastroCliente.size(); i++) {
					CadastroCliente uTemp = cadastroCliente.get(i); 
					System.out.println("[" +i+"]" + uTemp.getNome());
				}
				System.out.println("Digite o valor de referência do correntista");
				int ref = ler.nextInt();
				ler.nextLine();
				cadastroCliente.remove(ref);
				
			}break;
			
				
			case "6": {
				System.out.println("\t === Sair do Programa ===");
				rodando = false;
				break;
			}
			}
											

			} 
		}
		
		}
	


	

		
	
	
	


	




	


