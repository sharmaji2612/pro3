package inheritance;

public class profile extends parent {
	public void file()
	{
		if(S=="pass" && Num<11 && Num>=8)
	{
	
		System.out.println("          ***********SELECTED CANDIDATES FOR CLUB RECURITMENT ***********");
		System.out.println("CANDIDATE NAME: " + name );
		System.out.println("BRANCH : COMPUTER SCIENCE AND ENGNEERING");
		System.out.println("RECRITMENT CODE : FL"+S+Num);
		System.out.println();
		System.out.println("Dear "+ name+ " CONGRATULATIONS! You achieve the all stages to enter in the club . We are happy to say that now you are "
				+ "the part of this technovation family. ");
		System.out.println("                             **************THANK YOU ***********");
		System.out.println("                             *********Team Technovation**********");
	}
		else
		{
			System.out.println("Dear " + name + " You are not eligible for......Any club");
		}
}
	

}