
public class MathUtil {
	
	public void add(int no1,int no2) {
		System.out.println("Result is : "+(no1+no2));
	}
	public void add(int no1,int no2,int no3) {
		System.out.println("Result is : "+(no1+no2+no3));
	}
	
	public int add(int no1,float no2,int no3) {
		int result=(int)(no1+no2+no3);
		return result;
	}
	public float add(int no1,int no2,float no3) {
		return(no1+no2+no3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathUtil util=new MathUtil();
		util.add(10, 20);
		util.add(10, 20, 30);
		System.out.println("Result is :"+util.add(10, 10.20f, 30));
		System.out.println("Result is :"+util.add(10, 30, 10.20f));

	}

}
