package recursion;

public class NumberList {
    public static void main(String[] args) {
    System.out.println("Hello");
//    PDI(5);
//    PD(5);
//    PI(5);
      PDIskip(5);
    }

//    Print decreasing
    public static void PD(int n){
        if (n==0){
            return;
        }

        System.out.println(n);
        PD(n-1);
    }
//    Print Increasing
    public static void PI(int n){
        if (n==0){
            return;
        }

        PI(n-1);
        System.out.println(n);
    }

//    Print Increasing and Decreasing

    public static void PDI(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PDI(n-1);
        System.out.println(n);
    }

//    First Odd then Even

    public static void PDIskip(int n){
        if(n==0){
            return;
        }
        if (n%2==1){
            System.out.println(n);

        }
        PDIskip(n-1);
            if(n%2==0){
              System.out.println(n);
        }
    }

}
