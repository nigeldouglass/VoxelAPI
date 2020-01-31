package com.nigeldouglass.voxel.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Addon {
	String addonid();
	String name();
	String version() default "1.0.0";
	String[] dependencies() default "";
	String author() default "";
	String website() default "";
}
