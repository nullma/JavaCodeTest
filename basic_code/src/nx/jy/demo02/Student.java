package nx.jy.demo02;

public class Student {
    static {
        System.out.println("static静态方法只用一次");
    }


    private int id = 0;
    private String name;
    private int age;
    static String room;
    private static int couterID = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = couterID++;
        System.out.println("构造方法...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void methodStatic() {
        System.out.println("类的方法，直接类名.方法名调用");
    }
}
