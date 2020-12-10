package foodItems;

public class Products {
	protected double price;
	protected String name;
	protected String desc;
	protected int itemNumber;
	
	protected String productType;
	protected String servedIn;

	public double getPrice() {
		return this.price;
	}
	
	public int getItemNo() {
		return this.itemNumber;
	}

	public String getName() {
		return this.name;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public String getType() {
		return this.productType;
	}
	
	public String getServContainer() {
		return this.servedIn;
	}
}

