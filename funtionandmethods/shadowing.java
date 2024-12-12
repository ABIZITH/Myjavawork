public class shadowing {   // shadowing in java is pratice of using the two variable with the same name 

     static int a =10; // static is  basically object independent // the higher level is shadowed
    public static void main(String[] args) {
        
        System.out.println(a); // print the 10

        int a = 20;            // the class variable at line 3 is shadowed by this 20 value
                               // scope will begin when the value is initialized in the program
        System.out.println(a); // print the 20

        fun();
    }
    static void fun(){

        System.out.println(a); // print the 10
    }
}
