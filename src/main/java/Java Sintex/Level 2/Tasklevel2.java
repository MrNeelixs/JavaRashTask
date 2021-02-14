import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;

public class Tasklevel2 {
    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age += 20;
            System.out.println("Age in adjustAge() is: " + age);
        }

        public static class Apple {
            public static int applesPrice = 0;

            public static void addPrice(int applesPrice) {
                Apple.applesPrice = Apple.applesPrice + applesPrice;
            }
        }

        public static class Cat {
            private static int count;
            private String name = "безымянный кот";

            public void setName(String name) {
                this.name = name;
            }

            private static int catsCount = 0;

            public static void addNewCat() {
                Cat.catsCount++;
            }

            public static void setCatsCount(int catsCount) {
                Cat.catsCount = catsCount;
            }

            private String fullName;

            public void setName(String firstName, String lastName) {
                String fullName = firstName + " " + lastName;
                this.fullName = fullName;
            }

            public static class IfElse {
                public static void compare(int a) {
                    if (a < 5) {
                        System.out.println("Число меньше 5");
                    } else if (a > 5) {
                        System.out.println("Число больше 5");
                    } else {
                        System.out.println("Число равно 5");
                    }

                }

                public static void checkInterval(int a) {
                    //напишите тут ваш код
                    if (a >= 50 & a <= 100) {
                        System.out.println("Число " + a + " содержится в интервале.");
                    } else {
                        System.out.println("Число " + a + " не содержится в интервале.");
                    }
                }

                public static void Task07() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    int num = Integer.parseInt(reader.readLine());
                    if (num > 0) {
                        num = num * 2;
                    } else if (num < 0) {
                        num = num + 1;
                    }
                    System.out.println(num);
                }

                public static void Task08() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    int day = Integer.parseInt(reader.readLine());
                    switch (day) {
                        case 1:
                            System.out.println("понедельник");
                            break;
                        case 2:
                            System.out.println("вторник");
                            break;
                        case 3:
                            System.out.println("среда");
                            break;
                        case 4:
                            System.out.println("четверг");
                            break;
                        case 5:
                            System.out.println("пятница");
                            break;
                        case 6:
                            System.out.println("суббота");
                            break;
                        case 7:
                            System.out.println("воскресенье");
                            break;
                        default:
                            System.out.println("такого дня недели не существует");
                            break;
                    }
                }

                public static void task09() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter two number,please ! ");
                    int num1 = Integer.parseInt(reader.readLine());
                    int num2 = Integer.parseInt(reader.readLine());
                    int min = num1 < num2 ? num1 : num2;
                    System.out.println(min);
                }

                public static void Task10() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    String name = reader.readLine();
                    int age = Integer.parseInt(reader.readLine());
                    if (age < 18) {
                        System.out.println("Подрасти еще");
                    } else {
                        System.out.println(name + " , Welcom!!! ");
                    }
                }

                public static void task11() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Please, enter two number :");
                    int a = Integer.parseInt(reader.readLine());
                    int b = Integer.parseInt(reader.readLine());
                    if (a > 0 && b > 0) {
                        System.out.println(1);
                    } else if (a < 0 && b > 0) {
                        System.out.println(2);
                    } else if (a < 0 && b < 0) {
                        System.out.println(3);
                    } else if (a > 0 && b < 0) {
                        System.out.println(4);
                    }
                }

                public static void task12() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    int number = Integer.parseInt(reader.readLine());
                    if (number == 0) {
                        System.out.println("ноль");
                    } else if (number > 0 && number % 2 == 0) {
                        System.out.println("положительное четное число");
                    } else if (number > 0 && number % 2 != 0) {
                        System.out.println("положительное нечетное число");
                    } else if (number < 0 && number % 2 == 0) {
                        System.out.println("отрицательное четное число");
                    } else if (number < 0 && number % 2 != 0) {
                        System.out.println("отрицательное нечетное число");
                    }
                }

                public static void task13() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    int number = Integer.parseInt(reader.readLine());
                    if (number > 0 && number < 10 && number % 2 == 0) {
                        System.out.println("четное однозначное число");
                    } else if (number < 10 && number % 2 != 0) {
                        System.out.println("нечетное однозначное число");
                    } else if (number > 9 && number < 100 && number % 2 == 0) {
                        System.out.println("четное двузначное число");
                    } else if (number > 9 && number < 100 && number % 2 != 0) {
                        System.out.println("нечетное двузначное число");
                    } else if (number > 99 && number < 1000 && number % 2 == 0) {
                        System.out.println("четное трехзначное число");
                    } else if (number > 99 && number < 1000 && number % 2 != 0) {
                        System.out.println("нечетное трехзначное число");
                    }
                }

                public static void task14() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    int number1 = Integer.parseInt(reader.readLine());
                    int number2 = Integer.parseInt(reader.readLine());
                    int number3 = Integer.parseInt(reader.readLine());
                    int counter = 0;
                    if (number1 > 0) {
                        counter++;
                    }
                    if (number2 > 0) {
                        counter++;
                    }
                    if (number3 > 0) {
                        counter++;
                    }
                    System.out.println(counter);
                }

                public static void task15() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    int number1 = Integer.parseInt(reader.readLine());
                    int number2 = Integer.parseInt(reader.readLine());
                    int number3 = Integer.parseInt(reader.readLine());
                    int countPositive = 0;
                    int countNegative = 0;
                    if (number1 > 0) {
                        countPositive++;
                    } else if (number1 < 0) {
                        countNegative++;
                    }
                    if (number2 > 0) {
                        countPositive++;
                    } else if (number2 < 0) {
                        countNegative++;
                    }
                    if (number3 > 0) {
                        countPositive++;
                    } else if (number3 < 0) {
                        countNegative++;
                    }
                    System.out.println("количество отрицательных чисел: " + countNegative);
                    System.out.println("количество положительных чисел: " + countPositive);

            }

                public static void main(String[] args) throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    // Task 1
                    System.out.println("Task 1");
                    Person person = new Person();
                    person.adjustAge(person.age);
                    person.adjustAge(30);
                    // Task 2
                    System.out.println("Task 2");
                    Person apple = new Person();
                    Person.Apple.addPrice(50);
                    Person.Apple apple2 = new Person.Apple();
                    Person.Apple.addPrice(100);
                    System.out.println("Стоимость яблок " + Person.Apple.applesPrice);
                    // Task 3
                    System.out.println("Task 3");
                    Cat cat = new Cat();
                    cat.setName("Жужик");
                    System.out.println(cat.name);
                    // Task 4
                    System.out.println("Task 4");
                    Cat cat1 = new Cat();
                    Cat.count++;
                    Cat cat2 = new Cat();
                    Cat.count++;
                    System.out.println("The cat count is " + Cat.count);
                    // Task 5
                    System.out.println("Task 5");
                    IfElse.compare(3);
                    IfElse.compare(6);
                    IfElse.compare(5);
                    // Task 6
                    System.out.println("Task 6");
                    checkInterval(60);
                    checkInterval(112);
                    checkInterval(10);
                    // Task 7
                    System.out.println("Task 7");
                    System.out.println("Enter number");
                    Task07();
                    // Task 8
                    System.out.println("Task 8");
                    System.out.println("Enter number yo week");
                    Task08();
                    // Task 9
                    System.out.println("Task 9");
                    task09();
                    // Task 10
                    System.out.println("Task 10");
                    Task10();
                    // Task 11
                    System.out.println("Task 11");
                    task11();
                    // Task 12
                    System.out.println("Task 12");
                    task12();
                    // Task 13
                    System.out.println("Task 13");
                    task13();
                    // Task 14
                    System.out.println("Task 14");
                    task14();
                    // Task 15
                    System.out.println("Task 15");
                    task15();
                }
            }
        }
    }
}