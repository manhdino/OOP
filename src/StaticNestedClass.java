public class StaticNestedClass {        // StaticNestedClass được gọi là Outer class : lớp ngoài
     // biến static :
         static int outer_x = 10;

     // biến non-static:
         int outer_y = 20;

      // biến private:
         private static int outer_z = 30;

       // static nested class :

       static class staticNestedclass{
           void display(){
               System.out.println("outer_x = " + outer_x );
//               System.out.println("outer_y = " + outer_y);
               System.out.println("outer_z = " + outer_z);
           }
       }


}
