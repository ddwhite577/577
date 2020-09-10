package stage2.day3;

import java.io.FileWriter;
import java.io.IOException;

public class demoFileIOException2 {
    public static void main(String[] args) throws IOException {
        //在try中创建对象
        FileWriter fw=new FileWriter("W:\\b.txt");
        try(fw){
            //写文件
            for (int i = 0; i < 5; i++) {
                fw.write(""+i);
            }
            fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
