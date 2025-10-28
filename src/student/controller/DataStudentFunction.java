
package student.controller;

import java.util.ArrayList;
import student.model.Student;

public interface DataStudentFunction {

    void readStudentSQL(ArrayList<Student> listst);

    int insertStudent(Student s);

    int updateStudent(Student s);

    int delStudent(Student s);
    
    Student getStudentByID(String studentID);

    ArrayList<Student> searchByName(ArrayList<Student> listStudent, String nameStudent);

    ArrayList<Student> searchByClass(ArrayList<Student> listStudent, String clss);

    Student searchStudentById(ArrayList<Student> listStudent, String studentId);

}
