
class revision{
    public static void main (String arg[]) {
        int a = 80;
        float b = 78.787f;
        double c = 79.9999;

        if(a>b && a>c){
            System.out.println(a);
            System.out.println("A is the greatest");
        
        }
        else if (b>a && b>c) {
            System.out.println(b);
            System.out.println("B is the greatest");
        }
        else{
            System.out.println(c);
            System.out.println("C is the greatest");

        }
    }
}