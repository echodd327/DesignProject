package effectiveJava.e6.anonotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)  //元注解,Test注解应该在运行时保留 
@Target(ElementType.METHOD)  //Test注解只有在方法申明中才合法
public @interface Test {
}
