package package01;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.text.*;

public class test01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Date类
        Date date=new Date();
        System.out.println("date:"+date);
        System.out.println("toString:"+date.toString());

        //SimpleDateFormat格式化时间
        Date dNow=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为："+ft.format(dNow));

        //时间比较
        Date preDate=new Date(20,2,12);
        Date afrDate=new Date(20,2,18);
        System.out.println("before:"+preDate.before(afrDate));

        //printf格式化输出
        System.out.printf("全部日期和时间信息：%tc%n",date);
        System.out.printf("年-月-日：%tF%n",date);
        System.out.printf("月/日/年：%tD%n",date);
        System.out.printf("HH:MM:SS PM：%tr%n",date);

        //解析字符串为时间
        SimpleDateFormat sft=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("args："+args);
        String input=args.length==0?"1818-11-11":args[0];
        System.out.print(input+" Parse as ");
        Date t;
        try {
            t=sft.parse(input);
            System.out.println(t);
        }catch (ParseException e)
        {
            System.out.println("UnParseable using:"+sft);
        }

        //时间休眠
        try {
            System.out.println(new Date());
           // Thread.sleep(1000 * 3);//休眠3秒
            System.out.println(new Date());
        }catch (Exception e)
        {
            System.out.println("Got an exception!");
        }

        //测量时间间隔
        try{
            long start=System.currentTimeMillis();
            System.out.println("start："+start);
            System.out.println(new Date());
            Thread.sleep(1000);
            System.out.println(new Date());
            long end=System.currentTimeMillis();
            System.out.println("end："+end);
            long diff=end-start;
            System.out.println("Difference is："+diff);
        }catch (Exception e)
        {
            System.out.println("Got an exception!");
        }

        //Calendar类
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        //c.set(2020,12,12);
        System.out.println("Year："+c.get(Calendar.YEAR));
        System.out.println("Month："+(c.get(Calendar.MONTH)+1));
        System.out.println("Day："+c.get(Calendar.DATE));
    }

}
