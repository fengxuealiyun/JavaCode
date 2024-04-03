package com.xunhou.mould;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 测试类头的注释信息
 */
public class HelloMould {
    //.后缀
    //定义语句模板

    /**
     * The constant num.
     */
//ctrl alt t xx语句环绕
    //静态常量声明
    //psfi
    public static final int num = 1;

    /**
     * The constant num2.
     */
    public static final int num2 = 2;


    //psfs
    public static final String str3 = "复习";


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("kkkk");

        Person person = new Person();
        person.setId(0);
        person.setName("");
        person.setAge(0);


        int id = person.getId();
        String name = person.getName();
        int age = person.getAge();


        //集合 类型.list 自定义后缀
        ArrayList<String> objects = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> ada =new ArrayList<>();

        String str = "ada";
        System.out.println(str);


        methed01();


//        try {
//            Class.forName("aaa");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        /*
        * 是空 不是空快捷键 变量.n .nn
        */
        if (str == null) {

        }
        if (str != null) {

        }

        /*数组名 for i
        * 一般for循环 增强for循环
        */
        
        int[] arr = new int[]{1,2,3,4};

        for (int i = 0; i < arr.length; i++) {
            
        }
        
        for (int i : arr) {
            
        }
        //倒叙 数组 arr.forr
        for (int i = arr.length - 1; i >= 0; i--) {

        }

        List list5 = new ArrayList<>();

        for (Object o : list) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        for (Object o : list) {
            
        }

        System.out.println("args = " + Arrays.deepToString(args));
        //soutv 输出变量值可以自己选
        int o = 10;
        String str2 = "aa";

        System.out.println("list = " + list);
        System.out.println("o = " + o);

        String str1 = new String();

        //强转对象 .cast
        Object obg = new String();

//        String obg1 = (String) obg;

        //强转赋值变量 .castvar
        String s = (String) obg;

        int num = 1;


    }

    private static void methed01() {
        System.out.print("a");
        System.out.print("a");
        System.out.print("a");
    }

    /**
     * Test.
     */
    public static void test(){
        int[] arr = new int[]{22,23,445,555};
        for (int i : arr) {
//            i = i / i[0];
        }
    }

    /**
     * Test 1.
     */
    @Test
    public void test1(){

    }

    /**
     * Test 2.
     */
    @Test
    public void test2(){
        System.out.println("nonono");
    }

    {
        {
            {
                {
                    {
                        {

                        }
                    }
                }
            }
        }
    }
}
