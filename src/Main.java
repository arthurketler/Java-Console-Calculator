import java.util.Scanner;

public class Main {
    public static Scanner sc =  new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Seja bem vindo à calculadora.");
        while (true) {
            // get the operation
            Calculator.printOptions();
            String operation = sc.nextLine();
            
            // checks the operation
            if (operation.length() != 1 || "asmd".indexOf(operation.charAt(0)) == -1 ) {
                System.out.println("Inválido");
                line();
                continue;
            }
            
            // get the numbers
            System.out.println("Digite o primeiro número:");
            double num1 = getNumberInput();
            
            System.out.println("Digite o segundo número:");
            double num2 = getNumberInput();
            
            // calculates
            double result = Calculator.calculateResult(operation.charAt(0), num1, num2);
            
            // prints the result
            if (operation.charAt(0) == 'd' && num2 == 0.0) {
                System.out.println("Divisão por zero");
                line();
                continue;
            }
            
            System.out.printf("O resultado é %f%n", result);
            line();
        }
    }
    
    /**
     * Gets a single number to be calculated
     * A general Scanner is needed
     * @return The number
     */
    public static double getNumberInput() {
        double num;
        
        while (true) {
            String entry = sc.nextLine();
            
            try {
                num = Double.parseDouble(entry);
            } catch (NumberFormatException e) { // In case invalid
                System.out.println(entry.isEmpty() ? "Vazio" : "Formato inválido");
                continue;
            }
            
            break;
        }
        
        return num;
    }
    
    /**
     * Prints a standard line
     */
    public static void line() {
        System.out.println("-".repeat(35));
    }
}
