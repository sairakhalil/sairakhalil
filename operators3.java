public class operators3{
	public static void main(String [] arrgs){
	String x="Sher" ;
	String y="Locked";
	
	Scanner s = new Scanner (System.in);

	  System.out.println("Enter username:");
	  String uuid=s.next();

	  System.out.println("Enter password:");

	  String upwd=s.next();

	  if((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x))){
	  	system.out.println("Welcome user.");
	  }
	  else  {
	  	System.out.println("Wrong uid or password");
	  }
	 
	}
}