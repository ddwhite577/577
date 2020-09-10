package cn.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class demoJsoup {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //类加载  获取demo.xml的path
        ClassLoader classLoader = demoJsoup.class.getClassLoader();
        URL resource = classLoader.getResource("demo.xml");
        String path = resource.getPath();

        //解析xml文档 加载文件进内存 获取document对象，根据xml文档获取
        File file=new File(path);
        Document document = Jsoup.parse(file, "utf-8");

        //创建JXDocument对象
        JXDocument jxDocument=new JXDocument(document);

        //结合xpath语法
        List<JXNode> jxNodes = jxDocument.selN("//student"); // 查询所有节点"//"
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }

    }
}
