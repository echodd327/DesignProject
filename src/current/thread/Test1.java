package current.thread;

class Fu {  
    protected String name = "李四";  
    protected int age = 6;  
    static {  
            System.out.println("父类静态代码块，给类初始化用的。");  
    }  
    {  
            System.out.println("父类构造代码块，给对象初始化用的。");  
    }  

    public Fu() {  
            System.out.println("父类构造函数，给对象初始化用的。");  
    }  
}  

class Zi extends Fu {  
    static {  
            System.out.println("子类静态代码块，给类初始化用的。");  
    }  
    {  
            System.out.println("子类构造代码块，给对象初始化用的。");  
    }  

    public Zi(String name, int age) {  
            this.name = name;  
            this.age = age;  
            System.out.println("子类构造函数，给对象初始化用的。");  
            System.out.println(name + "  " + age);  
    }  
}  

public class Test1 {  
    public static void main(String[] args) {  
            Zi z = new Zi("光头哥", 26);  
            // 1、因为new用到了Zi.class，并且子类继承了父类。所以会先找到Fu.class，再找到Zi.class文件并加载到内存中  
            // 2、执行 父类静态代码块  
            // 3、执行子类静态代码块  
            // 4、在堆内存中开辟空间，分配内存地址  
            // 5、对 父类属性 默认初始化(名字默认为空)，显式初始化(如题中"李四")  
            // 6、父类构造代码块  
            // 7、父类构造函数  
            // 8、在堆内存中建立对象的特有属性，并进行子类对象的默认初始化  
            // 9、对子类对象的属性显式初始化  
            // 10、子类构造代码块  
            // 11、子类构造函数  
            // 12、将内存地址付给栈内存中的z变量  
    }  

}  
