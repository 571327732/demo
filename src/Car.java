/**
 * 轿车类
 * @author admin
 *
 */
public class Car extends MotoVehicle {
private String type;//类型
public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Car(){
	
}

public Car(String no, String brand, int price,String type) {
	super(no, brand, price);
	this.type=type;
	// TODO Auto-generated constructor stub
}

	//重写父类计算价格的方法
	public  int money(int day){
		int price=super.getPrice()*day;
		return price;
	}
}
