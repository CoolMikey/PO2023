package pl.edu.pw.mini.po.punktowane01.punktowane2021_1_b;

public class ObiektKopalniany {
	
	private float wartoscRynkowa;

	public ObiektKopalniany() {
		
	}
	
	public void setWartoscRynkowa(float wartoscRynkowa) {
		this.wartoscRynkowa = wartoscRynkowa;
	}

	public float getWartoscRynkowa() {
		return this.wartoscRynkowa;
	}
	
	@Override
	public String toString() {
		return Float.toString(this.getWartoscRynkowa());
	}
	
}
