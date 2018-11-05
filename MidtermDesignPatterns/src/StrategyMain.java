
public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookLibrarian library = new BookLibrarian();
		//add 20 books
		library.addBook(new BookInformation("Lord of the Rings","Tolkien","1954","Classic Fantasy Epic"));
		library.addBook(new BookInformation("Beowulf","Anonymous","0975","Ancient Anglo-Saxon Epic"));
		library.addBook(new BookInformation("Call of Cthulhu","Lovecraft","1928","Influential American Horror"));
		library.addBook(new BookInformation("Guards, Guards","Pratchett","1989","Humorous Fantasy Parody"));
		library.addBook(new BookInformation("Inferno","Dante","1320","Book 1 of Divine Comedy"));
		library.addBook(new BookInformation("Frankenstein","Shelley","1818","Early horror story"));
		library.addBook(new BookInformation("Dracula","Stoker","1897","Original Dracula story"));
		library.addBook(new BookInformation("Ready Player One","Cline","2011","Sci-fi VR story"));
		library.addBook(new BookInformation("Golden Compass","Pullman","1985","YA fantasy"));
		library.addBook(new BookInformation("Green Eggs and Ham","Seuss","1960","Kid's Picture Book"));
		library.addBook(new BookInformation("Johnathon Strange and Mr. Norrell","Clarke","2004","Alternate History British fantasy novel"));
		library.addBook(new BookInformation("Secret History","Tartt","1992","Realistic Fiction"));
		library.addBook(new BookInformation("Tempest","Shakespeare","1623","Fantasy Play"));
		library.addBook(new BookInformation("Dune","Herbert","1965","Sci-fi environmentalist story"));
		library.addBook(new BookInformation("American Gods","Gaiman","2007","Modern fantastic fiction"));
		library.addBook(new BookInformation("Leviathan Wakes","Corey","2011","Sci-Fi,horror detective fiction"));
		library.addBook(new BookInformation("Artemis Fowl","Colfer","2001","YA Sci-Fi Fantasy"));
		library.addBook(new BookInformation("Winter King","Cornwell","1995","Retelling of Arthurian Legend"));
		library.addBook(new BookInformation("Once and Future King","White","1958","Retelling of Arthurian Legend"));
		library.addBook(new BookInformation("Brave New World","Huxley","1932","Science Fiction"));
		
		library.setSort(new TitleSort());
		library.printList();
		library.setSort(new AuthorSort());
		library.printList();
		library.setSort(new YearSort());
		library.printList();
	}

}
