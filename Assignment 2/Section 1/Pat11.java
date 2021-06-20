class Pyramid5
{ 

public static void main(String[]args){
for(int i=9;i>=1;i--)
{
for(int a=1;a<=i;a++)
{
System.out.print(" ");
}
for(int j=i;j<=9;j++)
{
System.out.print(j);
}
for(int k=8;k>=i;k--)
	{
		System.out.print(k);
		
	}
	System.out.println();

}

}
}