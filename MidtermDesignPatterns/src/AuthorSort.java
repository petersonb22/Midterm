import java.util.ArrayList;

public class AuthorSort implements SortBook {

	@Override
	public ArrayList<BookInformation> doSort(ArrayList<BookInformation> list) {
		// TODO Auto-generated method stub
		for (int i = list.size() -1; i > 0; i--) //basic bubble sort on title
		{
			for(int j = 0; j<i; j++)
			{
				if (list.get(j).getAuthor().compareTo(list.get(j+1).getAuthor())>0)
				{
					swap(j,j+1,list);
				}
			}
		}
		return list;
	}
	public void swap(int x, int y,ArrayList<BookInformation> list)
	{
		BookInformation tmp = list.get(x);
		list.set(x, list.get(y));
		list.set(y, tmp);
		
	}
}

