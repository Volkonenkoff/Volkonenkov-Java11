import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Введите имя: ");
            name = scanner.nextLine();
            if (name.length()==0) {
                System.out.println("Вы ничего не ввели");
            }
        } while(name.length()==0);

        if (name.toLowerCase().equals("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
