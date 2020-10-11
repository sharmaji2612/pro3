package inheritance;

public class Branchalloted extends parent {
	 
	   
	public void change()
	{
		if(S == "pass")
		{
			System.out.println("Dear " +name+ " Congratulations! Your branch is sucessfully changed. ");
			System.out.println("*************************************************************************************");
		}
		else
		{
			System.out.println("Dear "+name+ " Sorry! Your are not eligible to change your branch.");
		}
		System.out.println("*************************************************************************************");
		
	}

}
