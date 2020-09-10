package stage2.ImagetextConvertText;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.util.Scanner;

//测试tess4j
public class ConvertText {
    public static void main(String[] args) throws TesseractException {
        //创建ORC光学字符识别实例
        ITesseract instance=new Tesseract();
        //如果未将tessdata放在根目录下，需要制定绝对路径
       // instance.setDatapath("C:\\Users\\Administrator\\Desktop\\java1\\02\\stage2\\Tess4J-3.4.8-src\\Tess4J\\tessdata");

        //如果需要识别英文以外的语言，需要指定识别的语种，并需要将对应的语言包放入到语言库tessdata项目中(根目录是指与模块同级，而不是src)
        instance.setLanguage("chi_sim");//chi_sim是中文包

        //指定识别的图片 C:\Users\Administrator\Desktop\java1\02\orcTest1.jpeg
        String path="C:\\Users\\Administrator\\Desktop\\java1\\02\\orcTest.jpeg";
        Scanner in=new Scanner(System.in);
        path=in.next();//输入
        //创建虚拟文件对象
        File imgDir=new File(path);
        //测试识别时间1
        long s1=System.currentTimeMillis();
        //开始识别图片上的文字
        String orcResult=instance.doOCR(imgDir);
        //测试识别时间2
        long s2=System.currentTimeMillis();
        //输出识别结果
        System.out.println("光学字符识别ORC识别结果：\n"+orcResult);
        System.out.println("耗时："+((double)(s2-s1)/(double)60)+"s");

    }
}
