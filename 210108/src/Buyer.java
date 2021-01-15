public class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
    int i = 0;

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(b.new Tv());
        b.buy(b.new Computer());
        b.buy(b.new Tv());
        b.buy(b.new Audio());
        b.buy(b.new Computer());
        b.buy(b.new Computer());
        b.buy(b.new Computer());
        b.summary();
    }
    void buy(Product p) {
        if (money < p.price)
            return;
        else {
            money -= p.price;
            add(p); //함수 불러오기 (print처럼)
        }

    }

    void add(Product p) {
        if (i >= cart.length) {
            Product[] a = new Product[cart.length * 2];
            for (int x = 0; x < cart.length; x++) {
                a[x] = cart[x]; //배열안의 내용 복사하기
            }
            cart = a; //기존의 장바구니를 바꾼다
        }
        cart[i] = p; //물건을 카트에 저장하는 방법
        i++;
    }

    void summary() {
        int result = 0;
        for (int y = 0; y < i; y++) {
            System.out.println(cart[y]);
            result += cart[y].price;
        }
        System.out.println(result);
        System.out.println(money);
    }

    class Product {
        int price;

        Product(int price) {
            this.price = price;
        }
    }

    class Tv extends Product {
        Tv() {
            super(100);
        }

        public String toString() {
            return "Tv";
        }
    }

    class Computer extends Product {
        Computer() {
            super(200);
        }

        public String toString() {
            return "Computer";
        }
    }

    class Audio extends Product {
        Audio() {
            super(50);
        }

        public String toString() {
            return "Audio";
        }
    }
}
