package com.xx.aspect;



import java.lang.annotation.*;

/**
 * log annotation
 *
 * @author lzn
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyLog {

    /**
     * title
     */
    String title() default "";

}
