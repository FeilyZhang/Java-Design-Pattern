package tech.feily.DesignPattern.Adapter;

public class LapTop {

    public static void main(String[] args) {
        System.out.println("ʹ�ü̳е�������ģʽ");
        GuiFanInterface electronic = new ZhiLiuDian();
        electronic.LapTopUsingElectronic();
        System.out.println(LapTop.class.getName() + ":���ǱʼǱ�������ͨ���ӿ��ṩ���ȶ�ֱ����Դ������");
        
        System.out.println("ʹ��ί�е�������ģʽ");
        GuiFanAbstract electronic2 = new ZhiLiuDianModel2(new JiaoLiuDian());
        electronic2.LapTopUsingElectronic();
        System.out.println(LapTop.class.getName() + ":���ǱʼǱ�������ͨ���ӿ��ṩ���ȶ�ֱ����Դ������");
        
    }

}
