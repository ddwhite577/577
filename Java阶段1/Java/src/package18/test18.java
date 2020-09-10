package package18;

/*注意：
 * 1、抽象类可以有抽象方法，也可以没有抽象方法
 * 2、抽象方法在抽象类中只声明 不定义
 * 3、抽象类中可以有普通方法 可定义
 * 4、抽象类中可以有成员变量
 * 5、当抽象类被继承后 抽象方法必须被实现
 * 6、抽象类不能被实例化
 * 7、有抽象方法的类必须是抽象类
 * 8、抽象方法在子类必须被重写
 * */
//员工抽象类
abstract class Employee{
    //普通成员变量
    int salary=1000;
    //抽象方法
    public abstract double computePay();
    //普通方法
    int getSalary(){
        return salary;
    }
}
//记账员工
class Accountant extends Employee{

    int salary=2000;
    @Override
    public double computePay() {
        return salary;
    }
}
public class test18 {
    public static void main(String[] args) {
        System.out.println("你好java世界");
        Employee em=new Accountant();
        System.out.println(em.salary);
        System.out.println(em.getSalary());
        System.out.println(em.computePay());
    }
}

