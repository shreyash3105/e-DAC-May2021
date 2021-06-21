class Pat13
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1,l=i;k<=i;k++){
				System.out.print((char)(l+64)+" ");
			}
			System.out.println();
		}
	}
}