class Calculator //Designing = Properties+Method.....
{
    int a=1;  //Just an example that you can declare variables at here.....
    int b=2;  //Just an example that you can declare variables at here.....
       
    public int add(int n1, int n2){
        int r = n1+n2;
        return r;
    }

}

public class classandobject {
    public static void main(String[] args) {
        int num1=4;
        int num2=5;
       // int result = num1+num2;
      //  System.out.println(result);
        //System.out.println("This is method for creating class and object");

        Calculator calc=new Calculator();
        int result= calc.add(num1,num2);
        System.out.println(result);

    }
}