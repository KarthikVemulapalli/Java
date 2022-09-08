package CoreJava.AccessModifiers;

public @interface AMAnnotation {

    //All Variables are Public, Static, Final
    public static final String AMPublicInstVar = "Public InstanceVar";

    //Elements
    public String AMDefaultMethod() default "Annotation";

}
