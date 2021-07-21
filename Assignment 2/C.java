class C extends B
{
    int varC;
    public C()
    {
        System.out.println("Default constructor of C called.");
    }
    public C(int _varA,int _varB,int _varC)
    {
        super(_varA,_varB);
        System.out.println(String.format("Constructor of C called with varC = %d",_varC));
        varC = _varC;
    }

    public void normal_function()
    {
        System.out.println("Class C normal Method Called");
    }
    
    // final void final_function()
    // {
    //     System.out.println("Class C final Method Called");
    // }

    public static void static_function()
    {
        System.out.println("Class C static Method Called");
    }
}