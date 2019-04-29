package element.impl;

import element.Cpu;

/**
 * @author peter
 * <p>
 * 模拟电脑组装中的英特尔cpu
 */
public class InterCpu implements Cpu {
    private int pinNum = 0;

    public InterCpu(int pinNum) {
        this.pinNum = pinNum;
    }

    @Override
    public void calculate() {
        System.out.println("我是英特尔cpu，我的指针数为" + this.pinNum);
    }

    @Override
    public int getPinMum() {
        return this.pinNum;
    }
}
