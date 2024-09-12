import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chatbot chatbot = new Chatbot();

        System.out.println("Olá! Eu sou um chatbot. Como posso ajudar você hoje?");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Até logo!");
                break;
            }
            String response = chatbot.getResponse(input);
            System.out.println(response);
        }

        scanner.close();
    }

    public String getResponse(String input) {
        if (input.contains("olá")) {
            return "Olá! Como posso ajudar você?";
        } else if (input.contains("como você está")) {
            return "Eu estou bem, obrigado por perguntar!";
        } else if (input.contains("qual é seu nome")) {
            return "Eu sou um chatbot sem nome.";
        } else {
            return "Desculpe, não entendi sua pergunta.";
        }
    }
}
