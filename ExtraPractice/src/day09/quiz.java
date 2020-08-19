package day09;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.function.BinaryOperator;

public class quiz {
    public static void main(String[] args) {
    int num = 9;
    if(num++ ==10){
        System.out.println("Hello World "+num);
    }else{
        System.out.println("Hello Universe "+num);
    }


    }

}