import java.util.Scanner;


public class fibo {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
	  int a=0,b=1;
	  int sum=0;
	  int c=0;
	for(int i=0;i<s1;i++){
		if(s1<=1)
			sum=1;
			else{
				sum=a+b;
				a=b;
				b=sum;
			}
		System.out.println(sum);
		}
		  
	 }
}
