package day3_homework3;

import day3_homework3.business.CategoryManager;
import day3_homework3.business.CourseManager;
import day3_homework3.business.InstructorManager;
import day3_homework3.core.logging.DatabaseLogger;
import day3_homework3.core.logging.FileLogger;
import day3_homework3.core.logging.Logger;
import day3_homework3.core.logging.MailLogger;
import day3_homework3.dataAccess.HibernateCategoryDao;
import day3_homework3.dataAccess.HibernateCourseDao;
import day3_homework3.dataAccess.JdbcInstructorDao;
import day3_homework3.entities.Category;
import day3_homework3.entities.Course;
import day3_homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategoryName("Programlama");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setAbout("\"Engin Demiroğ\" YouTube kanalımda ücretsiz eğitim videoları ve içerikleri paylaşmaktayım.");
		instructor1.setImageUrl("enginhocabirnumara.png");
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setCourseName("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");
		course1.setCategory(category1);
		course1.setInstructor(instructor1);
		course1.setCoursePrice(0);
		course1.setDescription("2022 yılında düzenlenen Java ile yazılım geliştirici yetiştirme kampı");
		course1.setImageUrl("coursephoto.png");
		
		Logger[] loggers = {new FileLogger(), new MailLogger(), new DatabaseLogger()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

	}

}
