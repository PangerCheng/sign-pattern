package element.impl;

import element.MainBoard;

/**
 * @author peter
 * <p>
 * 模拟电脑组装中的超威主板
 */
public class AmdMainBoard implements MainBoard {
    private int cpuHoleNum = 0;

    public AmdMainBoard(int cpuHoleNum) {
        this.cpuHoleNum = cpuHoleNum;
    }

    @Override
    public void installCpu() {
        System.out.println("我是超威主板，我的CPU插孔数为" + this.cpuHoleNum);
    }

    @Override
    public int getCpuHoleNum() {
        return this.cpuHoleNum;
    }
}
