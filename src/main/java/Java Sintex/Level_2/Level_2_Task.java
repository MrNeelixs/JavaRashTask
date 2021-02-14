import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_2_Task {
    public static void Level_2_Task_1() {
        int a = 5;
        int b = 10;
        System.out.println(a);
        System.out.println(b);
    }

    public static void Level_2_Task_2() {
        String name = "Mr.Neelixs";
        System.out.println(name);
    }

    public static void Level_2_Task_3() {
        int a = 5;
        int b = 10;
        String s = "Mr.Neelixs";
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
    }

    public static void Level_2_Task_5() {
        System.out.println("Меня зовут Амиго.");
        System.out.println("");
        System.out.println("Я согласен на зарплату $800/месяц в первый год.");
        System.out.println("Я согласен на зарплату $1500/месяц во второй год.");
        System.out.println("Я согласен на зарплату $2200/месяц в третий год.");
        System.out.println("Я согласен на зарплату $2700/месяц в четвертый год.");
        System.out.println("Я согласен на зарплату $3200/месяц в пятый год.");
        System.out.println("");
        System.out.println("Поцелуй мой блестящий металлический зад!");
    }
}

class Level_2_4 {
    public static int number = 25;

    public static void Task_4() {
        int resualt = number * number;
        System.out.println(resualt);
    }
}

class Level_2_6 {
    public static void Task_6() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        String name = reader.readLine();
        System.out.println("Введите кол-во лет");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Через " + age + " " + "лет " + name + " захватит мир. Му-ха-ха!");
    }
}

class Level_2_7 {
    public static void Task_7() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        String name = reader.readLine();
        System.out.println("Введите сумму");
        int sum = Integer.parseInt(reader.readLine());
        System.out.println("Введите кол-во лет");
        int age = Integer.parseInt(reader.readLine());
        System.out.println(name + " " + "получает " + sum + " через " + age + " лет.");
    }
}

class Level_2_8 {
    public static void Task_8() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя ");
        String name1 = reader.readLine();
        System.out.println("Введите имя ");
        String name2 = reader.readLine();
        System.out.println("Введите имя ");
        String name3 = reader.readLine();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = " + "Чистая любовь, да-да!");
    }
}