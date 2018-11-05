import java.util.ArrayList;

public class BookLibrarian {
	private ArrayList<BookInformation> bookList;
	private SortBook sortMethod;
	
	public BookLibrarian()
	{
		bookList = new ArrayList<BookInformation>();
		sortMethod = null;
	}
	public void addBook (BookInformation b)
	{
		bookList.add(b);
	}
	public void setSort (SortBook s)
	{
		sortMethod = s;
	}
	public void printList()
	{
		if (sortMethod == null)
		{
			
		}
		else
		{
			bookList = sortMethod.doSort(bookList);
		}
		for (BookInformation b : bookList)
		{
			System.out.println(b.toString());
		}
	}
}
