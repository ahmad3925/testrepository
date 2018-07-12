package com.Shop.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Shop.DAO.CategoryDAO;
import com.Shop.model.Category;


public class CategoryTest {
	
	private static AnnotationConfigApplicationContext context=null;
	private static CategoryDAO CategoryDAO=null;
	

	@BeforeClass  //static function; always runs before a test
	public static void setUpBeforeClass() throws Exception {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.Shop");
		context.refresh();
		CategoryDAO=(CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void testaddCategory() {
		Category category= new Category();
		category.setCategoryName("Laptop");

		 
		 assertTrue("Cannot save the value please check code!", CategoryDAO.addCategory(category));
	
}
	@Ignore
	@Test
	public void testUpdateCategory() {
		
	}

	@Ignore
	@Test
	public void testDeleteCategory() {
		
	}

	@Ignore
	@Test
	public void testGetSingleCategory() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testGetAllProduct() {
		fail("Not yet implemented");
	}

}