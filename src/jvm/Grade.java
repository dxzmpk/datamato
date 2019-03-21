package jvm;

import java.util.ArrayList;
import java.util.List;

public class Grade {

    private List<Student> students;

    {
        students  = new ArrayList<Student>();
        Student student = new Student();
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize()
    {
        System.out.println("Grade Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}
