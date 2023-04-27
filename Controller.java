package ary;

public class Controller {
private Model m;
private View v;

public Controller(Model m,View v) {
	this.m=m;
	this.v=v;
}
public void Update(int index,int value) {
	m.editarray(index, value);
}
public void arragearray() {
	m.arrangearray(m.getM());
}
public void seedetials() {
	v.PrintingValues(m.getM());
}

}
