package nx.jy.demo01;

public class DemoStringConvert {
    public static void main(String[] args) {
        // 将字符串转换成字符数组
        char[] chars = "hellow".toCharArray();
//        System.out.println(chars[1]);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        // 转换为字节数组
        System.out.println("-------------------");
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);//97 98 99
        }
        System.out.println("-------------------");
        // 替换字符

        String fk = "fuck you every day".replace("fuck", "****");
        System.out.println(fk);
    }
}

