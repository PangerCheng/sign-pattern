package element.impl;

import element.Cpu;

/**
 * @author peter
 * <p>
 * 模拟电脑组装中的超威cpu
 */
public class AmdCpu implements Cpu {
    private int pinNum = 0;

    public AmdCpu(int pinNum) {
        this.pinNum = pinNum;
    }

    @Override
    public void calculate() {
        System.out.println("我是超威Cpu,我的指针数为" + this.pinNum);
    }

    @Override
    public int getPinMum() {
        return this.pinNum;
    }
}
