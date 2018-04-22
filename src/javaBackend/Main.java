package javaBackend;

public class Main {
	
	public static void main(String [] args)
	{
		System.out.println("Enter the command: ");
		
		String input = System.console().readLine();
			
		if (input != "exit") {
			String[] parts = input.split(" ");
			
			if (parts.length > 1) {
				if (parts[0].matches(".*?echo.*?")) {
					for (int i = 1; i < parts.length; i++)
					System.out.println(parts[i]);
				}
			}
		} else {
			
		}
	}

}

