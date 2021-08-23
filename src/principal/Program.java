package principal; //identifica��o do pacote

import entities.Cliente;
import repositories.ClienteRepository;

//Defini��o da classe
//public -> define a visibilidade da classe (acesso total)
public class Program {

	//m�todo (fun��o) que ter� a responsabilidade
	//de executar o projeto (rodar o projeto)
	public static void main(String[] args) {
		
		//impress�o no console
		//syso + CTRL + ESPA�O
		System.out.println("Aula 01 - JAVA WEBDEVELOPER");
		
		Cliente cliente = new Cliente();
		
		//entrada de dados
		cliente.setIdCliente(1);
		cliente.setNome("Sergio Mendes");
		cliente.setEmail("sergio.coti@gmail.com");
		cliente.setCpf("123.456.789-00");

		//imprimindo os valores
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("\tId do Cliente......: " + cliente.getIdCliente());
		System.out.println("\tNome do Cliente....: " + cliente.getNome());
		System.out.println("\tEmail do Cliente...: " + cliente.getEmail());
		System.out.println("\tCPF do Cliente.....: " + cliente.getCpf());
		
		//criando um objeto para a classe ClienteRepository
		ClienteRepository clienteRepository = new ClienteRepository();
		
		try {
			clienteRepository.gravarArquivo(cliente);
			System.out.println("\nDados gravados com sucesso!");
		}
		catch(Exception e) {
			System.out.println("\nErro ao gravar arquivo!");
			System.out.println(e.getMessage());
		}
		
	}
	
}
