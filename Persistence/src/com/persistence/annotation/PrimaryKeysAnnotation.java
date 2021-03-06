package com.persistence.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PrimaryKeysAnnotation {
	
	public String column() default "";
	
	public boolean auto_increment() default true; 
	
	public boolean update() default false;
	
	public String key() default "primary";
}
