package com.tutorial.restful;

import static org.junit.Assert.*;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CategoryServiceTestCase {

	private static final String CATEGORY_URL = "http://localhost:8081/WebRest";
	private static final String CATEGORY_ID = "001";
	private static final String TYPE_XML = "application/xml";
	private static final String TYPE_JSON = "application/json";

	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}*/

	@Before
	public void setUp() throws Exception {
	}

	/*@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void testGetCategoryDAO() {
		String format = TYPE_XML;
		System.out.println("testGetCategory called with format " + format);
		WebClient client = WebClient.create(CATEGORY_URL);
		Category category = client.path("/categoryservice/category")
				.accept(format).type(format).query("id", "006")
				.get(Category.class);
		System.out
				.println("Category details retreived from service with format "
						+ format);
		System.out.println("Category Name " + category.getCategoryName());
		System.out.println("Category Id " + category.getCategoryId());

		assertEquals(CATEGORY_ID, category.getCategoryId());
		
//		fail("Not yet implemented");
	}

}
