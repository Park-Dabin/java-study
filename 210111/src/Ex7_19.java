public class Ex7_19 {
    public static void main(String args[]) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}
class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;
    void buy(Product p) {
        if(money<p.price)
            return;
        else{
            money -= p.price;
            add(p);
        }
    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] a = new Product[cart.length * 2]; //상단에 구입한 제품을 저장하기 위한 배열을 이용
            for (int x = 0; x < cart.length; x++) {
                a[x] = cart[x];
            }
            cart = a; //기존의 장바구니->새로운 장바구니
        }
        cart[i] = p;
        i++;
    }

    void summary() {
        String itemList = "";

        int result = 0;
        for(int y=0;y<cart.length;y++){
            result += cart[y].price;
            itemList += cart[y] + " ";
        }
        System.out.println("가격 : "+result);
        System.out.println("주문 목록 : "+itemList);
        System.out.println("남은 금액 : "+money);
    } // summary()
}
class Product {
    int price; // 제품의 가격
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}