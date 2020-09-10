package stage2.day5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demoThrow {
    public static void main(String[] args) {
        int[] arr=null;
        //getNum(arr,-1);
        arr=new int[]{1,23,4};
        //getNum(arr,-1);
        System.out.println(getNum(arr,0));
    }

    public static int getNum(int[] arr,int index){
        if(arr==null)
            throw new NullPointerException("空指针异常");
        if (index<0||index>arr.length-1)
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        return arr[index];
    }

    public static void readFile(String fileName) throws FileNotFoundException,IOException {
        if(!fileName.equals("a.txt")){
            //抛出编译异常
            throw new FileNotFoundException("路径不对");
        }
        //后缀
        if(!fileName.endsWith(".txt")){
            //编译异常
            throw  new IOException("后缀名不对");
        }
    }

    public static void writeFile(String fileName) {
        try {
            if (!fileName.equals("a.txt")) {
                //抛出编译异常
                throw new FileNotFoundException("路径不对");
            }
            //后缀
            if (!fileName.endsWith(".txt")) {
                //编译异常
                throw new IOException("后缀名不对");
            }
        }catch (IOException e){
            System.out.println("这是异常处理逻辑");
        }
    }
}
