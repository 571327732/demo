import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;//����
		int num;//��¼ѡ���ѡ��
System.out.println("��ӭ�����������޹�˾!");
System.out.println("������Ҫ���޵�����:");
Scanner input=new Scanner(System.in);
day=input.nextInt();//����
System.out.println("(1���γ� 2.�ͳ�)");
Car car=null;//�γ�
Bus bus=new Bus();//�ͳ�
num=input.nextInt();
switch (num) {
case 1:
	System.out.println("������Ҫ��������Ʒ��(1.���� 2.���)");
	num=input.nextInt();
	
	if (num==1) {
		car=new Car("��k1234","����",500,"550i");
	}else if(num==2){
		System.out.println("������γ����ͺ�:(1.����GLB 2.������)");
		num=input.nextInt();
		if (num==1) {
			car=new Car("��k1234","���",600,"����GLB");
		}else if (num==2) {
			car=new Car("��k1234","���",300,"������");
		}
	}
	System.out.println("����������������ƺ�Ϊ:"+car.getNo());
	System.out.println("�˿����ã�����Ҫ֧�������޷���Ϊ"+car.money(day));
	break;
case 2:
	System.out.println("������Ҫ�������ͳ�Ʒ��(1.�� 2.����)");
	bus.setNo("��12435");
	num=input.nextInt();
	if (num==1) {
		bus.setBrand("��");
	}else if(num==2){
		bus.setBrand("����");
	}
	System.out.print("������ͳ�����λ����");
	num=input.nextInt();
	if (num>16) {
		bus.setPrice(1500);
	}else if(num<=16){
		bus.setPrice(800);
	}
	bus.setSeatCount(num);//��λ��ֵ
	System.out.println("��������������ƺ���"+bus.getNo());
	System.out.println("����Ϊ"+bus.money(day));
	break;
default:
	break;
}
	}

}
