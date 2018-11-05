import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.*;
import org.mockito.Mockito;
public class TestInventory {
	Inventory testInv;
	List<InventoryItem> spyList;
	@Before
	public void initialize()
	{
		testInv = new Inventory();
		spyList = Mockito.spy(testInv.items);
		
	}
	@Test
	public void testAddItem()
	{
		InventoryItem mockItem = Mockito.mock(InventoryItem.class);
		assertTrue(testInv.addItemToInventory(mockItem));
		
		
	}
	@Test
	public void testAddHeavyItem()
	{
		InventoryItem mockItem = Mockito.mock(InventoryItem.class);
		when(mockItem.getWeight()).thenReturn(251);
		assertFalse(testInv.addItemToInventory(mockItem));
	}
	@Test
	public void testGetWeight()
	{
		assertEquals(testInv.getWeight(),0);
	}
	@Test
	public void testGetCount()
	{
		assertEquals(testInv.getCount(),0);
	}
	@Test
	public void testGetString()
	{
		assertEquals(testInv.toString(),"Test string");
	}
	@Test
	public void testGetItemsString()
	{
		InventoryItem mockItem = Mockito.mock(InventoryItem.class);
		testInv.addItemToInventory(mockItem);
		when(mockItem.toString()).thenReturn("Item Name");
		assertEquals(testInv.toString(),"Item Name");
	}
	@Test
	public void testRemoveItem()
	{
		InventoryItem mockItem = Mockito.mock(InventoryItem.class);
		testInv.addItemToInventory(mockItem);
		assertTrue(testInv.dropInventoryItem(mockItem));
		
	}
	@Test
	public void testCantRemoveItem()
	{
		InventoryItem mockItem = Mockito.mock(InventoryItem.class);
		assertFalse(testInv.dropInventoryItem(mockItem));
	}
}
