class hollowfull

{ 

public static void main(String[]args){

for(int i=1;i<=5;i++)
{
	for(int j=5;j>=i;j--)   // For spacing
{
	
System.out.print(" ");
}
if(i==1)                     
{
	System.out.print("* ");
}
else if(i>=2 && i!=5)
    {
		System.out.print("* ");
    for(int j=1;j<=i-2;j++) 
		                           
    
     {
    System.out.print("  ");
     }
      System.out.print("*");
     }
else
     {
	for(int j=1;j<=5;j++)
	 {
		System.out.print("* "); 
		
	 }
     }

      System.out.println();

}
}
}