package ary;

public class AryMVCDemo {

	public static void main(String[] args) {
		int[] a= {8,3,5,1,2,9};
		Model model=new Model(a);
		View view=new View();
		Controller c=new Controller(model ,view);
		c.seedetials();
		c.arragearray();
		c.Update(1, 10);;
		c.seedetials();
	c.arragearray();
		c.seedetials();
	}

}
