package Util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DocumentWriter {

	public void write(String fileName, String fileText) {
		try {
			// Cria o FileWriter para escrever no arquivo
			FileWriter fw = new FileWriter(fileName, true);
			// Cria um PrintWriter para escrever no arquivo
			PrintWriter pw = new PrintWriter(fw);
			// Escreve a linha no arquivo e pula para a próxima linha
			pw.println(fileText);
			// Fecha o PrintWriter
			pw.close();

			// Erro de acesso IO
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
