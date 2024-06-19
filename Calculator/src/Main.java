import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char x = 'x';
        while (x=='x'){
            System.out.println("enter the symbol");
            char operator = scan.nextLine().charAt(0);
            System.out.println("enter the first number");
            double var1 = scan.nextDouble();
            System.out.println("enter the second number");
            double var2 = scan.nextDouble();

            switch(operator){
                case '+':
                    System.out.println(var1+var2);
                    break;
                case '-':
                    System.out.println(var1-var2);
                    break;
                case '*':
                    System.out.println(var1*var2);
                    break;
                case '/':
                    System.out.println(var1/var2);
                    break;


            }
            System.out.println("press any key to exit");
            System.out.println("press x to continue");
            x = scan.next().charAt(0);

        }

        scan.close();
    }
}
