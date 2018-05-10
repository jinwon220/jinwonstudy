package study;

public class study01 {

	public static void main(String[] args) {
		// [첫번째 문제] 다음과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 1+(-2)+3+(-4)+... , 100이상이 되는지 구하시오.
		int sum = 0;
		int i = 1;
		for(i = 1; true; i++) {
			if(i%2 == 0)sum += -i; 
			else sum += i;
			if (sum >= 100)
				break;
		}
		System.out.println("sum = " + sum + "\ni(n번째) =" + i);
		//답 : 199번째
		
		
		// 두번째 문제
		int answer = (int)(Math.random()*100)+1; //1~100사이의 임의의 값
		int input = 0; //사용자입력을 저장할 공간
		int count = 0; //시도횟수
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요 : ");
			input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.
			
			if(answer > input)System.out.println("\n 더 큰수를 입력하세요");
			else if (answer < input)System.out.println("\n 더 작은 수를 입력하세요");
			else if (answer == input) {
				System.out.println("\n 맞췄습니다  " + count + "번 만에 맞추셨습니다.");	
				
				break;
			}
		} while(true); //무한 반복
	}

}
