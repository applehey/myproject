package com.liao.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks =
                new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        System.out.println(stocks);
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
//        set();
//        list();
//        arrayTest();
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(7);
        set.add(3);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(3);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(60, 77 ,79 ,50 ,67);
        for (int score : scores) {
            System.out.println(score);
        }
    }

    private static void arrayTest() {
        int[] number = new int[5];
        number[0] = 5;
        number[4] = 3;
//        number[5] = 7;
        int[] scores = {60, 77 ,79 ,50 ,67};
        System.out.println(scores);
        for (int i =0; i<5; i++) {
            System.out.println(scores[i]);
        }

        for (int n : scores) {
            System.out.println(n);
        }
    }
}
