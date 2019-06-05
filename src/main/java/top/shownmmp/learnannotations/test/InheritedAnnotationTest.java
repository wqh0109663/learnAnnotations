package top.shownmmp.learnannotations.test;

import top.shownmmp.learnannotations.annotation.InheritedAnnotation;
import top.shownmmp.learnannotations.entity.Person;
import top.shownmmp.learnannotations.entity.User;

/**
 * @author 吴启欢
 * @version 1.0
 * @date 19-6-5 下午12:26
 */

public class InheritedAnnotationTest {


    public static void main(String[] args) {

        Class<Person> personClass = Person.class;
        boolean personClassAnnotationPresent = personClass.isAnnotationPresent(InheritedAnnotation.class);
        if (personClassAnnotationPresent) {
            InheritedAnnotation annotation = personClass.getAnnotation(InheritedAnnotation.class);
            System.out.println("person的:"+annotation.value());
        }

        Class<User> userClass = User.class;
        boolean annotationPresent = userClass.isAnnotationPresent(InheritedAnnotation.class);
        if (annotationPresent) {
            InheritedAnnotation annotation = userClass.getAnnotation(InheritedAnnotation.class);
            System.out.println("user继承的:"+annotation.value());
        }
    }
    }
