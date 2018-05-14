package current.thread.test.atomic;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class UnsafeDemo {

    private UnsafeDemo() {
        throw new IllegalStateException("非法访问");
    }

    public static void main(String[] args)throws Exception {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe) theUnsafe.get(null); 
        
        UnsafeDemo demo = (UnsafeDemo) unsafe.allocateInstance(UnsafeDemo.class);
        System.out.println(demo);
        demo.hello();
      
    }
    
    public void hello(){
    	System.out.println("hello");
    }
}