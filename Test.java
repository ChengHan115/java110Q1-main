package Java110Q2;

public class Test {
	private int english;		//(1)
	private int math;
	public void Test(int eng,int m) {		//(2)
		english=eng;math=m;
	}
	public double avg() {
		return (english+math)/2;		//(3)
	}
	public void show() {
		System.out.println("name:Annie"+" english="+english+" math="+math+" ang="+avg());		//(4)
	}
}
