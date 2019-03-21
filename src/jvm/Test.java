package jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Test {


    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();

        // Getting hold of Class object created
        // by JVM.
        Class c1 = s1.getClass();

        // Printing type of object using c1.
        System.out.println(c1.getName());

        // getting all methods in an array
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m)
            System.out.println(method.getName());

        // getting all fields in an array
        Field f[] = c1.getDeclaredFields();
        Class c2 = c1.getSuperclass();
        Class[] c3 = c1.getInterfaces();
        System.out.println(c3[0].getName());
        System.out.println(c2.getName());
        for (Field field : f){
            System.out.println(field.getName());
        }
        System.out.println("************");
        Grade grade = new Grade();
        List<Student> students = grade.getStudents();
        Student student = students.get(0);
        Class c4 = student.getClass();
        grade = null;
        System.gc();
        System.out.println(c4.getName());

    }

    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize()
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }

}
