/**
 * �γ���
 * @author admin
 *
 */
public class Car extends MotoVehicle {
private String type;//����
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

	//��д�������۸�ķ���
	public  int money(int day){
		int price=super.getPrice()*day;
		return price;
	}
}
