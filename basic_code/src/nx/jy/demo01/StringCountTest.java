package nx.jy.demo01;

import java.util.ArrayList;
import java.util.Scanner;

// 键盘输入一个字符串，统计各字符出现的字数
// 字符串包含大写小写
public class StringCountTest {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        countChars(scanner);

    }
    public static void countChars(Scanner scanner){

        int count = 0;
        String next = scanner.next();
        char[] chars = next.toCharArray();
        ArrayList<Character> chList = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            chList.add(chars[i]);
            if (chList.contains(chars[i])){
                count++;
                System.out.println("相同字符"+chars[i]+"出现的次数"+count);
            }
//            System.out.println(chars[i])
        }
        System.out.println(chList);
    }
}
