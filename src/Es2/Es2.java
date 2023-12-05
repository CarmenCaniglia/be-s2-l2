package Es2;

import java.util.*;

public class Es2 {
    public static List<Integer>randomListOfNumbers(int N){
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            randomList.add(random.nextInt(1,101));
        }

        Collections.sort(randomList);
        return randomList;
    }

    public static List<Integer>reverseList(List<Integer> originalList){
        List<Integer> newList = new ArrayList<>(originalList);

        List<Integer>revList = new ArrayList<>(originalList);
        Collections.reverse(revList);

        newList.addAll(revList);

        return newList;
    }

    public static void printEvenOrOdd(List<Integer>list, boolean printEven){
        for (int i = 0; i < list.size(); i++) {
            if((printEven && i % 2 == 0) || (!printEven && i % 2 != 0)){
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> randomNum = randomListOfNumbers(10);
        System.out.println(randomNum);

        List<Integer> list = reverseList(randomNum);
        System.out.println("Lista al contrario: " + list);

        System.out.println("Elementi in posizione pari:");
        printEvenOrOdd(randomNum, true);

        System.out.println("Elementi in posizione dispari:");
        printEvenOrOdd(randomNum, false);
    }
}
