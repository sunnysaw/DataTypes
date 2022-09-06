class  W {
    // this are instance variable . to initialize this we have to make object of this class
    byte B= 101;
    short C = 10001;
    int A = 1000000001;
    long D = 1000000001;
    float E = 1000000001;
    double F = 1000000001;
}
class Q {
    // this are static variable . to initialize this we don't have to make object of this class,
    // we can directly call it by class name
   static byte B= 102;
   static short C = 10002;
   static int A = 1000000002;
   static long D = 1000000002;
   static float E = 1000000002;
   static double F = 1000000002;
}
public class primitivedatatyped {
    public static void main(String[] args) {
    /*
    in this class we will see about functions of primitive data type and variable in java.
     */
        System.out.println("this are the local variable that mins other method not even aware of it." );
        byte A= 100;
        short B = 10000;
        int C = 1000000000;
        long D = 1000000000;
        float E = 1000000000;
        double F = 1000000000;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println();

        System.out.println("this are the instance variable");
        W s = new W();
        System.out.println(s.A);
        System.out.println(s.B);
        System.out.println(s.C);
        System.out.println(s.D);
        System.out.println(s.E);
        System.out.println(s.F);
        System.out.println();

        System.out.println("this are the static variable");
        System.out.println(Q.A);
        System.out.println(Q.B);
        System.out.println(Q.C);
        System.out.println(Q.D);
        System.out.println(Q.E);
        System.out.println(Q.F);

    }
}
