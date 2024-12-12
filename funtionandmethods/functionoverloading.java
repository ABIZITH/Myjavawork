public class functionoverloading {  // function name can exist with the same nane with different parameters
    public static void main(String[] args) {
        fun(10);           // call the a  
        fun("abijith");  // call the name 
    }
    static void fun(int a){
         System.out.println(a);
    }
    static void fun(String name){
         System.out.println(name);
        
    }
}
