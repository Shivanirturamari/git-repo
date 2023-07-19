class Carrom{
	
	String TeamName;       
	int noOfPlayers;       
	String TeamPlayer;     
	String KingOfCarrom;   
	int originatedCentury ;
	
	
	Carrom()
	{
		System.out.println("invoking the Carrom with no argument");
		System.out.println("from the Carrom:"+this.TeamName);
		System.out.println("from the Carrom:"+this.noOfPlayers);
		System.out.println("from the Carrom:"+this.TeamPlayer);
		System.out.println("from the Carrom:"+this.KingOfCarrom);
		System.out.println("from the Carrom:"+this.originatedCentury);
	}
	
	Carrom(String TeamName,int noOfPlayers)
	{
		System.out.println("invoking the Carrom with argument");
		this.TeamName=TeamName;
		this.noOfPlayers=noOfPlayers;
	}
	
	Carrom(String TeamName,int noOfPlayers, String TeamPlayer)
	{
		System.out.println("invoking the Carrom with argument");
		this.TeamName=TeamName;
		this.noOfPlayers=noOfPlayers;
		this.TeamPlayer=TeamPlayer;
	}
	
	Carrom(String TeamName,int noOfPlayers, String TeamPlayer, String KingOfCarrom)
	{
		System.out.println("invoking the Carrom with argument");
		this.TeamName=TeamName;
		this.noOfPlayers=noOfPlayers;
		this.TeamPlayer=TeamPlayer;
		this.KingOfCarrom=KingOfCarrom;
	}
	
	Carrom(String TeamName,int noOfPlayers, String TeamPlayer, String KingOfCarrom, int originatedCentury)
	{
		System.out.println("invoking the Carrom with argument");
		this.TeamName=TeamName;
		this.noOfPlayers=noOfPlayers;
		this.TeamPlayer=TeamPlayer;
		this.KingOfCarrom=KingOfCarrom;
		this.originatedCentury=originatedCentury;
	}
}