package day3_homework3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import day3_homework3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	private List<Course> courses = new ArrayList<>();

	@Override
	public boolean add(Course course) {
		for(Course courseFind: courses) {
			if(courseFind.getCourseName().equals(course.getCourseName())) {
				return true;
			}
		}
		courses.add(course);
		System.out.println(course.getCourseName()+" added to database with Jdbc");
		return false;
	}
	
}
