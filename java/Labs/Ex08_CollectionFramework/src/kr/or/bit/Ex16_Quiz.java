package kr.or.bit;

import java.util.HashMap;
import java.util.Scanner;

class SeatInfo {
    private boolean reservation; // 예약 상태
    private String seat = "□";
    private String rname = ""; // 예약자이름
 
    public boolean reservation(String rname) {
        if (!reservation) {
            this.seat = "■";
            reservation = true;
            this.rname = rname;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean cancelUser(String rname) {
        if(this.rname.equals(rname) && this.reservation) {
            this.seat = "□";
            reservation = false;
            this.rname = "";
            return true;
        }else {
            return false;
        }
    }
    
    public boolean cancelAdmin() {
        if(this.reservation) {
            this.seat = "□";
            reservation = false;
            this.rname = "";
            return true;
        }else {
            return false;
        }
    }
 
    public String getSeat() {
        return seat;
    }
}

public class Ex16_Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("이름을 입력해주세요->");
        String name = sc.nextLine();
 
        HashMap<Integer, SeatInfo> seat = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                seat.put(i * 10 + j, new SeatInfo());
            }
        }
 
        int menu = 0;
        do {
            printMenu(name);
            try { // 문자입력 했을 때 에러처리
                menu = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                continue;
            }
            
            switch (menu) {
            case 1: // 조회
                System.out.println("좌석조회 서비스입니다.");
                printSeat(seat);
                break;
                
            case 2: // 예약
                System.out.print("열을 선택하세요->");
                int row = Integer.parseInt(sc.nextLine());
                System.out.print("행을 선택하세요->");
                int col = Integer.parseInt(sc.nextLine());
                
                if(seat.containsKey(row * 10 + col)) {
                    SeatInfo temp = seat.get(row * 10 + col);
                    if (temp.reservation(name)) {
                        System.out.println(row + "열 " + col + "행 좌석이 예약되었습니다.");
                    } else {
                        System.out.println("이미 예약되어있습니다.");
                    }
                    printSeat(seat);
                }else {
                    System.out.println("행과 열을 다시 입력해주세요");
                }
                break;
                
            case 3: // 예약자취소
                System.out.print("열을 선택하세요->");
                int row3 = Integer.parseInt(sc.nextLine());
                System.out.print("행을 선택하세요->");
                int col3 = Integer.parseInt(sc.nextLine());
                
                if(seat.containsKey(row3 * 10 + col3)) {
                    SeatInfo temp3 = seat.get(row3 * 10 + col3);
                    if (temp3.cancelUser(name)) {
                        System.out.println(row3 + "열 " + col3 + "행 좌석이 예약취소되었습니다.");
                    } else {
                        System.out.println("예약자가 아닙니다.");
                    }
                    printSeat(seat);
                }else {
                    System.out.println("행과 열을 다시 입력해주세요");
                }
                break;
                
            case 4: // 관리자취소
                System.out.print("열을 선택하세요->");
                int row4 = Integer.parseInt(sc.nextLine());
                System.out.print("행을 선택하세요->");
                int col4 = Integer.parseInt(sc.nextLine());
                
                if(seat.containsKey(row4 * 10 + col4)) {
                    SeatInfo temp4 = seat.get(row4 * 10 + col4);
                    if (temp4.cancelAdmin()) {
                        System.out.println(row4 + "열 " + col4 + "행 좌석이 예약취소되었습니다.");
                    } else {
                        System.out.println("예약이 안 되어있습니다.");
                    }
                    printSeat(seat);
                }else {
                    System.out.println("행과 열을 다시 입력해주세요");
                }
                break;
            default:
                break;
            }
        } while (menu != 5);
        System.out.println("종료 되었습니다.");
    }
 
    public static void printMenu(String name) {
        System.out.println("1. 조회  2.예약  3.예약자취소  4.관리자취소  5.종료(기능)  로그인(" + name + ")");
        System.out.print("원하시는 서비스를 선택해주세요->");
    }
 
    public static void printSeat(HashMap<Integer, SeatInfo> seat) {
        for(int i = 1; i <= 4; i++) {
            System.out.print((char)(i+64)+"열  ");
            for(int j=1; j<=8; j++) {
                System.out.print(j + ((SeatInfo)seat.get(i*10+j)).getSeat() + "  ");
            }
            System.out.println();
        }
    }
}