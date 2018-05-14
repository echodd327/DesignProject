package current.thread.test.atomic;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class Person {
    private String name;
    private int id;
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
    	Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        Person person = new Person();
        Field name = Person.class.getDeclaredField("name");
        unsafe.putObject(person,unsafe.objectFieldOffset(name),"privateField");
        System.out.println(person.getName());
	}
}