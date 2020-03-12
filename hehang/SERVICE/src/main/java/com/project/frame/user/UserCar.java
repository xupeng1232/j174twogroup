package com.project.frame.user;

import com.project.frame.IMessage;

/**
 * 用户操作汽车
 * 用户实现框架的接口，重写框架方法
 */
public class UserCar implements IMessage {

    @Override
    public String getMessage() {

        return "start";
    }


}
