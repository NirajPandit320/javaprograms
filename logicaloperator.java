class logicaloperator {
    public static void main (String arg[]) {

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        //boolean result= x>y && a>b ;
        //boolean result = x>y || a>b;
        boolean result = a>b && x>y && x>a ;
        

        System.out.println(!result);  //For not equals to

    }
}