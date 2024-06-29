class Calculator
{
    public int add(int n1 , int n2 , int n3)
    {
    return n1+ n2+ n3;
    }
    public int add1 (int n1,int n2)
    {
        return n1+n2;
    }
    public double add(double n1, double n2)
    
    {
        return n1 +n2;
    }
}
public class methodoverloading 
{

    public static void main(String arg[])
    {
        Calculator obj = new Calculator();
        int r1 = obj.add1(3,4);  // can perform any operations above
        System.out.println(r1);
    }
}