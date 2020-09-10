package pacjage02;
import java.util.regex.*;
public class test02 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //正则匹配
        String content="Hello World ,My world earth!";

        String pattern=".*world.*";

        boolean isMatch=Pattern.matches(pattern,content);
        System.out.println("content是否包含pattern："+isMatch);

        //捕获组
        String line="This order was placed for QT3000!1 OK?";
        String pattern0="(\\D*)(\\d+)(\\D*)(\\d+)(\\D*)";

        //创建Pattern对象
        Pattern pr=Pattern.compile(pattern0);

        //创建matcher对象
        Matcher m=pr.matcher(line);
        if(m.find())
        {
            System.out.println("GroupCount："+m.groupCount());
            for (int i=1;i<=m.groupCount();i++)
            {
                System.out.println("group["+m.start(i)+"]："+m.group(i));
            }
           // System.out.println("group["+3+"]："+m.group(3));
        }
    }
}
