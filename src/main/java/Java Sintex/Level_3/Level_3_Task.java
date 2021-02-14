public class Level_3_Task {
}

class Level_3_task_1 {
    static int applesPrice = 0;

    public static void addPrice(int applesPrice) {
        Level_3_task_1.applesPrice = Level_3_task_1.applesPrice + applesPrice;
    }

    public static void priceApple(int applesPrice) {
        addPrice(50);
        addPrice(100);
        System.out.println("Стоимость яблок " + Level_3_task_1.applesPrice);
    }

}

class Level_3_Cat {
    private String name = "безымянный кот";
    private static int catsCount = 0;
    private String fullName;

    public void setName(String name) {
        this.name = name;
    }

    public static void showCat() {
        Level_3_Cat cat = new Level_3_Cat();
        cat.setName("Бапсик");
        System.out.println(cat.name);
    }

    public static void addNewCat() {
        Level_3_Cat.catsCount++;
        System.out.println(catsCount);
    }

    public static void setCatsCount(int catsCount) {
        Level_3_Cat.catsCount = catsCount;

    }
    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }
}


