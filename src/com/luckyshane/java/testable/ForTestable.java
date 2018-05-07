package com.luckyshane.java.testable;

/**
 * Created by luckyshane on 2018/5/4.
 */
public class ForTestable extends SimpleTestable {

    @Override
    protected String getName() {
        return super.getName();
    }

    @Override
    public void doTest() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
