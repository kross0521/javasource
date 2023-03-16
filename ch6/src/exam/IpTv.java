package exam;

public class IpTv extends ColorTv {
	
	private	String IpTv;
	
	public IpTv(int size, int color, String IpTv) {
		super(size, color);
		this.IpTv = IpTv;
	}
	@Override
	void printProperty() {
		System.out.println("나의 IpTv는 "+super.getSize()+"인치, "
	+super.getcolor()+"컬러, "+IpTv+" 입니다.");
	}
	
}
