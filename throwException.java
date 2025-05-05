class throwException{
	public static void main(String arg[]){
		int i = 0, j = 10;
		
		try{
			j = j/i;
			if(i==0)
				throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			System.out.println("That's the default output "+e);
		}
	}
}