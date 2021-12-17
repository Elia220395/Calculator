import java.util.Scanner;

public class Main {
    public static void promt(){System.out.println("Enter a number");}
    public static int parse(String a){int b = Integer.parseInt(a);
    return b;
    }
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Subtraction,Addition,Multiplication,Division?");
    String type=scan.nextLine();

    if (type.equals("Subtraction")){
        promt();
        String num1 = scan.nextLine();
        promt();
        String num2 = scan.nextLine();
        System.out.println(parse(num1)- parse(num2));
        }
        else if (type.equals("Addition")){
            promt();
            String num1 = scan.nextLine();
            promt();
            String num2 = scan.nextLine();
            System.out.println(parse(num1)+ parse(num2));
        }
    else if (type.equals("Multiplication")){
        promt();
        String num1 = scan.nextLine();
        promt();
        String num2 = scan.nextLine();
        System.out.println(parse(num1)* parse(num2));
    }
    else if (type.equals("Division")){
        promt();
        String num1 = scan.nextLine();
        promt();
        String num2 = scan.nextLine();
        System.out.println(parse(num1)/ parse(num2));
    }
    }
}
