package day3_homework3.dataAccess;

import day3_homework3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added to database with Hibernate");
	}

}
