package Homework;
interface I_add_shot{ //�� �߰� �Ǵ� ����
    boolean shotChose(boolean shot);
}
interface I_no_shot{} //�� �߰� X
 
 
class Drink{ //���� �ֻ��� Ŭ����
    int price; //����
    String size; //������
    boolean ice; //false = hot
    
    Drink(int price, String size, boolean ice){
        this.price = price;
        this.size = size;
        this.ice = !ice;
    }
}
 
class Caffeine extends Drink{
    Caffeine(int price, String size, boolean ice) {
        super(price, size, ice);
    }
}
 
class NonCaffeine extends Drink{
    NonCaffeine(int price, String size, boolean ice) {
        super(price, size, ice);
    }
}
//Cafeine~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class Espresso extends Caffeine implements I_no_shot{
    Espresso(String size, boolean ice) {
        super(2000, size, ice);
    }
 
    @Override
    public String toString() {
        return "Espresso";
    }    
}
 
class Americano extends Caffeine implements I_add_shot{
    Americano(String size, boolean ice) {
        super(2500, size, ice);
    }
 
    @Override
    public String toString() {
        return "Americano";
    }
 
    @Override
    public boolean shotChose(boolean shot) {
        return shot;
    }    
}
 
class VanillaLatte extends Caffeine implements I_add_shot{
    VanillaLatte(String size, boolean ice) {
        super(3000, size, ice);
    }
 
    @Override
    public String toString() {
        return "VanillaLatte";
    }    
    
    @Override
    public boolean shotChose(boolean shot) {
        return shot;
    }
}
//Cafeine~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//NonCafeine~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
class GreenteeLatte extends NonCaffeine implements I_add_shot{
    GreenteeLatte(String size, boolean ice) {
        super(4000, size, ice);
    }
    
    @Override
    public String toString() {
        return "GreenteeLatte";
    }    
    
    @Override
    public boolean shotChose(boolean shot) {
        return shot;
    }    
}
class StrawberrySmoothe extends NonCaffeine implements I_no_shot{
    StrawberrySmoothe(String size, boolean ice) {
        super(5000, size, ice);
    }
    
    @Override
    public String toString() {
        return "StrawberrySmoothe";
    }    
}
class EarlGreytee extends NonCaffeine implements I_no_shot{
    EarlGreytee(String size, boolean ice) {
        super(3000, size, ice);
    }
    
    @Override
    public String toString() {
        return "EarlGreytee";
    }    
}
//NonCafeine~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 
//Buyer
class Buyer{
    int money;
    
    Drink[] drinkarr = new Drink[8]; //8�� �� ���� �� �� �ִ�.
    int cnt = 0; //������ ����
    
    Buyer() {
        this(20000); //�ʱ� �ܾ��� ���� ���� �ʾƵ� �ȴ�.
    }
    Buyer(int money){ //�ʱ� �ܾ��� ���� �� �� �ִ�.
        this.money = money;
    }
    
    void buy(I_no_shot no){
    	System.out.println("********������********");
        Drink drink = (Drink)no;
        if(this.money < drink.price) {
            System.out.println("�ܾ��� �����մϴ� :D");
            System.out.println("********************");
            return; //����
        }
        if(cnt >= 8) {
            System.out.println("�ֹ� �� �� �ִ� ������ �ʰ� �Ǿ����ϴ�.");
            System.out.println("********************");
            return; //����
        }
        
        drinkarr[cnt++] = drink;
        this.money -= drink.price;
        System.out.print("�ֹ��� ����� : " + drink.toString());
        if(drink.ice == true) System.out.print(", ICE, ");
        else System.out.print(", HOT,");
        System.out.println(drink.size + "(SIZE) �Դϴ�.");
        System.out.println("������ ���� : " + drink.price);
        System.out.println("���� �ܾ� : " + this.money);
        System.out.println("********************");
    }
    
    void buy(I_add_shot add, boolean shot){
    	System.out.println("********������********");
        Drink drink = (Drink)add;
        if(this.money < drink.price) {
            System.out.println("�ܾ��� �����մϴ� :D");
            System.out.println("********************");
            return; //����
        }
        if(cnt >= 8) {
            System.out.println("�ֹ� �� �� �ִ� ������ �ʰ� �Ǿ����ϴ�.");
            System.out.println("********************");
            return; //����
        }
        
        drinkarr[cnt++] = drink;
        this.money -= drink.price;
        
     
        System.out.print("�ֹ��� ����� : " );
        if(add.shotChose(shot) == true) {
        	System.out.print("�� �߰� ");
        	this.money -= 500;
        }
        System.out.print(drink.toString());
        if(drink.ice == true) System.out.print(", ICE, ");
        else System.out.print(", HOT,");
        System.out.println(drink.size + "(SIZE) �Դϴ�.");
        System.out.print("������ ���� : " + drink.price);
        if(add.shotChose(shot) == true) System.out.print(" �� �߰� 500�� �߰��Դϴ�");
        System.out.println("\n���� �ܾ� : " + this.money);
        System.out.println("********************");
    }
}
public class Coffee {

	public static void main(String[] args) {
		Espresso espresso = new Espresso("M", false);
		Americano americano = new Americano("L", true);
		VanillaLatte vanillaLatte = new VanillaLatte("M", false);
        GreenteeLatte greenteeLatte = new GreenteeLatte("L", true);
        StrawberrySmoothe strawberrySmoothe = new StrawberrySmoothe("M", false);
        EarlGreytee earlGreytee = new EarlGreytee("L", true);
        
        Buyer buyer = new Buyer(30000);
        buyer.buy(espresso);
        buyer.buy(americano, true);
        buyer.buy(vanillaLatte, false);
        buyer.buy(greenteeLatte, true);
        buyer.buy(strawberrySmoothe);
        buyer.buy(earlGreytee);
        buyer.buy(espresso);
        buyer.buy(vanillaLatte, true);
        buyer.buy(strawberrySmoothe);
	}

}
