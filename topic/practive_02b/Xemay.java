package fis.topic.practive_02b;

public class Xemay {
	private int sophieu;
	private String soxe;
	private double price = 1000;

	public int getSophieu() {
		return sophieu;
	}

	public void setSophieu(int sophieu) {
		this.sophieu = sophieu;
	}

	public String getSoxe() {
		return soxe;
	}

	public void setSoxe(String soxe) {
		this.soxe = soxe;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Xemay(int sophieu, String soxe, double price) {
		super();
		this.sophieu = sophieu;
		this.soxe = soxe;
		this.price = price;
	}

}
