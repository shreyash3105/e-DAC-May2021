public class Palindrome {
    static boolean func(String str, int start, int end)
	{
		if(start >= end)
			return true;
		return ((str.charAt(start)==str.charAt(end)) && 
			func(str, start + 1, end - 1));
	}
    public static void main(String [] args) 
    {	
    	String s = "abccba";
    	System.out.println(func(s, 0, s.length() -1));        
    }
}