package fis.topic.practive_02b;

public class XeDap implements Ixe {
	private int Sophieu;
	private double price = 500;

	public int getSophieu() {
		return Sophieu;
	}

	public void setSophieu(int sophieu) {
		Sophieu = sophieu;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public XeDap(int sophieu, double price) {
		super();
		Sophieu = sophieu;
		this.price = price;
	}

}
