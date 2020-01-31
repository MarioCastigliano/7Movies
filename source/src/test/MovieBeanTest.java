package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Field;

import model.MovieBean;



class MovieBeanTest {

	@Test
	void testSetId() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		final MovieBean mb = new MovieBean();
		mb.setId(1L);
		final Field field = mb.getClass().getDeclaredField("id");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(mb), 1L);
	}

	@Test
	void testSetTitle() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		final MovieBean mb = new MovieBean();
		mb.setTitle("Batman");
		final Field field = mb.getClass().getDeclaredField("title");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "Batman");
	}

	@Test 
	void testSetDirector() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setDirector("Tarantino");
		final Field field = mb.getClass().getDeclaredField("director");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "Tarantino");
	}

	@Test
	void testSetYear() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setYear("1998");
		final Field field = mb.getClass().getDeclaredField("year");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "1998");
	}

	@Test
	void testSetLangs() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setLangs("Italiano, Inglese, Francese, Rumeno");
		final Field field = mb.getClass().getDeclaredField("langs");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "Italiano, Inglese, Francese, Rumeno");
	}

	@Test
	void testSetPrice() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setPrice(15F);
		final Field field = mb.getClass().getDeclaredField("price");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), 15F);	}

	@Test
	void testSetCategories() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setCategories("Drama, Thriller");
		final Field field = mb.getClass().getDeclaredField("categories");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "Drama, Thriller");	}

	@Test
	void testSetImgpath() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setImgpath("https://link.url");
		final Field field = mb.getClass().getDeclaredField("imgpath");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "https://link.url");	}

	@Test
	void testSetFramepath() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setFramepath("www.img.com");
		final Field field = mb.getClass().getDeclaredField("framepath");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "www.img.com");	}

	@Test
	void testSetDescription() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		mb.setDescription("Un bel film");
		final Field field = mb.getClass().getDeclaredField("description");
		field.setAccessible(true);
		assertEquals("Field didn't match", field.get(mb), "Un bel film");	}

	@Test
	void testGetId() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("id");
		field.setAccessible(true);
		field.set(mb, 1L);
		
		
		final long result = mb.getId();
		
		assertEquals("Field was not retrieved correctly", result, 1L);
	}

	@Test
	void testGetTitle() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("title");
		field.setAccessible(true);
		field.set(mb, "Kill Bill");
		
		
		final String result = mb.getTitle();
		
		assertEquals("Field was not retrieved correctly", result, "Kill Bill");	}

	@Test
	void testGetDirector() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("director");
		field.setAccessible(true);
		field.set(mb, "Tarantino");
		
		
		final String result = mb.getDirector();
		
		assertEquals("Field was not retrieved correctly", result, "Tarantino");	}

	@Test
	void testGetYear() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("year");
		field.setAccessible(true);
		field.set(mb, "1998");
		
		
		final String result = mb.getYear();
		
		assertEquals("Field was not retrieved correctly", result, "1998");	
		}

	@Test
	void testGetLangs() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("langs");
		field.setAccessible(true);
		field.set(mb, "Italiano");
		
		
		final String result = mb.getLangs();
		
		assertEquals("Field was not retrieved correctly", result, "Italiano");	
		}

	@Test
	void testGetPrice() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("price");
		field.setAccessible(true);
		field.set(mb, 15.5F);
		
		
		final float result = mb.getPrice();
		
		assertEquals(result, 15.5F, 0F);	
		}

	@Test
	void testGetCategories() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("categories");
		field.setAccessible(true);
		field.set(mb, "Drama");
		
		
		final String result = mb.getCategories();
		
		assertEquals("Field was not retrieved correctly", result, "Drama");	}

	@Test
	void testGetImgpath() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("imgpath");
		field.setAccessible(true);
		field.set(mb, "url");
		
		
		final String result = mb.getImgpath();
		
		assertEquals("Field was not retrieved correctly", result, "url");	}

	@Test
	void testGetFramepath() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("framepath");
		field.setAccessible(true);
		field.set(mb, "framepath");
		
		
		final String result = mb.getFramepath();
		
		assertEquals("Field was not retrieved correctly", result, "framepath");	}

	@Test
	void testGetDescription() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final MovieBean mb = new MovieBean();
		final Field field = mb.getClass().getDeclaredField("description");
		field.setAccessible(true);
		field.set(mb, "Bello");
		
		
		final String result = mb.getDescription();
		
		assertEquals("Field was not retrieved correctly", result, "Bello");	}

}

