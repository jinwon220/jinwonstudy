package study;

public class homework {

	public static void main(String[] args) {
		
		// 위쪽 오른방향 직각삼각형
        for (int i = 1; i <= 5; i++) { // i=1부터 증가하며 5번 반복
            for (int j = 1; j <= i; j++) // j=1부터 i보다 커질 때 까지 증가하며 반복
                System.out.print("*");
            System.out.println();
        }
 
        System.out.println("\n\n\n");
 
        // 아래쪽 오른방향 직각삼각형
        for (int i = 1; i <= 5; i++) { // i=1부터 증가하며 5번 반복
            for (int j = 5; j >= i; j--) // j=1부터 i보다 작아질 때 까지 증감하며 반복
                System.out.print("*");
            System.out.println();
        }
        
        System.out.println("\n\n\n");
 
        // 위쪽 왼방향 직각삼각형        
        for (int i = 1; i <= 5; i++) { // i=1부터 증가하며 5번 반복
            // 빈칸으로 아래쪽 오른방향 직각삼각형을 만든다
            for (int j = 5; j >= i + 1; j--) // j=5부터 i+1보다 작아질 때 까지 증감하며 반복
                System.out.print(" "); // 빈칸
            // 빈칸 옆에다 *을 찍어주며 i가 커질 수록 *찍는 갯수가 증가
            for (int j = 1; j <= i; j++) // j=1부터 i보다 커질 때 까지 증가하며 반복
                System.out.print("*");
            System.out.println();
        }
        
        System.out.println("\n\n\n");
        
        // 아래쪽 왼방향 직각삼각형
        for (int i = 1; i <= 5; i++) { // i=1부터 증가하면 5번 반복
            // 빈칸으로 위쪽 오른방향 직각삼각형을 만든다
            for (int j = 1; j <= i-1; j++) // j=1부터 i-1보다 커질 때 까지 증가하며 반복
                System.out.print(" ");
            // 빈칸 옆에다 *을 찍어주며 i가 커질 수록 *찍는 갯수 감소
            for (int j = 5; j >= i; j--) // j=5부터 i보다 작아질 때 까지 증감하며 반복
                System.out.print("*");
            System.out.println();
        }

        System.out.println("\n\n\n");
		
     // 위쪽 삼각형
        for (int i = 1; i <= 4; i++) {
            //빈칸으로 사각형 생성
            for (int j = 4; j > 0; j--)
                System.out.print(" ");
            //위쪽 왼방향 직각삼각형
            for (int j = 4; j >= i + 1; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            //위쪽 오른방향 직각삼각형
            for (int j = 2; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        // 왼쪽 삼각형 & 오른쪽 삼각형
        for (int i = 1; i <= 4; i++) {
            //위쪽 왼방향 직각삼각형
            for (int j = 4; j >= i + 1; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            //빈칸으로 사각형 생성
            for (int j = 7; j > 0; j--)
                System.out.print(" ");
            //위쪽 오른방향 직각삼각형
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            //아래쪽 왼방향 직각삼각형
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 3; j >= i; j--)
                System.out.print("*");
            //빈칸으로 사각형 생성
            for (int j = 7; j > 0; j--)
                System.out.print(" ");
            //아래쪽 오른방향 직각삼각형
            for (int j = 3; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
        // 아래쪽 삼각형
        for (int i = 1; i <= 4; i++) {
            //아래쪽 왼방향 직각삼각형
            for (int j = -2; j <= i; j++)
                System.out.print(" ");
            for (int j = 3; j >= i; j--)
                System.out.print("*");
            //아래쪽 오른방향 직각삼각형
            for (int j = 4; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
	}
}
