package day3_homework3.business;

import day3_homework3.core.logging.Logger;
import day3_homework3.dataAccess.CourseDao;
import day3_homework3.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception{
		if(course.getCoursePrice()<0) {
			throw new Exception("Course price cannot be less than zero");
		}
		if(courseDao.add(course) == true) {
			for(Logger logger: loggers) {
				logger.log(course.getCourseName());
			}
		}else {
			throw new Exception("There cannot be more than one course with the same name.");
		}
	}
	
}
