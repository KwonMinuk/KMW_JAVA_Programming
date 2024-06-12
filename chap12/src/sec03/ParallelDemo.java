package sec03;

import java.util.stream.IntStream;

public class ParallelDemo {
    public static void main(String[] args) {
        long start, end, total;

        IntStream sequantial = IntStream.rangeClosed(1, 100000000);
        start = System.currentTimeMillis();
        total = sequantial.sum();
        end = System.currentTimeMillis();
        System.out.println("鉴瞒 贸府 : " + (end - start));

        IntStream parallel = IntStream.rangeClosed(1, 100000000).parallel();
        start = System.currentTimeMillis();
        total = parallel.sum();
        end = System.currentTimeMillis();
        System.out.println("捍纺 贸府 : " + (end - start));
    }
}
