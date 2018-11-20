package smartdatatry;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class filewriting {
	public void wriiting(HashMap<Integer,Objects> mapper) {
		try {
		FileWriter filewriter1 = new FileWriter("D:\\Users\\gregar\\eclipse-workspace\\east.txt");
		FileWriter filewriter2 = new FileWriter("D:\\Users\\gregar\\eclipse-workspace\\west.txt");
		FileWriter filewriter3 = new FileWriter("D:\\Users\\gregar\\eclipse-workspace\\null.txt");
		BufferedWriter bw1 = new BufferedWriter(filewriter1);
		BufferedWriter bw2 = new BufferedWriter(filewriter2);
		BufferedWriter bw3 = new BufferedWriter(filewriter3);
		
		Iterator<Integer> itr = mapper.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			Objects conf= new Objects(mapper.get(key));
			if (conf.getConference().equalsIgnoreCase("East")) {
				bw1.write(conf.getage() + "\t"+ conf.getConference()+"\t"+conf.getDate()+"\t"+conf.getyear()+"\t"+conf.getPlayer()+"\t"+conf.getposition()+"\t"+conf.getseason()+"\t"+conf.getTeam());
				bw1.newLine();
			}
			else if (conf.getConference().equalsIgnoreCase("West")) {
				bw2.write(conf.getage() + "\t"+ conf.getConference()+"\t"+conf.getDate()+"\t"+conf.getyear()+"\t"+conf.getPlayer()+"\t"+conf.getposition()+"\t"+conf.getseason()+"\t"+conf.getTeam());
				bw2.newLine();
			}
			else {
				bw3.write(conf.getage() + "\t"+ conf.getConference()+"\t"+conf.getDate()+"\t"+conf.getyear()+"\t"+conf.getPlayer()+"\t"+conf.getposition()+"\t"+conf.getseason()+"\t"+conf.getTeam());
				bw3.newLine();
			}
		}
		System.out.println("the data are not seprated into three different files according to conferences");
		bw1.close();
		bw2.close();
		bw3.close();
	}
		catch(FileNotFoundException ex) {
			System.out.println("unable to open the file");
		}
		catch(IOException ex) {
			System.out.println("Error reading the file ");
		}
	}
	
}
