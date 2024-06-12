package challenge.one;

import java.util.List;
import java.util.stream.Stream;

public class MemberDemo {
    public static void main(String[] args) {
        Stream<String> ss;
        List<String> names = List.of("È«±æµ¿", "¹èÀåÈ­", "ÀÓ²©Á¤", "¿¬ÈïºÎ", "±è¼±´Þ", "È²ÁøÀÌ");

        ss = names.stream();
        ss.filter(n -> n.charAt(0) < 'ÀÌ').forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = names.stream();
        ss.sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();
        ss = names.stream();
        System.out.println(ss.findFirst());
        ss = names.stream();
        System.out.println(ss.findFirst().get());
        ss = names.stream();
        System.out.println(ss.count());
    }
}
