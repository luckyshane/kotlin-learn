package com.luckyshane.java.testable;

/**
 * Created by luckyshane on 2018/5/4.
 */
public abstract class SimpleTestable implements Testable {

    protected String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public final void test() {
        System.out.println("\n=====> START JAVA TEST: " + getName());
        doTest();
        System.out.println("\n<===== END JAVA TEST: " + getName());
    }

    public abstract void doTest();
}
