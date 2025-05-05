class ensureCapacity {
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("I love JAVA");
		System.out.println("Before ensureCapacity, method capacity = "+str.capacity());
		str.ensureCapacity(42);
		System.out.println("After ensureCapacity, method capacity = "+str.capacity());
	}
}