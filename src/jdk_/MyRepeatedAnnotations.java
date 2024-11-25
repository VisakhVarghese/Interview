package jdk_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(MyRepeatedAnnotations.class)
@Target(ElementType.TYPE)
@interface MyAnnotation {
    String value();
}

@Target(ElementType.TYPE)
@interface MyRepeatedAnnotations {
    MyAnnotation[] value();
}