/*
 * �ͳ���
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
//��д�������۸�ķ���
public int money(int day){
	return super.getPrice()*day;
}
}
