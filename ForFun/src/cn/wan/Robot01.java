package cn.wan;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Robot01 {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        robot.delay(5000);

        for (int i = 0; i < 5; i++) {
            robot.mouseMove(348, 704);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseMove(240, 450);
            robot.delay(100);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(500);
        }

    }
}
