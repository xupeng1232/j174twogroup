package com.project.frame.user;

import com.project.frame.IMessage;
import com.project.frame.IMyFrame;
import com.project.frame.MyFrame;

public class Test {

    public static void main(String[] args) {
        //创建指令
        IMessage message = new UserCar();
        //运行框架，创建框架对象
        IMyFrame frame = new MyFrame();
        //调用框架
        frame.controllerCar(message);
    }
}
