public class Student {
    private String name;
    private int id;

    private static int idCounter = 100;

    public Student(String name){
        this.name = name;
        this.id = idCounter;
        idCounter++;
    }

    public String toString(){
        return id + ": " + name;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Paul");
        Student s2 = new Student("Cherise");
        Student s3 = new Student("Ashton");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
