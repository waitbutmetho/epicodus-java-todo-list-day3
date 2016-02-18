import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class CategoryTest {

	@Test
	public void getName_returnsName_true() {
		Category testCategory = new Category("Home");
		assertEquals("Home", testCategory.getName());
	}

	@Test
	public void getId_returnsCategoryId() {
		Category testCategory = new Category("Home");
		assertTrue(Category.all().size() == testCategory.getId());
	}

	@Test
	public void getTasks_initiallyReturnsEmptyArrayList() {
		Category testCategory = new Category("Home");
		assertTrue(testCategory.getTasks() instanceof ArrayList);
	}

	@Test
	public void all_returnsAllInstanceOfTask_true() {
		Category firstCategory = new Category("Home");
		Category secondCategory = new Category("Home");
		assertTrue(Category.all().contains(firstCategory));
		assertTrue(Category.all().contains(firstCategory));
	}

	@Test
	public void cleear_removesAllCategoryInstancesFromMemory() {
		Category testCategory = new Category("Home");
		Category.clear();
		assertEquals(Category.all().size(), 0);
	}

	@Test
  public void find_returnsCategoryWithSameId() {
    Category testCategory = new Category("Home");
    assertEquals(Category.find(testCategory.getId()), testCategory);
  }

  @Test
  public void addTask_addsTaskToList() {
    Category testCategory = new Category("Bob's Used Tasks");
    Task testTask = new Task("Mow the lawn");
    testCategory.addTask(testTask);
    assertTrue(testCategory.getTasks().contains(testTask));
  }
}
