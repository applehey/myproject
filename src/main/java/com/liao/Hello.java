package com.liao;

public class Hello {
    public static void main(String[] args){
//        System.out.println("Hello World");
//        new Person().hello();
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));

        Person p = new Person("Liao",66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b = 120;
        float weight = 66.5f;
        float height = 1.7f;
        boolean enroll = false;
        String name = "Tom";*/
    }
}
