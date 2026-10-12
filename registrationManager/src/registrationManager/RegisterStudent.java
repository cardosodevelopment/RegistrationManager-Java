package registrationManager;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.time.Year;

public class RegisterStudent {
	
	ArrayList<String> student = new ArrayList<String>();
	Reader reader = new Reader();
	String register;
	String name;
	String email;
	String course;
	Status status;
	
	public RegisterStudent(Scanner input) {
		System.out.println("=== Cadastro de Novo Aluno ===");
		this.name = setName(input);
		reader.read(this.name);
		this.email = setEmail(input);
		reader.read(this.email);
		this.status = setStatus(input);
		this.register = setRegister();

		System.out.println("Sucesso");
	}
	
	public RegisterStudent() {
		
	}
	
	public String setRegister() {
		Random random = new Random();
		int currentYear = Year.now().getValue();
		int sequential = random.nextInt(100000);
		
		register = String.format("%d%06d", currentYear, sequential);
		
		return register;
	}
	
	public String setName(Scanner input) {
		boolean run = true;
		
		System.out.print("Digite o nome do aluno: ");
		String scan = input.nextLine();
		
		while (run) {
			if (scan.isBlank()) {
				System.out.println("Entrada invalida. O nome nao pode estar em branco.");
				scan = input.nextLine();
			} else {
				name = scan;
				run = false;
			}
		}
		return name;
	}
	
	public String setEmail(Scanner input) {
		
		boolean run = true;
		
		// the sequence to search for
		String s = "@";
		String a = ".com";
		
		System.out.print("Digite o email do aluno: ");
		String scan = input.nextLine();
		
		while (run) {
			if (scan.isBlank()) {
				System.out.println("Entrada invalida. O endereco de email nao pode estar em branco.");
				scan = input.nextLine();
			} else if ((!scan.contains(s)) || ((!scan.contains(a)))) {
				System.out.println("Entrada invalida. O endereco de email deve conter '@'");
				scan = input.nextLine();
			} else {
				email = scan;
				run = false;
			}
		}
		return email;
	}
	
	public Status setStatus(Scanner input) {
		
		boolean run = true;
		
		System.out.print("Selecione o status (1 - ATIVO, 2 - CONCLUIDO, 3 - TRANCADO): ");
		
		while (run) {
			int i = input.nextInt();
		
			switch (i) {
				case 1:
					status = Status.ATIVO;
					run = false;
					break;
				case 2:
					status = Status.CONCLUIDO;
					run = false;
					break;
				case 3:
					status = Status.TRANCADO;
					run = false;
					break;
				default: System.out.print("Status invalido. Digite novamente.");
			}
		}
		return status;
	}
	
	public void printInfo() {
		
		System.out.println("Aluno: " + name);
		System.out.println("Matricula: " + register);
		System.out.println("Email: " + email);
		System.out.println("Status da matricula: " + status + "\n");
		
	}

}
