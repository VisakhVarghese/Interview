package jdk_;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
//the @NonNull annotation can be used on types and type parameters.
public @interface NonNull {
}
