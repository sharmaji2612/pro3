package inheritance;

public class parent  extends
Grandparent{
	String name;
	int Num ;
	String S;

	//String Status;
	public  void CSE()
	{
		System.out.println(name + " is the student of ABES");
		System.out.println("*************************************************************************************");
	}
    public void Code()
    {
    	System.out.println("The college code is EaW324VB5");
    	System.out.println("*************************************************************************************");
    }
    //int S;
	  public void St()
	    {
	    	
	    if(Num > 7 && Num <=10)
	    {
	    	S = "pass";
	    }
	    else
	    	{
	    	S = "fail";
	    	}
	    	}
  
}
