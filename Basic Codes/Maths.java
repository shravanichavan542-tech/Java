class Maths
{   
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Maths m=new Maths();
        System.out.println(m.add(10,23));
        System.out.println(m.add(78.9,90.0));
    }
}
