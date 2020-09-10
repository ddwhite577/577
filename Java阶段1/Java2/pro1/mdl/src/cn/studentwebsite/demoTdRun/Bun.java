package cn.studentwebsite.demoTdRun;

//包子类
public class Bun {
    //皮
    private String skin;
    //馅
    private String stuffing;
    //包子状态
    private boolean flag=false;

    //构造函数
    public Bun() {
    }

    public Bun(String skin, String stuffing) {
        this.skin = skin;
        this.stuffing = stuffing;
    }

    //get  set

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getStuffing() {
        return stuffing;
    }

    public void setStuffing(String stuffing) {
        this.stuffing = stuffing;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
