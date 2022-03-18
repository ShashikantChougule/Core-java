
public class TestArray {

	public static void main(String[] args) {
		//simple array creation syntax
		
		int arr[]= {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
			
		}
		
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
	    a[3]=40;
	    
	    //using for each loop
		
for(int val:a) {
	System.out.println(val);
}

int matrix[][]= {
		{1,2,3},
		{4,5,6}
};
int imax[][]=new int[2][2];
imax[0][0]=1;
imax[0][1]=2;
imax[1][0]=3;
imax[1][1]=4;

  // nasted foreach
for(int[] eachrow:imax) {
	for(int val:eachrow) {
		System.out.println(val);
	}
}
	
	
	//array of referenace
	
	Employee e[]=new Employee[3];
	e[0]=new Employee();
	e[1]=new Employee(1,"shashi");
	e[1]=new Employee(2,"Vijay");
	
	for(Employee emp:e) {
		emp.display();
	}
	}	

}
