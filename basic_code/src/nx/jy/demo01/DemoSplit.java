package nx.jy.demo01;
// 字符串分割
// 如果以"."切割的话要用"//."
public class DemoSplit {
    public static void main(String[] args) {
        String str = "yyy,oooo,uuu";
        String[] str2 = str.split(",");
        for (int i = 0; i < str2.length; i++) {

            System.out.println(str2[i]);
        }
    }
}

