package OwnCode;

public class VariablenListenElement {

	private int position;
	private double iCode;
	private String variable;
	
	public int getposition(){
		return this.position;
	}
	
	public void setposition(int pos){
		this.position=pos;
	}
	
	public double getiCode(){
		return this.iCode;
	}
	
	public void setiCode(double code){
		this.iCode=code;
	}
	
	public String getvariable(){
		return this.variable;
	}
	
	public void setvariable(String variable){
		this.variable=variable;
	}
}
