
public class BookInformation {
	private String title;
	private String author;
	private String yearPublished;
	private String summary;
	public BookInformation (String title,String author,String year, String summary)
	{
		this.title = title;
		this.author = author;
		this.yearPublished = year;
		this.summary = summary;
	}
	public String toString() {
		return (title + " by " + author + ". " + yearPublished + " " + summary);
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getYear()
	{
		return yearPublished;
	}
}
