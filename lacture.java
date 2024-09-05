import java.util.*;
public class lacture{
    public static void main(String[] args) {


        System.out.println("enter a number, name, cgpa");
        Scanner in=new Scanner(System.in);// predefined class name is always capital 


        int a;
        a= in.nextInt();    //method name start from small and second words begin with capital
        System.out.println(a);

        
        String bb; 
        bb = in.next();
        System.out.println(bb);

        double c;
        c= in.nextDouble();
        System.out.println(c);
    }
}