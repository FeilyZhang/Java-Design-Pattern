package tech.feily.DesignPattern.Adapter;

public class ZhiLiuDian extends JiaoLiuDian implements GuiFanInterface {

    // 通过约定的方法让笔记本使用直流电
    @Override
    public void LapTopUsingElectronic() {
        convert();
    }

    // 直流电使用者尽可能通过接口调用我们约定的不会变动的方法，该方法可能后续因为直交流电转换技术升级而变动
    public void convert() {
        print();
        System.out.println(ZhiLiuDian.class.getName() + ":交流电你别嚣张，马上转换你为直流电");
        System.out.println(ZhiLiuDian.class.getName() + ":正在转换...");
        // 一系列转换逻辑
        System.out.println(ZhiLiuDian.class.getName() + ":交流电已经转换为12伏特直流电，笔记本现在可以使用");
    }
}
