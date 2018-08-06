package com.proveInheritedAnnotation;

import java.lang.annotation.*;

/**
 * 证明一个带有@Inherited元注解的自定义注解，在一个类用时，则这个类的子类会自动被继承这个自定义注解。
 * @author qinlinsen
 */
@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mother {
    String name() default "王宝菊";
    int age() default 47;
}
