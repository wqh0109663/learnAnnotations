package top.shownmmp.learnannotations.test;

import top.shownmmp.learnannotations.annotation.MyAnnotation;

import java.lang.annotation.Annotation;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-6-5 上午11:52
 */

@MyAnnotation(name = "MyAnnotation at class",age = 18)
public class TestMyAnnotation {
    private static  TestMyAnnotation testMyAnnotation = new TestMyAnnotation();
    public static void main(String[] args) {
        Class<? extends TestMyAnnotation> aClass = testMyAnnotation.getClass();
        /*
         * 判断当前类是否有MyAnnotation注解
         */
        boolean annotationPresent = aClass.isAnnotationPresent(MyAnnotation.class);
        if (annotationPresent) {
            MyAnnotation annotation = aClass.getAnnotation(MyAnnotation.class);
            /*
             * print :MyAnnotation at class---18
             */
            System.out.println(annotation.name()+"---"+annotation.age());
            Annotation[] annotations = aClass.getAnnotations();
            for (Annotation anno : annotations) {
                if (anno instanceof MyAnnotation) {
                    //print: 18--MyAnnotation at class
                    System.out.println(((MyAnnotation) anno).age()+"--"+((MyAnnotation) anno).name());
                }else {
                    System.out.println(anno);
                }
            }
        }


    }

}
