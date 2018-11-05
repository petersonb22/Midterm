public class InventoryItem {
	String type;
	int weight;
	String name;
	int count; // 1 if a single item; more if multiple
	
	public InventoryItem(String t, int w, String n, int countOfItems) {
		type = t;
		weight = w;
		name = n;
		count = countOfItems;
	}
	
	public String getName() { return name;}
	public String getType() { return type;}
	public int getWeight() {return weight;}
	public int getCount() {return count;}
	
	@Override
	public String toString() { //change return string to make testing easier
		String ret  = name + " " + type + " " + weight; //Remove extra format characters
		if (count > 1) {
			ret += " " + count;
		}
		return ret; //was name
		
	}

}
