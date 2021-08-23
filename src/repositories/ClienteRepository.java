package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	// método para exportar os dados do
	// cliente para um arquivo de extensão .TXT
	public void gravarArquivo(Cliente cliente) throws Exception {

		//criando um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter(new File("c:\\temp\\cliente.txt"));
		
		//escrever os dados do cliente no arquivo..
		printWriter.write("\nDADOS DO CLIENTE:");
		printWriter.write("\n\tId do Cliente......: " + cliente.getIdCliente());
		printWriter.write("\n\tNome do Cliente....: " + cliente.getNome());
		printWriter.write("\n\tEmail do Cliente...: " + cliente.getEmail());
		printWriter.write("\n\tCPF do Cliente.....: " + cliente.getCpf());
		
		//salvar e fechar o arquivo
		printWriter.flush(); //salva
		printWriter.close(); //fecha
	}
}