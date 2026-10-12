package test;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class TestSetName {
	
	String name;
	
	public String setRegister() {
		Random random = new Random();
		int currentYear = Year.now().getValue();
		int sequential = random.nextInt(100000);
		
		return String.format("%d%06d", currentYear, sequential);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		TestSetName name = new TestSetName();
		
		String name2 = name.setRegister();
		
		System.out.println("Your name: " + name2);
	}
}
