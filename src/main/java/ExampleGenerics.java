import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleGenerics {
    public static void main(String[] args) {
        String[] str = {"Hello", "World", "!"};
        exchangePositions(str, 0, 1);
        exchangePositions(str, 1, 2);

        System.out.println(Arrays.toString(str));

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }
        exchangePositions(integerList, 0, 1);
        exchangePositions(integerList, 2, 3);

        System.out.println(integerList);

        List<BigInteger> integerList1 = new ArrayList<>();
        integerList1.add(BigInteger.ONE);
        integerList1.add(BigInteger.TWO);
        integerList1.add(BigInteger.TEN);
        integerList1.add(BigInteger.valueOf(15));
        integerList1.add(BigInteger.valueOf(23));
        integerList1.add(BigInteger.valueOf(29));

        System.out.println(countPrime(integerList1));

        List<Integer> integerList2 = new ArrayList<>();
        integerList2.add(1);
        integerList2.add(2);
        integerList2.add(10);
        integerList2.add(15);
        integerList2.add(23);
        integerList2.add(29);

        System.out.println(countPrime(integerList2));
    }

    static <T> void exchangePositions(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static <T> void exchangePositions(List<T> l, int i, int j) {
        Collections.swap(l, i, j);
    }

    static <T> int countPrime(List<T> l) {
        int count = 0;
        for (T i : l) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }


    static <T> boolean isPrime(T t) {
        BigInteger bigInteger = new BigInteger(String.valueOf(t));
        return bigInteger.isProbablePrime(1000);
    }
}
