/*
 * ������
 */
public abstract class MotoVehicle {

	public MotoVehicle(){
		
	}
	
	public MotoVehicle(String no, String brand, int price) {
		super();
		this.no = no;
		this.brand = brand;
		this.price = price;
	}

	private String no;//���ƺ�
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String brand;//����
	private int price;
	//����۸�
	public abstract int money(int day);

}
