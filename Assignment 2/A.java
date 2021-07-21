class A
{
    int varA;
    public A()
    {
        System.out.println("Default constructor of A called.");
    }
    public A(int _varA)
    {
        System.out.println(String.format("Constructor of A called with varA = %d",_varA));
        varA = _varA;
    }

    public void normal_function()
    {
        System.out.println("Class A normal Method Called");
    }
    
    final void final_function()
    {
        System.out.println("Class A final Method Called");
    }

    public static void static_function()
    {
        System.out.println("Class A static Method Called");
    }
}