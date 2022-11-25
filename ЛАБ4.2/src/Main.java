public class Main {
    public static void main(String[] args) {
        MyList<String> a = new MyList<String>();
        a.add("apple");
        a.print();
        a.add("orange", "pineapple", "watermelon");
        a.print();
        System.out.println(a.size());
        a.remove(2);
        a.print();
        a.remove("orange");
        a.print();
        System.out.println(a.get(1));
        a.clear();
        System.out.println(a.size());
    }
}