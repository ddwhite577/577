package package17;

/*模仿电脑USB接口
* 1、电脑
* a.开机
* b.关机
* 2、键盘
* a.打开键盘
* b.关闭键盘
* 3、鼠标
* a.打开鼠标
* b.关闭鼠标
* 4、USB接口
* */

//电脑类
class Computer{
    public void powerOn(){
        System.out.println("打开电脑");
    }
    public void powerOff(){
        System.out.println("关闭电脑");
    }
    //电脑使用设备
    public void useDevice(USB usb){
        //打开设备
        usb.open();

        //判断设备类型
        if(usb instanceof Mouse){
            //向下转型
            Mouse mouse=(Mouse)usb;
            //电脑使用鼠标功能
            mouse.click();
        }else if(usb instanceof keyBoard){
            //向下转型
            keyBoard keyboard=(keyBoard)usb;
            //电脑使用键盘功能
            keyboard.keyInput();
        }


        //关闭设备
        usb.close();
    }
}

class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
    //鼠标特有功能
    public void click(){
        System.out.println("鼠标点击");
    }
}

class keyBoard implements USB{
    @Override
    public void open(){
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
    //键盘特有功能
    public void keyInput(){
        System.out.println("键盘输入");
    }
}

public class test17 {
    public static void main(String[] args) {
        System.out.println("你好Java世界");

        //实例一个电脑变量对象
        Computer computer=new Computer();
        //电脑开机
        computer.powerOn();
        //电脑多态使用鼠标设备
        USB usb=new Mouse();
        computer.useDevice(usb);

        //电脑非多态使用电脑键盘设备
        keyBoard keyboard=new keyBoard();
        computer.useDevice(keyboard);

        //电脑关机
        computer.powerOff();
    }
}
