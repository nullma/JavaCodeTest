
package nx.jy.demo02;


import java.util.Arrays;

// toString 方法
// sort 方法
public class DemoArrays {
    public static void main(String[] args) {

        int[] arrayNum = {1, 2, 4, 5, 3, 4, 2, 4, 5};
        String str = Arrays.toString(arrayNum);
        System.out.println("排序前"+str);
        Arrays.sort(arrayNum);
        String str1 = Arrays.toString(arrayNum);
        System.out.println("排序后"+str1);
    }
}
