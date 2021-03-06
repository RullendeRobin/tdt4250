package tdt4250.sp.examples;


import tdt4250.sp.Course;
import tdt4250.sp.CourseGroup;
import tdt4250.sp.Semester;
import tdt4250.sp.SpFactory;

public class ManualCodeExample {
	
	public static void main(String[] args) {		
		Semester semester = SpFactory.eINSTANCE.createSemester();

		Course course = SpFactory.eINSTANCE.createCourse();
		Course course2 = SpFactory.eINSTANCE.createCourse();
		course.setCredit(7.5f);
		course2.setCredit(10f);
		
		CourseGroup courseGroup = SpFactory.eINSTANCE.createCourseGroup();
		CourseGroup courseGroup2 = SpFactory.eINSTANCE.createCourseGroup();


		semester.getCourseGroups().add(courseGroup);
		semester.getCourseGroups().add(courseGroup2);
		courseGroup.getCourses().add(course);
		courseGroup2.getCourses().add(course2);
		
		System.out.println(semester.getTotalCredits());
		
	}

}
