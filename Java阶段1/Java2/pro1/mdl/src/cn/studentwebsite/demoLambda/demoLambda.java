package cn.studentwebsite.demoLambda;

public class demoLambda {
    public static void main(String[] args) {
//        //Lambda表达式 简化代码
//        new Thread(()->{
//            //()是run方法 {}是run的方法体
//            System.out.println(Thread.currentThread().getName());
//        });
//        //Lambda表达式 简化代码
//        new Thread(()->{
//            //()是run方法 {}是run的方法体
//            System.out.println(Thread.currentThread().getName());
//        });
        //使用匿名实现类
        invoke(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });
        //使用lambda表达式
        invoke(()->{
            System.out.println("吃饭了");
        });
    }
    public static void invoke(Cook cook){
        cook.makeFood();
    }
}
