package nx.jy.demo01;

/*
* // string 常用方法
* */
public class DemoStringGet {
    public static void main(String[] args) {
        int length = "sdfsdfdsfhjweihfd".length();
        System.out.println("字符串的内容"+length);
        System.out.println("====================");

        //字符串拼接 返回新的字符串
        String str1 = "mawen";
        String str2 = "tao";

        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println("====================");

        // 获取指定位置的的字符
        char ch = "hello".charAt(1);
        System.out.println(ch);
        System.out.println("====================");

        // 查找字符串中 字符第一次出现的位置的索引
        String original = "helloWorld";
        int wor = original.indexOf("llo");
        System.out.println(wor);
        System.out.println("====================END");


    }
}
