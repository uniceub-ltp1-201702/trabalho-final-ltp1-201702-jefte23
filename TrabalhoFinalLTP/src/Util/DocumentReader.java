package Util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DocumentReader {

	public ArrayList<String> read(String fileName) {
		// Cria o ArrayList de retorno
		ArrayList<String> fileLines = new ArrayList<String>();

		try {
			// Cria o FileReader com o nome do arquivo
			FileReader fr = new FileReader(fileName);
			// Cria o Buffer de leitura
			BufferedReader br = new BufferedReader(fr);
			// L� a primeira linha
			String line = br.readLine();
			// Enquanto ainda existirem linhas
			while (line != null) {
				// Adiciona a linha lida no ArrayList
				fileLines.add(line);
				// L� a pr�xima linha
				line = br.readLine();
			}
			// Fechar o Buffer de leitura
			br.close();

			// Erro de arquivo n�o encontrado
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// Erro de exce��o de IO
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Retorna o Arraylist com todas as linhas
		return fileLines;
	}
}
