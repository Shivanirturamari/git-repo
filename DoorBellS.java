class DoorBellS{
	
	String brand;       
	int noOfDoorBellS;       
	String color;     
	String type;   
	int price ;
	String materialUsed;
	String components;
	
	DoorBellS()
	{
		System.out.println("invoking the DoorBellS with no argument");
		System.out.println("from the DoorBellS:"+this.brand);
		System.out.println("from the DoorBellS:"+this.noOfDoorBellS);
		System.out.println("from the DoorBellS:"+this.color);
		System.out.println("from the DoorBellS:"+this.type);
		System.out.println("from the DoorBellS:"+this.price);
		System.out.println("from the DoorBellS:"+this.materialUsed);
		System.out.println("from the DoorBellS:"+this.components);		
	}
	
	DoorBellS(String brand,int noOfDoorBellS)
	{
		System.out.println("invoking the DoorBellS with argument");
		this.brand=brand;
		this.noOfDoorBellS=noOfDoorBellS;
	}
	
	DoorBellS(String brand,int noOfDoorBellS, String color)
	{
		System.out.println("invoking the DoorBellS with argument");
		this.brand=brand;
		this.noOfDoorBellS=noOfDoorBellS;
		this.color=color;
	}
	
	DoorBellS(String brand,int noOfDoorBellS, String color, String type)
	{
		System.out.println("invoking the DoorBellS with argument");
		this.brand=brand;
		this.noOfDoorBellS=noOfDoorBellS;
		this.color=color;
		this.type=type;
	}
	
	DoorBellS(String brand,int noOfDoorBellS, String color, String type, int price)
	{
		System.out.println("invoking the DoorBellS with argument");
		this.brand=brand;
		this.noOfDoorBellS=noOfDoorBellS;
		this.color=color;
		this.type=type;
		this.price=price;
	}
	
	DoorBellS(String brand,int noOfDoorBellS, String color, String type, int price, String materialUsed)
	{
		System.out.println("invoking the DoorBellS with argument");
		this.brand=brand;
		this.noOfDoorBellS=noOfDoorBellS;
		this.color=color;
		this.type=type;
		this.price=price;
		this.materialUsed=materialUsed;
	}
	
	DoorBellS(String brand,int noOfDoorBellS, String color, String type, int price, String materialUsed, String components)
	{
		System.out.println("invoking the DoorBellS with argument");
		this.brand=brand;
		this.noOfDoorBellS=noOfDoorBellS;
		this.color=color;
		this.type=type;
		this.price=price;
		this.materialUsed=materialUsed;
		this.components=components;
	}
}