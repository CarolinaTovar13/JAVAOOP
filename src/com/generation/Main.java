package com.generation;

import com.generation.classes.Student;
import com.generation.classes.StudentService;
import com.generation.exception.CourseNotFoundException;
import com.generation.exception.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
//        studentService.getStudents().put( "1030", new Student( "Carlos", "1030", 31 ) );
//        studentService.getStudents().put( "1040", new Student( "Ian", "1020", 28 ) );
//        studentService.getStudents().put( "1050", new Student( "Elise", "1020", 26 ) );
//        studentService.getStudents().put( "1020", new Student( "Santiago", "1020", 33 ) );
	    
        studentService.addStudent(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent(new Student( "Ian", "1040", 28 ) );
        studentService.addStudent(new Student( "Elise", "1050", 26 ) );
        studentService.addStudent(new Student( "Santiago", "1020", 33 ) );

       
        try {
			studentService.enrollStudents( "Physics", "1030" );
			studentService.enrollStudents( "Math", "1030" );
	        studentService.enrollStudents( "Math", "1040" );
	        studentService.enrollStudents( "Physics", "1040" );
	        studentService.enrollStudents( "Physics", "1021" );
	        //studentService.enrollStudents( "Programming", "1021" );
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} //catch 
        
        try {
			studentService.unEnrollStudents("Math", "1040");
		} catch (CourseNotFoundException | StudentNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}//catch
        
        studentService.showAllStudents();
        studentService.showAllCourses();
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("Physics");
    }//main
}//class
