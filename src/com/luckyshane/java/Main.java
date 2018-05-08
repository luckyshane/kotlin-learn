package com.luckyshane.java;

import com.luckyshane.java.testable.ForTestable;
import com.luckyshane.java.testable.Testable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luckyshane on 2018/5/4.
 */
public class Main {

    public static void main(String[]args) {
        List<Testable> testableList = new ArrayList<>();
        testableList.add(new ForTestable());

        for (Testable testable : testableList) {
            testable.test();
        }
    }

}
