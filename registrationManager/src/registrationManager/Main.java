package registrationManager;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		boolean menu = true;
		Scanner option = new Scanner(System.in);
		
		Scanner studentInput = new Scanner(System.in);
		
		while(menu) {
			
			boolean menuRun = true;
		
			System.out.println("======  SISTEMA DE GESTAO ACADEMICA  ======");
			System.out.println("-------------------------------------------");
			System.out.println("\nMenu Principal\n");
			System.out.println("1. ........................ Cadastrar Aluno");
			System.out.println("2. ................. Listar todos os Alunos");
			System.out.println("3. ............. Buscar Aluno por Matricula");
			System.out.println("4. ........................ Atualizar Aluno");
			System.out.println("5. .......................... Remover Aluno");
			System.out.println("6. .......................... Salvar e Sair");
			System.out.println("7. .............. Apresentar Menu Novamente");
			System.out.println("-------------------------------------------");
			System.out.println("\nSelecione uma opção");
			
			while (menuRun) {
				if (!option.hasNextInt()) {
					System.out.println("Digite apenas numeros.");
					option.next();
				} else {
					int i = option.nextInt();
					
					switch (i) {
						case 1:
							RegisterStudent student = new RegisterStudent(studentInput);
							student.printInfo();
							menuRun = false;
							break;
						case 7:
							menuRun = false;
							break;
						default: System.out.println("Opcao invalida. Digite uma opcao de acordo com o Menu.");
					}
				}
			}
		}
		option.close();
	}
}
