class Pat18
{
public static void main(String[] args)
{
int x=64;
for(int i =5;i>=1;i--)
{
for (int j =1;j<=i;j++)
{
System.out.print((char)(x+j) +" ");
}
System.out.println();
}
}
}