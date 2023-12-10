public class pi {
    public static void main(String[]args) {
        int num1 = 5; 
        int num2 = 10; 
        int num3 = 15; 
        int result1 = 0; 
        int result2 = 0; 
        int result3 = 0; 
        result1 = num1 + num2 + num3; 
        result2 = num1 * num2; 
        result3 = num3 / num1; 
        System.out.println("The answer for " + num1 + num2 + num3 + " is " + result1); 
        System.out.println("The answer for " + num1 + num2 + " is " + result2); 
        System.out.println("The answer for " + num1 + num3 + " is " + result3);
    }
}