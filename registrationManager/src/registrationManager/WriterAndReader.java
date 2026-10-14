package registrationManager;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class WriterAndReader {
	
	private static final String archieveName = "alunos.csv";
	
	public void checkAndInitializeArchieve() {
		
		File archieve = new File(archieveName);
		
		if (!archieve.exists()) {
			
			try (PrintWriter writer = new PrintWriter(archieveName)) {
				writer.println("Matricula, Nome, E-mail, Status");
			} catch (FileNotFoundException e) {
				System.out.println("Erro ao criar o arquivo: " + e.getMessage());
			}
		}
	}
	
	public void write(String input) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(archieveName, true))) {
			writer.print(input + ",");
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo: " + archieveName + e.getMessage());
		}
	}
	
	public void writeStatus(Status status) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(archieveName, true))) {
			writer.print(status + "\n");
		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo: " + archieveName + e.getMessage());
		}
	}
}
