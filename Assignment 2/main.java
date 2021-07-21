
public class main {
    public static void main(String[] args) {
        B bb= new B(1,2);
        bb.normal_function();
        bb.static_function();
        bb.final_function();

        System.out.println("Next test:");

        A ab = new B();
        ab.normal_function();
        ab.static_function();
        ab.final_function();
        // b.add(1,2);
        // b.mul(1,2);


        // A b1= new B(1,2,3);
        // b1.add(1,2);
        // b1.mul(1,2);
        System.out.println("Next test:");

        
        C c =new C();
        C c1 =new C(1,2,3);
    }
}
