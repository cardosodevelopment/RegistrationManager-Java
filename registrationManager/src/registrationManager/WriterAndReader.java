package registrationManager;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class Reader {

	public Reader() {
		
	}
	
	public void read(String scan) {
//		RegisterStudent student = new RegisterStudent();
		File archieve = new File("alunos.csv");
		
		try (PrintWriter writer = new PrintWriter(archieve)) {
			
			// write the header
			writer.println("====== Lista de Alunos Cadastrados ======");
			writer.println(" Matricula	| Nome	| E-mail	| Status	");
			writer.println("%s" + scan + "%s" + scan);
			

		} catch (FileNotFoundException e) {
			System.out.println("Erro ao criar o arquivo: " + e.getMessage());
		}
	}
}
