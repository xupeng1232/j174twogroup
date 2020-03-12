package com.project.frame;

/**
 * 模拟一个框架
 * 接受用户指令，收到start输出发动汽车，收到stop停止汽车
 */
public interface IMyFrame {

    /**
     * 操控汽车
     * @param message 操控汽车指令
     */
    public void controllerCar(IMessage message);
}
