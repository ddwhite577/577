package stage2;

import org.json.JSONObject;
import java.beans.Encoder;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.List;
import java.util.Map;

public class BaiDuAPIConvertText {
    /*
    * 获取权限令牌token
    * @return返回示例：
    * {
    * "access_token":"........"
    * "expires_in":...
    * }
    *
    * */
    public static void main(String[] args) {
        long s1=System.currentTimeMillis();
        //存储token
        String token=getAuth();
        //测试API
        System.out.println("权限token："+token);
        //解析本地图片成为base64_utf8格式
        /*
        *C:\Users\Administrator\Desktop\java1\02\orcTest.jpeg
        *C:\Users\Administrator\Desktop\java1\02\orcTest1.jpeg
        *
        * */
        File file=new File("C:\\Users\\Administrator\\Desktop\\java1\\02\\orcTest2.jpeg");
        String base64_utf8=generalBasic(file);
        //请求服务器解析图片中的文字 返回结果
        OCR(token,base64_utf8);

        //解析过程所需要的时间效率
        long s2=System.currentTimeMillis();
        System.out.println("提取文字所需要的时间："+(s2-s1)+"ms");
    }


    //请求识别
    public static String OCR(String token,String base64_UTF8){
        try{
        //请求识别的URL
        String url="https://aip.baidubce.com/rest/2.0/ocr/v1/general_basic";
        String result=HttpUtil.post(url,token,base64_UTF8);
            System.out.println("解析图片文字结果："+result);
            return result;
        }catch (Exception e){
            System.out.println("解析图片文字失败");
            e.printStackTrace();
        }
        return null;
    }

    //将本地图片进行BASE64编码转换 BASE64编码是网络传输文件的流行8b字节码编码  是从二进制到字符的过程
    public static String generalBasic(File imageFile){
        //存储从图片中读取的数据
        byte[] imgData=null;
        try{
            //创建字节输入流
            InputStream in=new FileInputStream(imageFile);
            //in.available()获取文件可读取的字节大小
            imgData=new byte[in.available()];
            //System.out.println("imgData："+imgData);
            //读取
            in.read(imgData);
            //关闭
            in.close();
            //Base64编码转换
            String imgStr=Base64Util.encode(imgData);//这是官方的编码
            //转换为UTF-8格式 方便浏览器解析
            String imgParam= URLEncoder.encode(imgStr,"UTF-8");
            //参数
            String param="image="+imgParam;
            System.out.println(param);
            //返回这个数据 以便请求解析图片文字
            return param;

//            //自己的编码  错误
//            Base64.Encoder encoder= Base64.getEncoder();
//            String imgStr=encoder.encodeToString(imgData);
//            imgStr=imgStr.replaceAll("\r\n","");
//            imgStr=imgStr.replaceAll("\\+","%2B");
//            return imgStr;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    //获取权限
    public static String getAuth(){
        //官方获取的API Key 这里使用自己的Key 在官方获取
        String myAPIKey="Zff7rWOhIAEFRw4MZxqR5nXI";
        //官方获取的 Secret Key 使用自己的key
        String mySecretKey="RTeZT0axOazNfN2Eojwkk1iSWB3yxjml";
        //返回获取到的权限
        return getAuth(myAPIKey,mySecretKey);

    }
/*
* 获取API访问token
* 该token有一定的有效期，需要自定管理，当失效时需要重新获取
* @param ak 是百度云官网获取的API key
* @param sk 是百度云官网获取的secret key
* @return access_token
* */
    private static String getAuth(String ak, String sk) {
        //获取token地址
        String authHost="https://aip.baidubce.com/oauth/2.0/token?";
        //获取token的URL
        String getAccessTokenUrl=authHost
                //1、grant_type授权类型为固定参数
        +"grant_type=client_credentials"
                //2、自己的API Key
        +"&client_id="+ak
                //2、自己的secret key
        +"&client_secret="+sk;
        try{
            //拼接号的 真正的获取token的URL
            URL realURL=new URL(getAccessTokenUrl);
            //打开和URl之间的连接
            HttpURLConnection connection=(HttpURLConnection) realURL.openConnection();
            //向服务器发送GET请求
            connection.setRequestMethod("GET");
            //连接服务器
            connection.connect();
            //获取所有响应头字段
            Map<String, List<String>> map=connection.getHeaderFields();
            //遍历所有的响应头字段
            for(String key:map.keySet()){
                System.err.println(key+"--->"+map.get(key));
            }
            //定义BufferedReader缓冲输入流来读取URL的响应
            BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            //接收结果
            String result="";
            String line;//行读取
            while((line=in.readLine())!=null){
                result+=line;
            }
            System.err.println("Result："+result);
            //解析Json
            JSONObject jsonObject=new JSONObject(result);
            //解析后的结果
            String access_token=jsonObject.getString("access_token");
            //返回结果
            return access_token;

        }catch (Exception e){
            System.out.println("获取token权限失败");
            e.printStackTrace();
        }
        return null;
    }
}
