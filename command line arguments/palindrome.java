class palindrome{
    public static void isPalindrome(String s) {
        String r="";
		String x;
		for(int i=0;i<s.length();i++)
		{
			x=s.substring(i,i+1);
			r=x+r;
		}
		System.out.println("reverse => "+r);
		if(r.equals(s)==true)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        String s = args[0];
        palindrome u=new palindrome();
        u.isPalindrome(s);
    }
}


