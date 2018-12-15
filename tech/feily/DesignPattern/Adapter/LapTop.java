package tech.feily.DesignPattern.Adapter;

public class LapTop {

    public static void main(String[] args) {
        System.out.println("使用继承的适配器模式");
        GuiFanInterface electronic = new ZhiLiuDian();
        electronic.LapTopUsingElectronic();
        System.out.println(LapTop.class.getName() + ":我是笔记本，正在通过接口提供的稳定直流电源工作！");
        
        System.out.println("使用委托的适配器模式");
        GuiFanAbstract electronic2 = new ZhiLiuDianModel2(new JiaoLiuDian());
        electronic2.LapTopUsingElectronic();
        System.out.println(LapTop.class.getName() + ":我是笔记本，正在通过接口提供的稳定直流电源工作！");
        
    }

}
