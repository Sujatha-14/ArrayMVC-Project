package ary;
import java.util.Arrays;
public class Model {
	private int[] m;
	public int[] getM() {
		return m;
	}
	public void setM(int[] m) {
		this.m = m;
	}
	public Model(int[] a) {
		this.m=a;
	}
	public int[] editarray(int index,int value) {
		if(m.length>index) {
		m[index]=value;
		}
		else {
			System.out.println("Pls enter the valid index");
		}
		return m;
	}
	public int[] arrangearray(int[] m) {
		Arrays.sort(m);
		return m;
	}
}
