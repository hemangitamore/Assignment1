class Demo{
    int a=100;
    int b=20;
    
    static int c=30;
    Demo(){
       System.out.println("in the constructor");
    
    }
    //init block
   {
     System.out.println("In the init block");
     a=1000;
   }
   
   static{
    System.out.println("In the static block");
    c=40;
 }

public static void main(String args[]){
    Demo obj =new Demo();
    System.out.println(obj.a);
}
}