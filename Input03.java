import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scan = new Scanner(System.in);
        
        //Find and print the sum of three integers entered by the
        System.out.println("Enter 3 numbers separated by a single space: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("Sum of number entered: " + (num1 + num2 + num3));
        
        //Remember to close the Scanner
        scan.close();
        
    }
}
