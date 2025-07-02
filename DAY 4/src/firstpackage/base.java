package firstpackage;

public class base {

	int varDefault =10;
	public int varPublic = 20;
	private int varPrivate =30;
	protected int varProtected =40 ;
	
	// declare default protected public and private methods
	
	void methodDefault()
	{
		
		System.out.println("Public acces base class");
		System.out.println("Public varible : "+varPublic);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected acces base class");
		System.out.println("Protected variable :+varProtected");
	}

	public void methodPublic() {
		// TODO Auto-generated method stub
		
	}
}
