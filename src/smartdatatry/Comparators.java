package smartdatatry;

public class Comparators {
	
	public static boolean comparator(Objects o1, Objects o2) {
		if (o1.getyear() == o2.getyear() && o1.getage()== o2.getage() && o1.getConference().equals(o2.getConference()) && 
			o1.getPlayer().equals(o2.getPlayer())	&&
			o1.getDate().equals(o2.getDate()) &&
			o1.getseason().equals(o2.getseason()) &&
			o1.getTeam().equals(o2.getTeam())) {
			return true;
		}
		else
		return false;
}	
	
	

}
