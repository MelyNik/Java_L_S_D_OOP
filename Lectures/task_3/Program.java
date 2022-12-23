package Java_L_S_D_ooP.Lectures.task_3;



public class Program {
    public static void main(String[] args) {
        Foo foo = new Foo() {

            @Override
            public void m() {
               System.out.println("m"); 
                
            }

            @Override
            public void m2() {
                System.out.println("m2");
                
            }
            
        };
    
        foo.m();
        
        Foo foo2 = new Foo() {

            @Override
            public void m() {
               System.out.println("m"); 
                
            }

            @Override
            public void m2() {
                System.out.println("m2");
                
            }
            
        };


        foo2.m();
    }
}
