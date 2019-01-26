class SimpleClass
{   
      public int a=10,b=20;

     static void staticMethod()
      {
       System.out.println("Static Method");
      }
   
       void nonStaticMethod()
     {
         System.out.println("Non Static Method");
      }

      public static void main(String[] args) 
     {
         SimpleClass s1 = new SimpleClass();
         System.out.println("a = "+s1.a );
         System.out.println("b = "+s1.b );
         staticMethod();
         s1.nonStaticMethod();
      }
}