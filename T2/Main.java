package T2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Sasha");
        list.add("Sasha");
        list.add("Sasha");
        list.add("Ali");
        list.add("Ali");
        list.add("Ali");
        list.add("Dima");
        list.add("Ali");
        list.add("Sasha");
        list.add("Sasha");
        list.add("Dima");
        list.add("dima");
        list.add("Sasha");
        list.add("Sasha");

        long A = list.stream().filter(name -> name.equals("dima")).count();
        long B = list.stream().filter(name -> name.equals("Dima")).count();
        System.out.println("Дим в группе - " + A + "+" + B);
        long c = list.stream().filter(name -> name.startsWith("A")).count();
        System.out.println("на A - " + c);
        List<String> sortedList = list.stream().sorted(String::compareTo).toList();
        System.out.println("первое имя в листе - " + sortedList.stream().findFirst());


    }
}
