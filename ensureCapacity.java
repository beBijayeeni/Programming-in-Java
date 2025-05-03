class ensureCapacity {
	public static void main ( String [] args ){
		StringBuffer str1 = new StringBuffer ( " I Love JAVA " ) ;
		System.out.println(str1);
		System . out . println ( " Before ensureCapacity " + " method capacity = "+ str1 . capacity () ) ;


 		str1 . ensureCapacity (42) ;

 		System . out . println ( " After ensureCapacity " + " method capacity = "+ str1 . capacity () ) ;
		StringBuffer str2 = new StringBuffer (17) ;
		System.out.println(str2);
		System . out . println ( " Before ensureCapacity " + " method capacity = "+ str2 . capacity () ) ;


 		str2 . ensureCapacity (20) ;

 		System . out . println ( " After ensureCapacity " + " method capacity = "+ str2 . capacity () ) ;
	}
}