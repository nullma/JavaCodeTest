package nx.jy.demo02;

public class DemoStatic {
    public static void main(String[] args) {
        Student.room = "初三一班";
        Student stu1 = new Student("张三", 12);
        Student stu2 = new Student("李三", 18);

        System.out.println("学生的名字："+stu1.getName()+"学生的年龄"+stu1.getAge()+"教室"+stu1.room);
        System.out.println("学生的名字："+stu2.getName()+"学生的年龄"+stu2.getAge()+"教室"+stu2.room);

        Student.methodStatic();
    }
}
