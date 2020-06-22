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
        //asdasdasdasd

        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        System.out.println(chars);

        for (int i = 0; i < chars.length; i++) {

            String compareStr = new String(String.valueOf(chars[i]));
            int compareStrLength = compareStr.length();
            int indexstart = 0;
            int count = 0;
            while (true){
                int n = str.indexOf(compareStr, indexstart);
                if(n>0) {
                    count++;
                    indexstart = n + compareStrLength;
                }else {
                    break;
                }

            }
            System.out.println("当前字符"+chars[i]+"次数为："+count);
        }
      /*
        int count = 0;
        String str = scanner.next();
        Scanner sc = new Scanner(System.in);
        String compareStr = sc.nextLine();
        System.out.println("比较的字符串是："+compareStr);
        int strLength = compareStr.length();
        int indexStart = 0;
        while (true) {
            int num = str.indexOf(compareStr, indexStart);
            if (num>0){
                count ++;
                indexStart = num+strLength;
            }else {
                break;
            }
            System.out.println(count);
      }*/
//
    }
}
