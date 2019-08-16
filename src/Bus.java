/*
 * 客车类
 */
public class Bus extends MotoVehicle{
	public Bus(){
		
	}
public Bus(String no, String brand, int price,int seatCount) {
		super(no, brand, price);
		this.seatCount=seatCount;
		// TODO Auto-generated constructor stub
	}
private int seatCount;
public int getSeatCount() {
	return seatCount;
}
public void setSeatCount(int seatCount) {
	this.seatCount = seatCount;
}
//重写父类计算价格的方法
public int money(int day){
	return super.getPrice()*day;
}
}
