package Application;

public class CalculatorApp {
    public int summ(int a, int b){
        int c = a + b;
        System.out.println("Результат = " + c);
        return c;
    }
    public int menos(int a, int b){
        int c = a - b;
        System.out.println("Результат = "+ c);
        return c;
    }
    public int multiply(int a, int b){
        int c = a * b;
        System.out.println("Результат = "+ c);
        return c;
    }
    public int delenie(int a, int b){
        int c = a / b;
        System.out.println("Результат = "+ c);
        return c;
    }

    public static void main(String[] args) {
        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.summ(3,3);
        calculatorApp.menos(3,3);
        calculatorApp.multiply(3,3);
        calculatorApp.delenie(3,3);
    }
}
