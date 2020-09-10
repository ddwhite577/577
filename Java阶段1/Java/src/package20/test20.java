package package20;

public class test20 {
    public static void main(String[] args) {

    }
}

class A implements USB,TC{

    @Override
    public int open() {
        System.out.println("重写了open方法");
        return 0;
    }
    int showNum(){
        System.out.println();
        return 0;
    }
}