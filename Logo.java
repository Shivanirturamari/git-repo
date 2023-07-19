class Logo{
	
	String brand;       
	int noOfLogo;       
	String color;     
	String type;   
	int price ;
	String materialUsed;
	String components;
	int established;
	String format;
	
	Logo()
	{
		System.out.println("invoking the Logo with no argument");
		System.out.println("from the Logo:"+this.brand);
		System.out.println("from the Logo:"+this.noOfLogo);
		System.out.println("from the Logo:"+this.color);
		System.out.println("from the Logo:"+this.type);
		System.out.println("from the Logo:"+this.price);
		System.out.println("from the Logo:"+this.materialUsed);
		System.out.println("from the Logo:"+this.components);
		System.out.println("from the Logo:"+this.established);
		System.out.println("from the Logo:"+this.format);		
	}
	
	Logo(String brand,int noOfLogo)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
	}
	
	Logo(String brand,int noOfLogo, String color)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
		this.color=color;
	}
	
	Logo(String brand,int noOfLogo, String color, String type)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
		this.color=color;
		this.type=type;
	}
	
	Logo(String brand,int noOfLogo, String color, String type, int price)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
		this.color=color;
		this.type=type;
		this.price=price;
	}
	
	Logo(String brand,int noOfLogo, String color, String type, int price, String materialUsed)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
		this.color=color;
		this.type=type;
		this.price=price;
		this.materialUsed=materialUsed;
	}
	
	Logo(String brand,int noOfLogo, String color, String type, int price, String materialUsed, String components)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
		this.color=color;
		this.type=type;
		this.price=price;
		this.materialUsed=materialUsed;
		this.components=components;
	}
	
	Logo(String brand,int noOfLogo, String color, String type, int price, String materialUsed, String components, int established)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
		this.color=color;
		this.type=type;
		this.price=price;
		this.materialUsed=materialUsed;
		this.components=components;
		this.established=established;
	}
	
	Logo(String brand,int noOfLogo, String color, String type, int price, String materialUsed, String components, int established, String format)
	{
		System.out.println("invoking the Logo with argument");
		this.brand=brand;
		this.noOfLogo=noOfLogo;
		this.color=color;
		this.type=type;
		this.price=price;
		this.materialUsed=materialUsed;
		this.components=components;
		this.established=established;
		this.format=format;
	}
}