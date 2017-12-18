package lesson5;

public class FloatNum {
	
	private float floatNum;

	public float getFloatNum() {
		return floatNum;
	}

	public void setFloatNum(float floatNum) {
		this.floatNum = floatNum;
	}

	public FloatNum(float floatNum) {
		this.floatNum = floatNum;
	}
	
	public FloatNum() {
	}

	public void checkFloat() {
		if(getFloatNum()>=-5&&getFloatNum()<=5) {
			System.out.println("Number "+getFloatNum()+" in range [-5;5]");
		}
		else {
			System.out.println("Number "+ getFloatNum()+" out of range [-5;5]");
		}
	}
}
