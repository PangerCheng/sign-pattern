package factory;

import element.MainBoard;
import element.impl.AmdMainBoard;
import element.impl.InterMainBoard;

/**
 * @author peter
 * <p>
 * 模拟电脑组装中的主板生产商
 */
public class MainBoardFactory {
    public static MainBoard createMainBoard(int mainBoardType) {
        MainBoard mainBoard = null;
        switch (mainBoardType) {
            case 1:
                mainBoard = new InterMainBoard(755);
                break;
            case 2:
                mainBoard = new AmdMainBoard(938);
                break;
        }
        return mainBoard;
    }
}
