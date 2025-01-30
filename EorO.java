import java.util.*;
public class EorO {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);{
            System.out.println("Enter any value: ");
            int num=src.nextInt();
            String result =(num % 2== 0)?"Even":"Odd";
            System.out.println("The value "+num+" is "+result);
            src.close();
        }
    }
}
