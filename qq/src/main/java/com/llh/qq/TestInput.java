package com.llh.qq;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
/**
 * JavaС�����˴򿪼��±��Լ���������
 * @author Wayss
 *
 */

public class TestInput {
    public static void main(String [] args) throws Exception{
        Robot robot = new Robot();
        //����ϵͳ�����򿪼��±�
        Runtime.getRuntime().exec("notepad");
        robot.delay(2000);
        //ȫ����ʾ
//        keyPressWithAlt(robot,KeyEvent.VK_SPACE);
        //����x
        keyPress(robot, KeyEvent.VK_X);
        //����س�
        keyPress(robot, KeyEvent.VK_ENTER);
        robot.delay(1000);
        //�����ַ���
        keyPressString(robot,"Hello, I'm Robot");
    }

    //Shift��ϼ�
    public static void keyPressWithShift(Robot r,int key){
        //����Shift
        r.keyPress(KeyEvent.VK_SHIFT);
        //����ĳ����
        r.keyPress(key);

        //�ͷ�ĳ����
        r.keyRelease(key);
        //�ͷ�Shift
        r.keyRelease(KeyEvent.VK_SHIFT);
        //�ȴ�100ms
        r.delay(100);
    }

    //Ctrl��ϼ�
    public static void keyPressWithCtrl(Robot r,int key){
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(key);

        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_CONTROL);

        r.delay(100);
    }

    //Alt��ϼ�
    public static void keyPressWithAlt(Robot r ,int key){
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(key);

        r.keyRelease(key);
        r.keyRelease(KeyEvent.VK_ALT);
        r.delay(100);
    }

    //�����ַ���
    public static void keyPressString(Robot r ,String str){
        //��ȡ���а�
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        //�������ַ�����װ��
        Transferable tText = new StringSelection(str);
        //���ַ���������а�
        clip.setContents(tText, null);
        //����Ctrl+Vʵ��ճ���ı�
        keyPressWithCtrl(r, KeyEvent.VK_V);
        r.delay(100);
    }

    //��������
    public static void keyPressNumber(Robot r ,int number){
        //������ת���ַ���
        String str = Integer.toString(number);
        //�����ַ����ķ���
        keyPressString(r,str);
    }

    //ʵ�ְ�һ��ĳ������
    public static void keyPress(Robot r,int key){
        //���¼�
        r.keyPress(key);
        //�ͷż�
        r.keyRelease(key);

        r.delay(1000);
    }

    //���ٴ�QQ��Ϣ(�����ϼ����˶���)
    public static void keyPressAtlWithCtrlWithZ(Robot r){
        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_Z);

        r.keyRelease(KeyEvent.VK_Z);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_ALT);
    }

    //���һ��������
    public static void mouseLeftHit(Robot r){
        r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        r.delay(1000);
    }
}
