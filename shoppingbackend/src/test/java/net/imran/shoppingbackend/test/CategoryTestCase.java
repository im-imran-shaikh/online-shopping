package net.imran.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.imran.shoppingbackend.dao.CategoryDAO;
import net.imran.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.imran.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Smartphone");
		category.setDescription("this is some description of smartphone");
		category.setImageUrl("CAT-1.png");
		
		assertEquals("Successfully added a category inside the table !",true);
	}
	
}
