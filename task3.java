import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите размер массива: ");
            n = scanner.nextInt();
            if (n<=0) {
                System.out.println("Некорректное значение");
            }
        } while(n<=0);
        System.out.println("Введите элементы численного массива массива (введите число и нажмите Enter):");

        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        System.out.println(Arrays.toString(array.stream().filter(elem->elem%3==0).toArray(Integer[]::new)));
    }
}
