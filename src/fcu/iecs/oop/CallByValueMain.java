package fcu.iecs.oop;

public class CallByValueMain
{
	public static void main(String[] args)
	{
		int num=5;
		CallByValueExample cbv=new CallByValueExample();
		cbv.addTen(num);
		System.out.println("Num in CallByValueMain:"+num);
	}
}
