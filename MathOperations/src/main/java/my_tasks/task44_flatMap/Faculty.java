package my_tasks.task44_flatMap;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String facultyName;
    List<Student> list;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.list = new ArrayList<>();
    }

    public String getFacultyName() {
        return facultyName;
    }

    public List<Student> getList() {
        return list;
    }

    public void addStudentOnFaculty(Student student) {
        list.add(student);
    }

}
