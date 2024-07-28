package pack1;
import java.util.Scanner;

public class Chatbot { 
	
	      public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Welcome to the chatbot! Type 'quit' to exit.");

		     while (true) {
		    System.out.print("You: ");
		      String userInput = scanner.nextLine();

		    if (userInput.equalsIgnoreCase("quit")) {
	        break;
     }

		    String response = getResponse(userInput);
		            System.out.println("Chatbot: " + response);
   }

		        scanner.close();
		 }

		    public static String getResponse(String userInput) {
		        if (userInput.contains("hello") || userInput.contains("hi")) {
		            return "Hello! How can I help you today?";
		        } else if (userInput.contains("how are you")) {
		            return "I'm doing well, thanks for asking!";
		        } else if (userInput.contains("what is your name")) {
		            return "My name is Chatbot!";
		        } else {
		            return "I didn't understand that. Can you please rephrase?";
		        }
		    }
		}


 
