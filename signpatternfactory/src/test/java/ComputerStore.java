public class ComputerStore {
    public static void main(String[] args) {
        System.out.println("来顾客了……");
        System.out.println("要配置inter的cpu和amd的主板");

        ComputerEngineer engineer = new ComputerEngineer();
        engineer.diyComputer(ElementType.INTER.getType(), ElementType.AMD.getType());

        System.out.println("又来顾客了……");
        System.out.println("要配置inter的cpu和inter的主板");

        engineer = new ComputerEngineer();
        engineer.diyComputer(ElementType.INTER.getType(), ElementType.INTER.getType());
    }
}
