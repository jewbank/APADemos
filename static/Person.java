public class Person {
    static int totalCalories;

    String name;
    int caloriesEaten;

    public Person(String name){
        this.name = name;
        caloriesEaten = 0;
    }

    public void eat(int numCalories){
        caloriesEaten += numCalories;
        totalCalories += numCalories;
    }

    public static int add(int a, int b){
        return totalCalories + b;
    }

    public static void main(String[] args) {
        Person p1 = new Person("alice");
        Person p2 = new Person("bob");

        p1.eat(500);
        p2.eat(5000);

        System.out.println(p1.caloriesEaten);
        System.out.println(p2.caloriesEaten);
        System.out.println(Person.totalCalories);

    }
}
