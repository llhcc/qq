package com.llh.qq;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
/**
 * Javaʵ����QQ���������ֲ�����
 * @author Wayss
 *
 */
public class TestDeskTop {
    static Desktop deskapp = Desktop.getDesktop();

    public static void main(String [] args) throws AWTException{
        inputQQ();
    }

    public static void openQQ(){
        //�жϵ�ǰϵͳ�ͷ�֧��Desktop�ṩ�Ľӿ�
        if(Desktop.isDesktopSupported()){
            try {
                deskapp.open(new File("D:\\Program Files\\Tencent\\QQ\\Bin\\QQScLauncher.exe"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void inputQQ() throws AWTException{
        Robot robot = new Robot();
        //3�ȴ�3���ʼִ��������Զ������¼�
        robot.delay(3000);
        //���������(Ŀ�����ù��ŵ�QQ��)
        TestInput.mouseLeftHit(robot);

        for(int i = 0 ; i < 10; i++){
            //����Ц��
            TestInput.keyPressString(robot, "/wx");
            //���»س�
            TestInput.keyPress(robot, KeyEvent.VK_ENTER);
        }
    }
}
