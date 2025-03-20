class University{
	static class Department{
		String departmentName;
		int noOfFaculty;
		Department(String departmentName, int noOfFaculty){
			this.departmentName = departmentName;
			this.noOfFaculty = noOfFaculty;
		}
		void displayInfo(){
			System.out.println("Department Name: "+departmentName);
			System.out.println("No. of faculty: "+noOfFaculty);
		}
	}
}
class Q46{
	public static void main(String[] arg){
		University.Department obj = new University.Department("MCA",10);
		obj.displayInfo();
	}
}