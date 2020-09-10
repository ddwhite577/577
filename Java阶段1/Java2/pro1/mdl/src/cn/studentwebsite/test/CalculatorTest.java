package cn.studentwebsite.test;

import cn.studentwebsite.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    /*
    * 测试单元  //测试单元就相当于main入口
    * */
    @Test
    public void testAdd(){
        Calculator c=new Calculator();
        int add = c.add(11, 22);
        //System.out.println(sub);//一般不输出
        //而是使用断言
        Assert.assertEquals(33,add);
    }

    /*
     * 测试单元  //测试单元就相当于main入口
     * */
    @Test
    public void testSub(){
        Calculator c=new Calculator();
        int sub = c.sub(11, 22);
        //System.out.println(sub);//一般不输出
        //而是使用断言
        Assert.assertEquals(-11,sub);
    }

}
