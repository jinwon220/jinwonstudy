package Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lottos {
	private static Set<Integer> lottos = new TreeSet<>();
	private static Map<Integer, String> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	static int cnt = 1;
	
	public void start() {
		Lottos lo = new Lottos();
		while (true) {
			System.out.println("LOTTO");
			System.out.print("<1>생성 <2>삭제 <3>출력 <4>저장 <5>로드 <6>종료 : ");

			switch (sc.nextInt()) {
			case 1:
				lo.makeNum();
				break;
			case 2:
				lo.del();
				break;
			case 3:
				lo.print(lottos);
				break;
			case 4:
				lo.save(lottos);
				break;
			case 5:
				lo.load();
				break;
			case 6:
				return; //종료
			}
		}
	}
	
	private void del() {
		System.out.print("삭제 할 번호를 입력하세요 : ");
		int number = sc.nextInt();
		if(map.containsKey(number)) {
			map.remove(number);
		}else{
			System.out.println("해당 번호가 없습니다.");
		}
	}
	
	private void print(Set<Integer> lottos) {
		Iterator<Integer> it = lottos.iterator();
		if(lottos.size() < 1) {
			System.out.println("생성된 번호가 없습니다.");
		}else {
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
		}
	}
	
	private void load() {
		File file = new File("lottos.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
			fr =  new FileReader(file);
			br = new BufferedReader(fr);
			
			int data=0;
			while((data = br.read()) != -1) {
				System.out.print((char)data);
			}
		}catch(Exception e){
			System.out.println("불러오는데 실패하였습니다.");
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void makeNum() { // 6개를 만든다
		lottos = new TreeSet<>();
		while(lottos.size() < 6) {
			lottos.add(((int)(Math.random()*45)+1));
		}
		System.out.println("로또번호가 생성되었습니다.");
	}
	
	private void save(Set<Integer> lottos) { // 저장
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("lottos.txt", true);
			bw = new BufferedWriter(fw);
			
			map.put(cnt, lottos.toString());
			
			bw.write(cnt++ + "번째\t");
			bw.write(lottos.toString());
			bw.write("\n");
			System.out.println("저장이 완료 되었습니다.");
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
	public static void main(String[] args) {
		Lottos lo = new Lottos();
		lo.start();
	}
}
