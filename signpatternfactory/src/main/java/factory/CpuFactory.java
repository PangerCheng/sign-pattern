package factory;

import element.Cpu;
import element.impl.AmdCpu;
import element.impl.InterCpu;

/**
 * @author peter
 * <p>
 * 模拟cpu生产商
 */
public class CpuFactory {
    public static Cpu createCpu(int cpuType) {
        Cpu cpu = null;
        switch (cpuType) {
            case 1:
                cpu = new InterCpu(755);
                break;
            case 2:
                cpu = new AmdCpu(938);
                break;
        }
        return cpu;
    }
}
