import java.util.*;

class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> kyo = new ArrayList<>(); // 교집합
        ArrayList<Integer> cha = new ArrayList<>(); // 차집합
        ArrayList<Integer> hap = new ArrayList<>(); // 합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        for(int i:list1){
            cha.add(i);
            for(int j:list2){
                if(i==j) {
                    kyo.add(i);
                }
            }
            cha.removeAll(kyo);
        }
        hap.addAll(cha);
        hap.addAll(list2);

        System.out.println("list1="+list1);
        System.out.println("list2="+list2);
        System.out.println("kyo="+kyo);
        System.out.println("cha="+cha);
        System.out.println("hap="+hap);
    }
}