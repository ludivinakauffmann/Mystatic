package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "杨老师";
        //1.创建对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        s1.setGender("男");
        //s1.teacherName = "杨老师";
        s1.study();
        s1.show();
        //2.创建第二个对象
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.setGender("女");
        s2.study();
        s2.show();
        System.out.println("========master test==========");
        System.out.println("========hot-fix commit2======");
        System.out.println("========push test============");
        System.out.println("========pull test============");
    }

}
