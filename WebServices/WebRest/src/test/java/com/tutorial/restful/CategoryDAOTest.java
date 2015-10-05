package com.tutorial.restful;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CategoryDAOTest {

	CategoryDAO cdao = null;
	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}*/

	@Before
	public void setUp() throws Exception {
		cdao = new CategoryDAO();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBooks() {
		assertNotNull(cdao.getBooks("001"));
//		fail("Not yet implemented");
	}
	
	@Ignore
	@Test
	public void testBooks() {
		CategoryDAO cdao = new CategoryDAO();
		assertNotNull(cdao.getBooks("008"));
//		fail("Not yet implemented");
	}	

}
