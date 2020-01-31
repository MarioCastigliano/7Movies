package test;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import org.junit.jupiter.api.Test;
import model.ReviewBean;

class ReviewBeanTest {

	@Test
	void testGetId() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		final Field field = rb.getClass().getDeclaredField("id");
		field.setAccessible(true);
		field.set(rb, 1L);
		
		final long result = rb.getId();
		
		assertEquals("Field not retrieved properly", result, 1L);	
		}

	@Test
	void testSetId() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		rb.setId(1L);
		final Field field = rb.getClass().getDeclaredField("id");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(rb), 1L);	}

	@Test
	void testGetName() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		final Field field = rb.getClass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(rb, "Luca");
		
		final String result = rb.getName();
		
		assertEquals("Field not retrieved properly", result, "Luca");	}

	@Test
	void testSetName() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		rb.setName("Luca");
		final Field field = rb.getClass().getDeclaredField("name");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(rb), "Luca");	}	

	@Test
	void testGetMail() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		final Field field = rb.getClass().getDeclaredField("mail");
		field.setAccessible(true);
		field.set(rb, "ok@gmail.com");
		
		final String result = rb.getMail();
		
		assertEquals("Field not retrieved properly", result, "ok@gmail.com");	}

	@Test
	void testSetMail() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		rb.setMail("ok@gmail.com");
		final Field field = rb.getClass().getDeclaredField("mail");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(rb), "ok@gmail.com");	}	

	@Test
	void testGetTitle() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		final Field field = rb.getClass().getDeclaredField("title");
		field.setAccessible(true);
		field.set(rb, "Bell malament");
		
		final String result = rb.getTitle();
		
		assertEquals("Field not retrieved properly", result, "Bell malament");	}

	@Test
	void testSetTitle() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		final ReviewBean rb = new ReviewBean();
		rb.setTitle("Bello");
		final Field field = rb.getClass().getDeclaredField("title");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(rb), "Bello");	}	

	@Test
	void testGetReview() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		final Field field = rb.getClass().getDeclaredField("review");
		field.setAccessible(true);
		field.set(rb, "Mi piace");
		
		final String result = rb.getReview();
		
		assertEquals("Field not retrieved properly", result, "Mi piace");	}

	@Test
	void testSetReview() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final ReviewBean rb = new ReviewBean();
		rb.setReview("Mi piace");
		final Field field = rb.getClass().getDeclaredField("review");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(rb), "Mi piace");	}	

	@Test
	void testGetDate() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ParseException{
		final ReviewBean rb = new ReviewBean();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		final Field field = rb.getClass().getDeclaredField("date");
		field.setAccessible(true);
		
		
		java.util.Date utilStartDate = format.parse("1998-02-24");
		java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
		
		field.set(rb, sqlStartDate);
		
		final Date result = rb.getDate();
		assertEquals("Field not retrieved properly", result, sqlStartDate);	}

	@Test
	void testSetDate() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ParseException{
		final ReviewBean rb = new ReviewBean();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilStartDate = format.parse("1998-02-24");
		java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
		
		rb.setDate(sqlStartDate);
		final Field field = rb.getClass().getDeclaredField("date");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(rb), sqlStartDate);	}	

}
