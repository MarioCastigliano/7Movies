package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import model.UserBean;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class UserBeanTest {


	@Test
	void testGetName() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("name");
		field.setAccessible(true);
		field.set(ub, "Luca");
		
		final String result = ub.getName();
		
		assertEquals("Field not retrieved properly", result, "Luca");
	}

	@Test
	void testGetSurname() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("surname");
		field.setAccessible(true);
		field.set(ub, "Siviero");
		
		final String result = ub.getSurname();
		
		assertEquals("Field not retrieved properly", result, "Siviero");	}

	@Test
	void testGetMail() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("mail");
		field.setAccessible(true);
		field.set(ub, "luca@gmail.com");
		
		final String result = ub.getMail();
		
		assertEquals("Field not retrieved properly", result, "luca@gmail.com");	}

	@Test
	void testGetCart() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("cart");
		field.setAccessible(true);
		field.set(ub, "qualche oggetto");
		
		final String result = ub.getCart();
		
		assertEquals("Field not retrieved properly", result, "qualche oggetto");	}

	@Test
	void testGetAdmin() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("admin");
		field.setAccessible(true);
		field.set(ub, true);
		
		final boolean result = ub.getAdmin();
		
		assertEquals(true, result, "Field not retrieved properly");	}

	@Test
	void testSetName() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		ub.setName("Luca");
		final Field field = ub.getClass().getDeclaredField("name");
		field.setAccessible(true);
		assertEquals("Fields didn't match", field.get(ub), "Luca");
		}

	@Test
	void testSetSurname() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("surname");
		field.setAccessible(true);
		field.set(ub, "Siviero");
		
		final String result = ub.getSurname();
		
		assertEquals("Field not retrieved properly", result, "Siviero");	}

	@Test
	void testSetMail() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("mail");
		field.setAccessible(true);
		field.set(ub, "luca@gmail.com");
		
		final String result = ub.getMail();
		
		assertEquals("Field not retrieved properly", result, "luca@gmail.com");	}

	@Test
	void testSetCart() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("cart");
		field.setAccessible(true);
		field.set(ub, "Some objects");
		
		final String result = ub.getCart();
		
		assertEquals("Field not retrieved properly", result, "Some objects");	}

	@Test
	void testSetAdmin() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		final UserBean ub = new UserBean();
		final Field field = ub.getClass().getDeclaredField("admin");
		field.setAccessible(true);
		field.set(ub, true);
		
		final boolean result = ub.getAdmin();
		
		assertEquals("Field not retrieved properly", result, true);	}

}
