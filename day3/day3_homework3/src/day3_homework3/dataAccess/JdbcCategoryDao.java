package day3_homework3.dataAccess;

import java.util.ArrayList;
import java.util.List;

import day3_homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	private List<Category> categories = new ArrayList<>();

	@Override
	public boolean add(Category category) {
		for(Category categoryFind: categories) {
			if(categoryFind.getCategoryName().equals(category.getCategoryName())) {
				return true;
			}
		}
		categories.add(category);
		System.out.println(category.getCategoryName()+" category added to database with JDBC");
		return false;
	}

}
