package stage2.day1;

public class demoString1 {
    public static void main(String[] args) {
        //字符串的常量池共享  相同字符串共享一个对象
        String str1="abc";
        String str2="abc";

        char[] charArray={'a','b','c'};
        String str3=new String(charArray);

        //这是地址比较，不是字符串值比较
        System.out.println(str1==str2);//str1,str2共享一个abc对象的地址
        System.out.println(str1==str3);//str2,str3地址不一样
        System.out.println(str2==str3);//同理，地址不相等
    }
}
