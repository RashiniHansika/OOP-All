public class Test{
	public static void main(String args[]){
		Student s1 = new Student();
		s1.name = "Kamal";
		s1.dltNo = "IT7821";
		s1.address ="Colombo";
		
		Student s2 = new Student();
		s1.name = "Nimal";
		s1.dltNo = "IT7821";
		s1.address ="Galle";
		
		Student s3 = new Student();
		s1.name = "Amal";
		s1.dltNo = "IT7821";
		s1.address ="Kandy";
		
		System.out.println("Name : " + s1.name + "\nDIT Number : " + s1.dltNo + "\nAddress : " + s1.address);
		System.out.println("Name : " + s2.name + "\nDIT Number : " + s2.dltNo + "\nAddress : " + s2.address);
		System.out.println("Name : " + s3.name + "\nDIT Number : " + s3.dltNo + "\nAddress : " + s3.address);
	}
}