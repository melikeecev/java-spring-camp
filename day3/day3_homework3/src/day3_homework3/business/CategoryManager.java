package day3_homework3.business;

import day3_homework3.core.logging.Logger;
import day3_homework3.dataAccess.CategoryDao;
import day3_homework3.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		if(categoryDao.add(category) == true) {
			for(Logger logger: loggers) {
				logger.log(category.getCategoryName());
			}
		}else {
			throw new Exception("There cannot be more than one category with the same name.");
		}
	}
	
	

}
