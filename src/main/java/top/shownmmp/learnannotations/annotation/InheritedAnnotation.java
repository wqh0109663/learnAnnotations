package top.shownmmp.learnannotations.annotation;

import java.lang.annotation.*;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-6-5 下午12:15
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface InheritedAnnotation {
    String value();
}
