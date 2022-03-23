package fis.topic.practive_02b;

import java.util.ArrayList;
import java.util.List;

public class check {
	private List<Ixe> xe = new ArrayList<>();

	public int Soxegui() {
		return this.xe.size();
	}

	public double tienGuixe() {
		double tongtien = 0;
		for (Ixe xIxe : this.xe) {
			tongtien += xIxe.getPrice();
		}
		return tongtien;
	}

	public double tienLai() {
		double tienLai = 0;
		tienLai = this.tienGuixe();
		tienLai -= this.tienGuixe() / 10;
		tienLai -= Soxegui() * 100;
		return tienLai;
	}
}
