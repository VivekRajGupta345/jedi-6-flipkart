class B extends A
{
    int varB;
    public B()
    {
        System.out.println("Default constructor of B called.");
    }
    public B(int varA,int _varB)
    {
        super(varA);
        System.out.println(String.format("Constructor of B called with varB = %d",_varB));
        varB = _varB;
    }

    public void normal_function()
    {
        System.out.println("Class B normal Method Called");
    }
    
    // final void final_function()
    // {
    //     System.out.println("Class B final Method Called");
    // }

    public static void static_function()
    {
        System.out.println("Class B static Method Called");
    }
}
