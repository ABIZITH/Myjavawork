public class scoping { //scope means where we can access our varibles
                       // anything which we initializes outside the inside we cant use it outside , anything which we initailizes inside we cant use it outside 
    public static void main(String[] args) {
        int a =10;
        int b =20;
    
    {
         int a = 40;          // values initials in this block ,will remian i this block  
         b =99;               // reasign the orginial value of refference varible
    }
    System.out.println(b);          //cannot use outside the block
}

int a = 40;   

    static void random(int marks){
        int call = 30;
        System.out.println(call);
        System.out.println(marks);
    }
    
}
