package Homework;
interface I_add_shot{ //샷 추가 되는 음료
    boolean shotChose(boolean shot);
}
interface I_no_shot{} //샷 추가 X
 
 
class Drink{ //음료 최상위 클래스
    int price; //가격
    String size; //사이즈
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
    
    Drink[] drinkarr = new Drink[8]; //8잔 만 구매 할 수 있다.
    int cnt = 0; //구입한 개수
    
    Buyer() {
        this(20000); //초기 잔액을 지정 하지 않아도 된다.
    }
    Buyer(int money){ //초기 잔액을 지정 할 수 있다.
        this.money = money;
    }
    
    void buy(I_no_shot no){
    	System.out.println("********영수증********");
        Drink drink = (Drink)no;
        if(this.money < drink.price) {
            System.out.println("잔액이 부족합니다 :D");
            System.out.println("********************");
            return; //종료
        }
        if(cnt >= 8) {
            System.out.println("주문 할 수 있는 개수가 초과 되었습니다.");
            System.out.println("********************");
            return; //종료
        }
        
        drinkarr[cnt++] = drink;
        this.money -= drink.price;
        System.out.print("주문한 음료는 : " + drink.toString());
        if(drink.ice == true) System.out.print(", ICE, ");
        else System.out.print(", HOT,");
        System.out.println(drink.size + "(SIZE) 입니다.");
        System.out.println("음료의 가격 : " + drink.price);
        System.out.println("남은 잔액 : " + this.money);
        System.out.println("********************");
    }
    
    void buy(I_add_shot add, boolean shot){
    	System.out.println("********영수증********");
        Drink drink = (Drink)add;
        if(this.money < drink.price) {
            System.out.println("잔액이 부족합니다 :D");
            System.out.println("********************");
            return; //종료
        }
        if(cnt >= 8) {
            System.out.println("주문 할 수 있는 개수가 초과 되었습니다.");
            System.out.println("********************");
            return; //종료
        }
        
        drinkarr[cnt++] = drink;
        this.money -= drink.price;
        
     
        System.out.print("주문한 음료는 : " );
        if(add.shotChose(shot) == true) {
        	System.out.print("샷 추가 ");
        	this.money -= 500;
        }
        System.out.print(drink.toString());
        if(drink.ice == true) System.out.print(", ICE, ");
        else System.out.print(", HOT,");
        System.out.println(drink.size + "(SIZE) 입니다.");
        System.out.print("음료의 가격 : " + drink.price);
        if(add.shotChose(shot) == true) System.out.print(" 샷 추가 500원 추가입니다");
        System.out.println("\n남은 잔액 : " + this.money);
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
