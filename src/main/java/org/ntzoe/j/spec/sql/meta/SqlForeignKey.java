package org.ntzoe.j.spec.sql.meta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlForeignKey {

    /**
     * class to reference 
     * by default @ForeignKey reference to a field that have @SqlPrimaryKey
    */
    Class<?> table();

    /**
     * name of foreign key
    */
    String name();
}
