package newPlatter;

public class PlatterA extends Cricle{
	private Cricle hole1;
	private Cricle hole2;
	
	public PlatterA(double OuterCricle,double innerCricle1,double innerCricle2) {
		super(OuterCricle);
		this.hole1=new Cricle(innerCricle1);
		this.hole2= new Cricle(innerCricle2);
	}
	
	public double getouterBoundry() {
		return getArea();
	}
	
	public double getVacantArea() {
		return hole1.getArea()+hole2.getArea();
	}
	
	public double getInnerBoundry() {
		return getArea()-hole1.getArea()-hole2.getArea();
		}
	
	public static void main(String[] args) {
		PlatterA a = new PlatterA(15,6, 8);
		
		System.out.println(a.getouterBoundry());
	}
}