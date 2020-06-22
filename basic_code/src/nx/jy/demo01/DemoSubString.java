package nx.jy.demo01;

public class DemoSubString {
    public static void main(String[] args) {
        String str1 = "iloveyou".substring(1);
        System.out.println(str1);//loveyou

        String str2= "iloveyou".substring(1,5);
        System.out.println(str2);//love
        CharSequence cs = "iloveyou".subSequence(1, 5);
        System.out.println(cs);//love 功能同上 发挥类型不一样

    }
}
