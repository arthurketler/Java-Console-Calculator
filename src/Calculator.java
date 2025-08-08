//package
public class Calculator {
    
    /**
     * Simply prints the calculator options
     * Simplesmente imprime as opcoes de calculo
     */
    public static void printOptions() {
        System.out.println("Digite a operação desejada:");
        System.out.println("(a)dição");
        System.out.println("(s)ubtração");
        System.out.println("(m)ultiplicação");
        System.out.println("(d)ivisão");
    }
    
    private static double addition(double x, double y) {
        return x + y;
    }
    
    private static double subtraction(double x, double y) {
        return x - y;
    }
    
    private static double multiplication(double x, double y) {
        return x * y;
    }
    
    private static double division(double x, double y) {
        // Even though treated in Main, deals with division by zero.
        return y == 0 ? 0 : ((double) x / (double) y);
    }
    
    /**
     * Multiplies the numbers based on the selected operation.
     * Multiplica os numeros baseado na operacao selecionada.
     * @param operation char that selects the operation to be done
     * @param num1 first number
     * @param num2 second number (in a division the first is divided by the second)
     * @return returns the result
     */
    public static double calculateResult(char operation, double num1, double num2) {
        return switch (operation) {
            case 'a' -> Calculator.addition(num1, num2);
            case 's' -> Calculator.subtraction(num1, num2);
            case 'm' -> Calculator.multiplication(num1, num2);
            case 'd' -> Calculator.division(num1, num2);
            default -> 0; // default to 0
        };
    }
}
