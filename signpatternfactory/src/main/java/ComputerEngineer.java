import element.Cpu;
import element.MainBoard;
import factory.CpuFactory;
import factory.MainBoardFactory;

/**
 * @author peter
 * <p>
 * 模拟电脑组装中的电脑工程师——组装电脑
 */
public class ComputerEngineer {
    private Cpu cpu = null;
    private MainBoard mainBoard = null;

    /**
     * 组装电脑
     * 电脑工程师完全听从客户的要求，从对应的厂商处获取硬件、测试硬件、组装电脑
     *
     * @param cpuType
     * @param mainBoardType
     */
    public void diyComputer(int cpuType, int mainBoardType) {
        /**
         * 硬件准备
         */
        prepareHardWare(cpuType, mainBoardType);

        /**
         * 各硬件兼容测试
         */
        boolean isCompatible = this.cpu.getPinMum() == this.mainBoard.getCpuHoleNum();
        System.out.println(isCompatible ? "CPU和主板兼容，已安装您的要求组装电脑" : "CPU和主板不兼容，无法按照您给的要求组装电脑！");
    }

    private void prepareHardWare(int cpuType, int mainBoardType) {
        /**
         * 根据要求直接去厂商获取硬件
         */
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainBoard = MainBoardFactory.createMainBoard(mainBoardType);

        /**
         * 测试硬件
         */
        this.cpu.calculate();
        this.mainBoard.installCpu();

    }
}
