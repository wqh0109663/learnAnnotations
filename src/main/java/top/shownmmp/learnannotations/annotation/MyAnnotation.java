package top.shownmmp.learnannotations.annotation;

import java.lang.annotation.*;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-6-5 上午11:49
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MyAnnotation {
    String name() default "";
    int age() default 0;
}
