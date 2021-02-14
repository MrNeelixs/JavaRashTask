import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Creating a project menu
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите раздел проекта ");
        System.out.println("1. Java Syntax");
        System.out.println("2. Java Core");
        System.out.println("3. Java Multithreading");
        System.out.println("4. Java Collections");
        int number = Integer.parseInt(reader.readLine());
        switch (number) {
            case 1:
                System.out.println("    Выберите уровень :");
                System.out.println("1.Команды и первая программа :");
                System.out.println("2.Знакомство с типами и ввод с клавиатуры :");
                System.out.println("3.Условный оператор :");
                System.out.println("Выберете уровень :");
                System.out.println("Выберете уровень :");
                System.out.println("Выберете уровень :");
                int number0 = Integer.parseInt(reader.readLine());
                switch (number0) {
                    case 1:
                        System.out.println("        Выберите задание :");
                        System.out.println("1. Задание : Я думаю, быть программистом - это круто.");
                        System.out.println("2. Задание : Комплимент учителю.");
                        System.out.println("3. Задание : На дворе 32 век.");
                        System.out.println("4. Задание : Объявление переменных.");
                        System.out.println("5. Задание : Обмен.");
                        System.out.println("6. Задание : 2 плюс 3 равно 5.");
                        System.out.println("7. Задание : Happy New Year.");
                        System.out.println("8. Задание : Закомментируйте лишнее.");
                        System.out.println("9. Задание : Баги и фичи.");
                        int number1 = Integer.parseInt(reader.readLine());
                        switch (number1) {
                            case 1:
                                System.out.println("Напиши программу, которая выводит на экран надпись:\n" +
                                        "Я думаю, быть программистом - это круто");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_1();
                                break;
                            case 2:
                                System.out.println("Написать программу, выводящую на экран надпись «Элли очень умная» 5 раз.\n Каждый раз – с новой строки.");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_2();
                                break;
                            case 3:
                                System.out.println("Сейчас 3126 год. Мой друг родился 8 лет назад.\n" +
                                        "Напиши программу, выводящую на экран год рождения моего друга.");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_3();
                                break;
                            case 4:
                                System.out.println("Напиши программу, которая в методе main объявляет такие переменные: name типа String, age типа int и city типа String.\n" +
                                        "\n" +
                                        "Примечание: \"объявить переменную\" значит то же, что и \"создать переменную\".");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_4();
                                break;
                            case 5:
                                System.out.println("Раскомментируй одну строчку, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2).");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_5();
                                break;
                            case 6:
                                System.out.println("Закомментируй ненужные строки кода, чтобы на экран вывелась надпись \"2 плюс 3 равно 5\".\n" +
                                        "\n" +
                                        "Примечание: комментировать строку с объявлением переменных int a и int b нельзя.");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_6();
                                break;
                            case 7:
                                System.out.println("Убери комментарии с части кода, чтобы на экран вывелось сообщение \"Happy New Year\".");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_7();
                                break;
                            case 8:
                                System.out.println("Закомментируй часть кода, чтобы на экран вывелось сообщение \"sum = 12\".");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_8();
                                break;
                            case 9:
                                System.out.println("Напиши программу, которая выводит на экран надпись:\n" +
                                        "Это не баг, это фича.");
                                System.out.println("Решение");
                                Level_1_Task.Level_1_Task_9();
                                break;
                        }
                    case 2:
                        System.out.println("        Выберите задание :");
                        System.out.println("1. Задание : Объявление двух переменных.");
                        System.out.println("2. Задание : Вывод на экран переменной.");
                        System.out.println("3. Задание : Объявление нескольких переменных.");
                        System.out.println("4. Задание : Квадрат числа.");
                        System.out.println("5. Задание : Контракт.");
                        System.out.println("6. Задание : Как захватить мир.");
                        System.out.println("7. Задание : Зарплата через 5 лет.");
                        System.out.println("8. Задание : Чистая любовь.");
                        int number2 = Integer.parseInt(reader.readLine());
                        switch (number2) {
                            case 1:
                                System.out.println("Объяви переменные a, b типа int.\n" +
                                        "Сразу же в строке объявления присвой им разные значения.\n" +
                                        "Значениями могут быть любые целые числа.\n" +
                                        "\n");
                                System.out.println("Решение : ");
                                Level_2_Task.Level_2_Task_1();
                                break;
                            case 2:
                                System.out.println("Объяви переменную name типа String.\n" +
                                        "Сразу же в строке объявления присвой ей какое-нибудь значение.\n" +
                                        "Выведи на экран переменную name.");
                                System.out.println("Решение : ");
                                Level_2_Task.Level_2_Task_2();
                                break;
                            case 3:
                                System.out.println("Объяви переменные a, b типа int и переменную s типа String.\n" +
                                        "Сразу же в строке объявления присвой им любые значения.");
                                System.out.println("Решение : ");
                                Level_2_Task.Level_2_Task_3();
                                break;
                            case 4:
                                System.out.println("Дана переменная number (она уже создана: к ней можно обращаться по имени с любого места программы).\n" +
                                        "Напиши программу, которая посчитает квадрат числа переменной number и выведет его на экран.\n" +
                                        "\n" +
                                        "Подсказка:\n" +
                                        "квадрат — результат умножения числа на себя (number * number).");
                                System.out.println("Решение : ");
                                Level_2_4.Task_4();
                                break;
                            case 5:
                                System.out.println("Вывести на экран текст нового контракта:.");
                                System.out.println("Решение : ");
                                Level_2_Task.Level_2_Task_5();
                                break;
                            case 6:
                                System.out.println("Введи с клавиатуры имя и число, а затем выведи на экран строку: Через «число» лет «имя» захватит мир. Му-ха-ха!");
                                System.out.println("Решение : ");
                                Level_2_6.Task_6();
                                break;
                            case 7:
                                System.out.println("Введи с клавиатуры отдельно Имя, число1, число2. Выведи надпись:\n" +
                                        "«Имя» получает «число1» через «число2» лет.");
                                System.out.println("Решение : ");
                                Level_2_7.Task_7();
                                break;
                            case 8:
                                System.out.println("Введи с клавиатуры три имени, а затем выведи на экран надпись: name1 + name2 + name3 = Чистая любовь, да-да!");
                                System.out.println("Решение : ");
                                Level_2_8.Task_8();
                                break;
                        }
                    case 3 :
                        System.out.println("        Выберите задание :");
                        System.out.println("1. Задание : Цена Яблок.");
                        System.out.println("2. Задание : Как зовут кота?.");
                        System.out.println("3. Задание : Учет котов.");
                        System.out.println("4. Задание : Программа учета имен.");
                        System.out.println("5. Задание : Контракт.");
                        System.out.println("6. Задание : Как захватить мир.");
                        System.out.println("7. Задание : Зарплата через 5 лет.");
                        System.out.println("8. Задание : Чистая любовь.");
                        int number3 = Integer.parseInt(reader.readLine());
                        switch (number3) {
                            case 1:
                                System.out.println("Подсчитать суммарную стоимость яблок.\n" +
                                        "За суммарную стоимость яблок отвечает переменная public static int applesPrice.");
                                System.out.println("Решение :");
                                Level_3_task_1.priceApple(0);
                                break;
                            case 2:
                                System.out.println("Помоги коту обрести имя с помощью метода setName.");
                                System.out.println("Решение :");
                                Level_3_Cat.showCat();
                                break;
                            case 3:
                                System.out.println("Напиши код в методе addNewCat, чтобы при его вызове количество котов увеличивалось на 1.\n" +
                                        "За количество котов отвечает переменная catsCount.");
                                System.out.println("Решение :");
                                Level_3_Cat.addNewCat();
                                break;
                            case 4:
                                System.out.println("Допиши код метода setName, чтобы с его помощью установить значение private String fullName, равное значению локальной переменной String fullName.");
                                System.out.println("Решение :");

                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            case 10:
                                break;
                            case 11:
                                break;
                        }

                }
        }
    }
}






