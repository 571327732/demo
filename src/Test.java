import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;//天数
		int num;//记录选择的选项
System.out.println("欢迎来到汽车租赁公司!");
System.out.println("请输入要租赁的天数:");
Scanner input=new Scanner(System.in);
day=input.nextInt();//天数
System.out.println("(1：轿车 2.客车)");
Car car=null;//轿车
Bus bus=new Bus();//客车
num=input.nextInt();
switch (num) {
case 1:
	System.out.println("请输入要租赁汽车品牌(1.宝马 2.别克)");
	num=input.nextInt();
	
	if (num==1) {
		car=new Car("京k1234","宝马",500,"550i");
	}else if(num==2){
		System.out.println("请输入轿车的型号:(1.商务车GLB 2.林荫大道)");
		num=input.nextInt();
		if (num==1) {
			car=new Car("京k1234","别克",600,"商务车GLB");
		}else if (num==2) {
			car=new Car("京k1234","别克",300,"林荫大道");
		}
	}
	System.out.println("分配给您的汽车车牌号为:"+car.getNo());
	System.out.println("顾客您好！您需要支付的租赁费用为"+car.money(day));
	break;
case 2:
	System.out.println("请输入要租赁汽客车品牌(1.金杯 2.金龙)");
	bus.setNo("京12435");
	num=input.nextInt();
	if (num==1) {
		bus.setBrand("金杯");
	}else if(num==2){
		bus.setBrand("金龙");
	}
	System.out.print("请输入客车的座位数：");
	num=input.nextInt();
	if (num>16) {
		bus.setPrice(1500);
	}else if(num<=16){
		bus.setPrice(800);
	}
	bus.setSeatCount(num);//座位赋值
	System.out.println("分配给您的汽车牌号是"+bus.getNo());
	System.out.println("费用为"+bus.money(day));
	break;
default:
	break;
}
	}

}
