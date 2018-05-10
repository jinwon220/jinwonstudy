package kr.or.bit;

import java.util.HashMap;
import java.util.Scanner;

class SeatInfo {
    private boolean reservation; // ���� ����
    private String seat = "��";
    private String rname = ""; // �������̸�
 
    public boolean reservation(String rname) {
        if (!reservation) {
            this.seat = "��";
            reservation = true;
            this.rname = rname;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean cancelUser(String rname) {
        if(this.rname.equals(rname) && this.reservation) {
            this.seat = "��";
            reservation = false;
            this.rname = "";
            return true;
        }else {
            return false;
        }
    }
    
    public boolean cancelAdmin() {
        if(this.reservation) {
            this.seat = "��";
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
		 
        System.out.print("�̸��� �Է����ּ���->");
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
            try { // �����Է� ���� �� ����ó��
                menu = Integer.parseInt(sc.nextLine());
            }catch (Exception e) {
                continue;
            }
            
            switch (menu) {
            case 1: // ��ȸ
                System.out.println("�¼���ȸ �����Դϴ�.");
                printSeat(seat);
                break;
                
            case 2: // ����
                System.out.print("���� �����ϼ���->");
                int row = Integer.parseInt(sc.nextLine());
                System.out.print("���� �����ϼ���->");
                int col = Integer.parseInt(sc.nextLine());
                
                if(seat.containsKey(row * 10 + col)) {
                    SeatInfo temp = seat.get(row * 10 + col);
                    if (temp.reservation(name)) {
                        System.out.println(row + "�� " + col + "�� �¼��� ����Ǿ����ϴ�.");
                    } else {
                        System.out.println("�̹� ����Ǿ��ֽ��ϴ�.");
                    }
                    printSeat(seat);
                }else {
                    System.out.println("��� ���� �ٽ� �Է����ּ���");
                }
                break;
                
            case 3: // ���������
                System.out.print("���� �����ϼ���->");
                int row3 = Integer.parseInt(sc.nextLine());
                System.out.print("���� �����ϼ���->");
                int col3 = Integer.parseInt(sc.nextLine());
                
                if(seat.containsKey(row3 * 10 + col3)) {
                    SeatInfo temp3 = seat.get(row3 * 10 + col3);
                    if (temp3.cancelUser(name)) {
                        System.out.println(row3 + "�� " + col3 + "�� �¼��� ������ҵǾ����ϴ�.");
                    } else {
                        System.out.println("�����ڰ� �ƴմϴ�.");
                    }
                    printSeat(seat);
                }else {
                    System.out.println("��� ���� �ٽ� �Է����ּ���");
                }
                break;
                
            case 4: // ���������
                System.out.print("���� �����ϼ���->");
                int row4 = Integer.parseInt(sc.nextLine());
                System.out.print("���� �����ϼ���->");
                int col4 = Integer.parseInt(sc.nextLine());
                
                if(seat.containsKey(row4 * 10 + col4)) {
                    SeatInfo temp4 = seat.get(row4 * 10 + col4);
                    if (temp4.cancelAdmin()) {
                        System.out.println(row4 + "�� " + col4 + "�� �¼��� ������ҵǾ����ϴ�.");
                    } else {
                        System.out.println("������ �� �Ǿ��ֽ��ϴ�.");
                    }
                    printSeat(seat);
                }else {
                    System.out.println("��� ���� �ٽ� �Է����ּ���");
                }
                break;
            default:
                break;
            }
        } while (menu != 5);
        System.out.println("���� �Ǿ����ϴ�.");
    }
 
    public static void printMenu(String name) {
        System.out.println("1. ��ȸ  2.����  3.���������  4.���������  5.����(���)  �α���(" + name + ")");
        System.out.print("���Ͻô� ���񽺸� �������ּ���->");
    }
 
    public static void printSeat(HashMap<Integer, SeatInfo> seat) {
        for(int i = 1; i <= 4; i++) {
            System.out.print((char)(i+64)+"��  ");
            for(int j=1; j<=8; j++) {
                System.out.print(j + ((SeatInfo)seat.get(i*10+j)).getSeat() + "  ");
            }
            System.out.println();
        }
    }
}