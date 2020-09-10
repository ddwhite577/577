package package09;

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        System.out.println("你好、世界");
        //Scanner类
        Scanner scan=new Scanner(System.in);
        //判断键盘是否有输入  next遇见空格会跳过
        if(scan.hasNext())
        {
            String str2=scan.next();
            System.out.println("输入的数据为："+str2);

        }
        //关闭流
        //scan.close();

        //scan=new Scanner(System.in);
        double sum=0;
        int m=0;
        while (scan.hasNextDouble())
        {
            double x=scan.nextDouble();
            m+=1;
            sum+=x;
        }
        System.out.println("总数："+sum);
        System.out.println("平均数："+sum/m);
    }
}
