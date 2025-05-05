class BijayeeniException extends RuntimeException{
	public BijayeeniException(String str){
		super(str);
	}
}

class UserDefinedException{
	public static void main(String arg[]){
		int i = 0, j = 10;
		
		try{
			j = j/i;
			if(i==0)
				throw new BijayeeniException("Division by zero is not possible");
		}
		catch(BijayeeniException e){
			System.out.println("That's the default output "+e);
		}
	}
}