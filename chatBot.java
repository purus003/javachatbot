import java.util.Scanner;
class chatBot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! I'm your simple chabot");
		System.out.println("what's you name?");
		String name = sc.next();
		System.out.println("Nice to meet you Mr/Ms " + name +"   thanks for choosing \n how can i help you");

		while(true){
			System.out.println("What would you like to talk about? (type 'exit' to quit)");
			String userInput =sc.nextLine();
			 if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye, " + name + "! Have a great day!");}
			 else {
                String response = getResponse(userInput);
                System.out.println(response);
            }
		}
	}
	public static String getResponse(String input){
		 if (input.contains("how are you")) {
            return "I'm just a computer program, so I don't have feelings, but thanks for asking!";
        } 
		 else if (input.contains("weather")) {
            return "I'm sorry, I can't provide weather updates.";
		 }
		 else if (input.contains("joke")) {
            return "your so cute and handsome.";
		 }
		  else if (input.contains( "wanna be friends")) {
            return "We are already friends";
		 }
		 else {
            return "Sorry, I'm not sure how to respond to that.";
        }
	}
}
