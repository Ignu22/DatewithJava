import java.util.Scanner;
public class Details{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String a =s.nextLine();
        System.out.println("Enter Age");
        int b =s.nextInt();
        s.nextLine();
        System.out.println("Enter your stream");
        String c= s.nextLine();
        System.out.println("Enter your place");
        String d=s.nextLine();
        System.out.println("Details Given");
        System.out.println("I am "+a+","+b+"years old.\nI am from "+d+" and studying "+c);

    }
}