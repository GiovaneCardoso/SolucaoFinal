package br.com.project.expetions;

/**
 * The type Exceptions.
 */
public class Exceptions
{
	/**
	 * Handle exceptions string.
	 *
	 * @param e the e
	 * @return the string
	 */
	public static String handleExceptions(Exception e)
	  {
	        if (e instanceof NullPointerException)
	        {
	            return "Object is null";
	            
	        }else if (e instanceof NumberFormatException)
	        {
	            return "Invalid number";
	        }else if (e instanceof ArrayIndexOutOfBoundsException) 
	        {
	            return "Arrays is bounds";
	            
	        }else 
	        {
	            e.printStackTrace();
	            
	            return "No handle exception";   
	        }
	    }	
}
