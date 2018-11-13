package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("television");
		category.setDescription("this is a television");
		category.setImageURL("television.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("this is a mobile");
		category.setImageURL("mobile.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("laptop");
		category.setDescription("this is a laptop");
		category.setImageURL("laptop.png");
		
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category:categories) {
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}

}
