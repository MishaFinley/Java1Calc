package edu.neumont.csc180.Finley.Misha.FinleyM_JUnit;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public static void main( String[] args )
    {
        
    }
    
    
    public static int Add(int n1, int n2) {
    	return n1 + n2;
    }
    public static int Subtract(int n1, int n2) {
    	return n1 - n2;
    }
    public static double Divide(int n1, int n2) {
    	double d1 = (double)n1;
    	double d2 = (double)n2;
    	return d1 / d2;
    }
    public static int Multiply(int n1, int n2) {
    	return n1 * n2;
    }
}
