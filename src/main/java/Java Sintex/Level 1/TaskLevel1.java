public class TaskLevel1 {
    static class Task1 {
        public void task1() {
            System.out.println("Я думаю, быть программистом - это круто");
        }
        public void task2() {
            System.out.println("Элли очень умная");
            System.out.println("Элли очень умная");
            System.out.println("Элли очень умная");
            System.out.println("Элли очень умная");
            System.out.println("Элли очень умная");
        }
        public void task3() {
            System.out.println(3126 - 8);
        }
        public void task4() {
            String name;
            int age;
            String city;
        }
        public void task5() {
            int x = 2;
            int y = 12;

            // y = x * y;
            y = x + y;

            x = y - x;
            y = y - x;

            System.out.println(x);
            System.out.println(y);
        }
        public void task6() {
            int a = 3;
            int b = 2;

            // System.out.print("два");
            System.out.print(b);
            System.out.print(" плюс ");
            // System.out.print(" минус ");
            System.out.print(a);
            // System.out.print("три");
            System.out.print(" равно ");
            // System.out.print(" будет ");
            // System.out.print("пять");
            System.out.print(a + b);
        }
        public void task7() {
            // String s = "Merry";
            // System.out.println("Christmas");
            // System.out.println("Merry New");
            // System.out.println("weekend");
            System.out.print("Happy New");
            // System.out.println("weekend");
            // System.out.println(s);
            // System.out.print("Merry New!");
            System.out.print(" ");
            System.out.println("Year");
        }
        public void task8() {
            int a = 3;
            //  int a = 10;
            int b = 6;
            //  int b = 12;
            //  int sum = 1 + a + b;
            // int sum = 2 + a + b;
            int sum = 3 + a + b;
            // int sum = 4 + a + b;
            System.out.println("sum = " + sum);
        }
        public void task9() {
            System.out.println("Это не баг, это фича.");
        }
    }
    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println("Task solutions 1");
        task.task1();
        System.out.println("Task solutions 2");
        task.task2();
        System.out.println("Task solutions 3");
        task.task3();
        System.out.println("Task solutions 4");
        task.task4();
        System.out.println("Task solutions 5");
        task.task5();
        System.out.println("Task solutions 6");
        task.task6();
        System.out.println("Task solutions 7");
        task.task7();
        System.out.println("Task solutions 8");
        task.task8();
        System.out.println("Task solutions 9");
        task.task9();
    }
}