package smartdatatry;
import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws NullPointerException{
		String filename = "D:\\Users\\gregar\\eclipse-workspace\\dataa.txt";
		String line = null ;
		try {
			int count = 0;
			FileReader filereader = new FileReader(filename);
			BufferedReader bufferedreader= new BufferedReader(filereader);
			LinkedList<Objects> lines= new LinkedList<Objects>();
			HashMap<Integer,Objects> mapper= new HashMap<Integer,Objects>();
			
				
			bufferedreader.readLine();
			while ((line = bufferedreader.readLine())!=null) {
				String[] splits = line.split("\\t");
				count ++;
				lines.add(new Objects(Integer.valueOf(splits[0]),splits[1],splits[2],Integer.valueOf(splits[3]),splits[4],splits[5],splits[6],splits[7]));
			}
			//System.out.println(lines.get(1).getTeam());
			//System.out.println(count);
			int c=0;
			for (Objects o: lines) {
			
			mapper.put(c+1, lines.get(c));
			c=c+1;
			//System.out.print(mapper.get(1));
//			System.out.println(o);
			}
			System.out.println(mapper.size());
			Comparators comp=new Comparators();
			int cc=mapper.size();
			for (int i=1; i<= cc;i++) {
				inner:
				for (int j=i+1;j<=cc;j++) {
					boolean a = comp.comparator(mapper.get(i),mapper.get(j));
					if (a) {
					mapper.remove(i);
					j--;
					break inner;
					}
				}
			}
			
			System.out.println(mapper.size());
				
			bufferedreader.close();
			
			filewriting fw= new filewriting();
			fw.wriiting(mapper);
			
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("unable to open the file" + filename+ " ");
		}
		catch(IOException ex) {
			System.out.println("Error reading the file " + filename+ " ");
		}
		
		}
	
	}