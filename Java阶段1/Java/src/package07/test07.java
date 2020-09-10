package package07;
import java.io.*;
import java.util.*;
public class test07 {
    public static void main(String[] args) {
        System.out.println("你好Java..");
//        String dirname="C:\\Users\\Administrator\\Desktop\\Java\\tmp\\2";
//        //文件对象
//        File d=new File(dirname);
//        //创建文件夹
//        d.mkdirs();
//        //删除文件夹
//        //d.delete();
//        System.out.println("文件名:"+d.getName());
//        System.out.println("父级目录名："+d.getParent());
//        System.out.println("父级抽象目录名："+d.getParentFile());
//        System.out.println("父级名+文件名："+d.getPath());
//        System.out.println("测试抽象路径名是否为绝对路径名："+d.isAbsolute());
//        System.out.println("返回当前文件的完整物理路径："+d.getAbsolutePath());
//        System.out.println("抽象路径名最后一次被修改的时间："+new Date(d.lastModified()));
//        System.out.println("抽象路径名数组："+d.listFiles());


        //读取目录
        String dirname="C:\\Users\\Administrator\\Desktop\\Java";
        File fp=new File(dirname);
        int filecount=0;//文件总数
        int dircount=0;//目录总数
        //判断文件是不是目录
        if(fp.isDirectory())
        {
            System.out.println("------根目录："+dirname+"------");
            //获取当前目录下的其他目录列表
            String s[]=fp.list();
            //显示目录名称
            for(int i=0;i<s.length;i++)
            {
                //创建文件对象
                File ftmp=new File(dirname+"/"+s[i]);
                if(ftmp.isDirectory())
                {
                    dircount++;
                }
                else{
                    filecount++;
                }
            }
            System.out.println("目录总数："+dircount+"\t\t文件总数："+filecount);
            for(int i=0;i<s.length;i++)
            {
                //创建文件对象
                File ftmp=new File(dirname+"/"+s[i]);
                if(ftmp.isDirectory())
                {
                    System.out.println(s[i]);
                }
            }
            for(int i=0;i<s.length;i++)
            {
                //创建文件对象
                File ftmp=new File(dirname+"/"+s[i]);
                if(!ftmp.isDirectory())
                {
                    System.out.println(s[i]);
                }
            }
        }else
        {
            System.out.println(dirname+"不是一个目录");
        }

    }
}
