package pack;

public class Reverse {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123;
reverse(num);
	}
	public static void reverse(int num)
	
	{
		int r=0;
		while(num>0)
		{
		int a=num%10;
		num=num/10;
		r=a+r*10;
		}
		System.out.println("Reverse is "+r);
	}

}
