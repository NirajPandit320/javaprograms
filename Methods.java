class car {

    public void runWheel()
    {
        System.out.println("Wheel running");
    }
    public String GetAKey(int cost)
    {
        if (cost>=15)
        return "Key";
        else
        
        return "Nokey";
    }

}
class Methods{
    public static void main(String arg[]){
        car obj = new car();
        obj.runWheel();
        String str=obj.GetAKey(2);
        System.out.println(str);
    }
}