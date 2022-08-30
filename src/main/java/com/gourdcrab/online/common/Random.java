package com.gourdcrab.online.common;

import java.util.ArrayList;
import java.util.List;

public class Random {
    public static List<Integer> randomResult() {
        List<Integer> list = new ArrayList<>();
        list.add((int) (Math.floor(Math.random() * 6) + 1));
        list.add((int) (Math.floor(Math.random() * 6) + 1));
        list.add((int) (Math.floor(Math.random() * 6) + 1));
        return list;
    }
}
