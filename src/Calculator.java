import javax.swing.JFrame;
import java.util.Scanner;

public class Calculator extends JFrame{

    public void init() {
        int n1;
        int n2;
        int n3;
        int cal;
        int quotient;
        int remainder;

        System.out.println("Enter two numbers: ");
        Scanner r = new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1 = r .nextInt();
        System.out.println("Enter second number: ");
        n2 = r .nextInt();
        System.out.println("Select operation");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("Enter operation number");
        Scanner s = new Scanner(System.in);
         n3 = s .nextInt();


         if (n3 == 1) {
            
        }

    }
    
}
