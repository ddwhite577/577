package stage2.day2;

import java.util.BitSet;

public class demoBitset {
    public static void main(String[] args) {
        //位集合类实现一组可以单独设置和清除的位或标记

        BitSet bit1=new BitSet(16);//16位
        BitSet bit2=new BitSet(16);

        System.out.println(bit1);
        System.out.println(bit2);
        System.out.println("=====================");

        //设置16位中的某些位
        for (int i = 0; i <16 ; i++) {
            //偶数 0-16个数字中 为偶数的存入
            if(i%2==0) bit1.set(i);
            //不是5的倍数的时候  0-16个数字中 不为5的倍数的存入
            if (i%5!=0) bit2.set(i);
        }
        System.out.println(bit1);
        System.out.println(bit2);
        System.out.println("=====================");
        //and 与 计算
        bit1.and(bit1);//1and1=1
        System.out.println(bit1);
        bit2.and(bit1);//2and1={...}
        System.out.println(bit2);
        System.out.println("=====================");
        //or 或 计算
        bit1.or(bit1);//1or1==1
        System.out.println(bit1);
        bit2.or(bit1);//2or1={...}
        System.out.println(bit2);
        bit1.or(bit2);//1or2={...}
        System.out.println(bit1);
        System.out.println("=====================");
        //xor异或运算
        bit1.xor(bit2);
        System.out.println(bit1);
//        bit1.xor(bit1);
//        System.out.println(bit1);//{}

    }
}
