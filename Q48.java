class Library{
	String libraryName;
	Library(String libraryName){
		this.libraryName = libraryName;
	}
	class Book{
		void getLibraryName(){
			System.out.println("The name of the library: "+libraryName);
		}
	}
}
class Q48{
	public static void main(String[] arg){
		Library.Book obj = new Library("Silpomondir Gronthagar").new Book();
		obj.getLibraryName();
	}
}