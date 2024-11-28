package pack;

public class Fact {
	// int a=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fact obj=new Fact();
System.out.println("Factorial is  "+obj.fact(5));
	}
public int fact(int num)
{ 
	//this.num=num;
	int f=1;
	for(int i=1;i<=num;i++)
	{
		f=f*i;
	}
	return(f);
}
}
