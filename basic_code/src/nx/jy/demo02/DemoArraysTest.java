package nx.jy.demo02;


import java.util.Arrays;

//将一个随机字符串升序排列，倒叙打印
public class DemoArraysTest {
    public static void main(String[] args) {
        String str = "abdqwieutjdnxlspgkjl";
        // 字符串转数组
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        // 数组转字符串
        String str1 = Arrays.toString(chars);
        System.out.println(str1);
        //倒叙打印
        for (int i = chars.length - 1; i >= 0; i--) {
            //拿到数组最长度-1的index
            System.out.print(chars[i]);

        }


    }
}
