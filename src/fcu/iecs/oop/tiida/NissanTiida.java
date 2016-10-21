package fcu.iecs.oop.tiida;

public class NissanTiida
{
	public int num=1;
	public void tiida()
	{
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		num++;
	}
}
