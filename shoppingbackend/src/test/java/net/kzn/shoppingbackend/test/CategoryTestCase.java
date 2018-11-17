package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	
	 /* @Test public void testAddCategory() {
	  
	  category = new Category();
	  
	  category.setName("television");
	  category.setDescription("this is a television");
	  category.setImageURL("television.png");
	  
	  assertEquals("Succesfuly added a category inside the table",
	  true,categoryDAO.add(category)); }*/
	 

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * assertEquals("Succesfuly fetched a single category from the table",
	 * "Television",category.getName()); }
	 */

	/*
	 * @Test public void testUdateCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * 
	 * category.setName("TV");
	 * assertEquals("Succesfuly ubdatef a single category in the table", true,
	 * categoryDAO.update(category)); }
	 */

	/*
	  @Test public void testDeleteCategory() {
	  
	  category = categoryDAO.get(1);
	  
	  assertEquals("Succesfuly deleted a single category in the table", true,categoryDAO.delete(category)); }
	 */

	
	  /*@Test public void testListCategory() {
	  
	  
	  assertEquals("Succesfuly fetched the list of categories form the table", 3,
	  categoryDAO.list().size()); }*/
	 

	@Test
	public void testCRUDCategory() {

		//add operation
		category = new Category();

		category.setName("Laptop");
		category.setDescription("this is a laptop");
		category.setImageURL("laptop.png");

		assertEquals("Succesfuly added a category inside the table", true, categoryDAO.add(category));

		
		category = new Category();

		category.setName("Television");
		category.setDescription("this is a TV");
		category.setImageURL("TV.png");

		assertEquals("Succesfuly added a category inside the table", true, categoryDAO.add(category));
		
		// fetching and updating the category
		category = categoryDAO.get(2);
		 
		 category.setName("TV");
		 assertEquals("Succesfuly ubdatef a single category in the table", true,categoryDAO.update(category)); 
		
		 //delete the category
		 
		 assertEquals("Succesfuly deleted a single category in the table", true,categoryDAO.delete(category)); 
		 
		 assertEquals("Succesfuly fetched the list of categories form the table", 1,categoryDAO.list().size());
	}

}
