import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestInventoryItem {
	InventoryItem testItem;
	@Before
	public void initialize()
	{
		testItem = new InventoryItem("Test",1,"Test",2);
	}
	@Test
	public void testItemWeight ()
	{
		assertEquals(testItem.getWeight(),1);
	}
	@Test
	public void testItemType ()
	{
		assertEquals(testItem.getType(),"Test");
	}
	@Test
	public void testItemName ()
	{
		assertEquals(testItem.getName(),"Test");
	}
	@Test
	public void testItemCount ()
	{
		assertEquals(testItem.getCount(),2);
	}
	@Test
	public void testToString()
	{
		assertEquals(testItem.toString(),"Test Test 1 2");
	}
	@Test
	public void testToStringSingleCount()
	{
		testItem = new InventoryItem("Test",1,"Test",0);
		assertEquals(testItem.toString(),"Test Test 1");
	}
	
}
