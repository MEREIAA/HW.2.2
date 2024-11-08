import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк из списка А: ");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println("list A: " + listA);

        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк из списка B: ");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("list B: " + listB);

        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("list C: " + listC);

        listC.sort(Comparator.comparingInt(String::length ));
        System.out.println("Отсортированный список С: " + listC);
    }
}