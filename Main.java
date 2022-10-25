import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 99; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println("оригинал " + list);

        List<Integer> first = list.stream().distinct().toList();
        System.out.println("без повторов " + first);

        List<Integer> second = list.stream().distinct().limit(17).skip(7).filter(i -> i % 2 == 0).toList();
        System.out.println("чётные 7 - 17 " + second);

        List<Integer> third = second.stream().map(a -> a * 2).toList();
        System.out.println("помноженые на 2 " + third);

        List<Integer> fourth = third.stream().limit(4).sorted(Integer::compareTo).toList();
        System.out.println("первые 4 по возрастанию" + fourth);

        long a = fourth.stream().count();
        System.out.println("размер " + a);

    }
}