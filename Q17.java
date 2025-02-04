class Q17{
    public static void main(String args[]) {
		
		System.out.println("The numbers are");
        
        for (int num = 1000; num <= 9999; num++) {
            
            int ab = num / 100;  // first two digits
            int cd = num % 100;  // last two digits
			int s=ab+cd;

            
            if (s*s == num) {
                
                System.out.println(num);
            }
        }
    }
}
