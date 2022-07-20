import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.Sum \n2.Difference\n3.Multiply\n4.Division");
        System.out.println("Enter your choice....");
        int ch =sc.nextInt();
        switch(ch){
            case 1: 
                   System.out.println(a+b);
                    break;
            case 2:
            System.out.println(a-b);
            break; 
            case 3: 
            System.out.println(a*b);
                    break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid choice");
        }

        
    }
    
}