package Es1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        System.out.println("Inserisci " + n + " parole:");
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (!uniqueWords.add(word)){
                duplicateWords.add(word);
            }
        }

        System.out.println("Parole inserite:");
        for (String word : uniqueWords){
            System.out.println(word);
        }

        System.out.println("Parole duplicate:"); //non posso duplicare gli elementi in un set, quindi li aggiungo ad uno nuovo
        for (String word : duplicateWords){
            System.out.println(word);
        }
    }
}
