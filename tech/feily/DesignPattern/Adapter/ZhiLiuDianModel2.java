package tech.feily.DesignPattern.Adapter;

public class ZhiLiuDianModel2 extends GuiFanAbstract {
    JiaoLiuDian jld;
    public ZhiLiuDianModel2(JiaoLiuDian jld) {
        this.jld = jld;
    }
    //ͨ��Լ���ķ����ñʼǱ�ʹ��ֱ����
    @Override
    public void LapTopUsingElectronic() {
        convert();
    }

    // ֱ����ʹ���߾�����ͨ���ӿڵ�������Լ���Ĳ���䶯�ķ������÷������ܺ�����Ϊ�����������䶯
    public void convert() {
        jld.print();
        System.out.println(ZhiLiuDian.class.getName() + ":������������ţ�����ת����Ϊֱ����");
        System.out.println(ZhiLiuDian.class.getName() + ":����ת��...");
        // һϵ��ת���߼�
        System.out.println(ZhiLiuDian.class.getName() + ":�������Ѿ�ת��Ϊ12����ֱ���磬�ʼǱ����ڿ���ʹ��");
    }
}
