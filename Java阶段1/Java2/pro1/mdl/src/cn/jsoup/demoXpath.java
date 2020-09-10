package cn.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class demoXpath {
    public static void main(String[] args) throws IOException {
        //类加载  获取demo.xml的path
        ClassLoader classLoader = demoXpath.class.getClassLoader();
        URL resource = classLoader.getResource("demo.xml");
        String path = resource.getPath();

        //解析xml文档 加载文件进内存 获取document对象，根据xml文档获取
        File file=new File(path);
        Document document = Jsoup.parse(file, "utf-8");
        //获取元素对象Element
        Elements elements = document.getElementsByTag("xing");

        System.out.println(elements.size());
        System.out.println(elements.get(0).text());

    }
}
