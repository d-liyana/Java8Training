import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> square=(integer, integer2) -> integer*integer2;
        System.out.println("Result is "+square.apply(2,7));
    }
}
