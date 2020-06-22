package nx.jy.demo01;
//{1,2,3}  切割 [abc1#abc2#abc3]
public class StringTest {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3,4};
        System.out.println(numArrayReplceStrArray(numArray));

    }

    public static String numArrayReplceStrArray(int[] numArray){

        String str = "[";
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
            str += "abc" + numArray[i] + "#";
            System.out.println("循环str为：" + str);
            if (i == numArray.length-1){
                str = str +"]";
            }

        }
        return str;
    }
}
