package com.MondaysHomework;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.METHOD,ElementType.PACKAGE,ElementType.PARAMETER,ElementType.TYPE})
public @interface RunMe {
    String arg() default "0";
}
