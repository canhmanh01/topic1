package fis.topic.practive_03;

public class MaiAnTiem {
	int hp;
	int d;
	double s;
	String t;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getH() {
		return d;
	}

	public void setH(int h) {
		this.d = h;
	}

	public double getS() {
		return s;
	}

	public void setS(double s) {
		this.s = s;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public MaiAnTiem(int hp, int h, double s, String t) {
		super();
		this.hp = hp;
		this.d = h;
		this.s = s;
		this.t = t;
	}

	public MaiAnTiem() {
		super();
	}

	@Override
	public String toString() {
		return "MaiAnTiem [hp=" + hp + ", h=" + d + ", s=" + s + ", t=" + t + "]";
	}

	public double p1() {
		return p1();
	}

	public double p2() {
		return (hp + s) / 1000;
	}

	public double f() {
		return d + s;
	}
}
