package Homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework {
	public static void main(String[] args) {
		Set<Integer> lottos = new TreeSet<>();
		
		while(lottos.size() < 6) {
			lottos.add(((int)(Math.random()*45)+1));
		}
		
		Iterator<Integer> it = lottos.iterator();
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("lottos.txt", true);
			bw = new BufferedWriter(fw);
			
			while(it.hasNext()) {
				bw.write(it.next()+" ");
			}
			fw.write("\n");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
