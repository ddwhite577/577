package package03;

public class test03 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int i=0;i<args.length;i++) {
            System.out.println("args[" +i+"]："+ args);
        }
        int i=5;
        int j=2;
        double m=3.5;
        int k= (int) max((double) i,m);
        System.out.println(i+"和"+j+"比较大小，最大值是："+k);
        pMax(0.2,0.0,1.1,5.0,1.5);
    }

    //比较大小的方法
    public static int max(int num1,int num2)
    {
        int result;
        if(num1>num2)
            result=num1;
        else
            result=num2;
        return result;
    }
    //方法重载
    public static double max(double num1,double num2)
    {
        if (num1>num2)
            return num1;
        else
            return num2;
    }

    //可变参数
    public static void pMax(double ... numbers)
    {
        if(numbers.length==0)
        {
            System.out.println("No argument passed");
            return;
        }
        double result=numbers[0];

        for (int i=1;i<numbers.length;i++)
        {
            if (numbers[i]>result)
            {
                result=numbers[i];
            }
        }
        System.out.println("The max value is："+result);
    }
}
