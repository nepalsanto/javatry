package smartdatatry;

public class Objects {
	private int age;
	private String Conference;
	private String Date;
	private int year;
	private String Player;
	private String position;
	private String season;
	private String Team;
	
// constructor 	
public Objects(int age,String Conference, String Date, int year, String Player,String position, String season, String Team ) {
	this.age=age;
	this.Conference=Conference;
	this.Date=Date;
	this.year=year;
	this.Player=Player;
	this.position=position;
	this.season=season;
	this.Team=Team;
}

public Objects(Objects obj ) {
	this.age=obj.age;
	this.Conference=obj.Conference;
	this.Date=obj.Date;
	this.year=obj.year;
	this.Player=obj.Player;
	this.position =obj. position;
	this.season=obj.season;
	this.Team=obj.Team;
}



//getting the values from the object 
public int getage() {
	return age;
}

public String getConference() {
	return Conference;
}

public String getDate() {
	return Date;
}

public String getPlayer() {
	return Player;
}

public String getposition() {
	return position;
}
public String getseason() {
	return season;
}
public String getTeam() {
	return Team;
}

public int getyear() {
	return year;
}

// setting the values of the objects 
public void setage(int age) {
	this.age=age;
}
public void setyear(int year) {
	this.year=year;
}
public void setDate(String Date) {
	this.Date=Date;
}

public void setPlayer(String Player) {
	this.Player=Player;
}
public void set(String Conference) {
	this.Conference=Conference;
}
public void setPostion(String postition) {
	this.position = position;
}
public void setseason(String season) {
	this.season=season;
}
public void setTeam(String Team) {
	this.Team=Team;
}
}


