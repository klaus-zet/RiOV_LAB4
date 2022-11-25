import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box box2 = new Box(orange1, orange2);
        System.out.println(box2.get());
        System.out.println(box2.getWeight());

        Box box1 = new Box(apple1, apple2, apple3);
        System.out.println(box1.getWeight());

        Box box3 = new Box(orange3);
        System.out.println(box3.getWeight());

        System.out.println(box1.compare(box2));

        System.out.println(box3.get());

        box2.mix_box(box3);
        System.out.println(box2.get());
        System.out.println(box2.getWeight());
        System.out.println(box3.get());
        System.out.println(box3.getWeight());


    }
}

