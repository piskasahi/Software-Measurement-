package calculator;

import java.sql.Connection;
import java.sql.SQLException;

public class calculatormain {
	
public Connection con  = null;
	public boolean isDbConnected(Connection con) {
	    try {
	        return con != null && !con.isClosed();
	    } catch (SQLException ignored) {}

	    return false;
	}
	 
	public double add(double a, double b)
	{
		double sum = a+b;
		return sum;
	}
	public double sub(double a, double b)
	{
		double sub = a-b;
		return sub;
	}
	public double divide(double a, double b)
	{
		double div = a/b;
		return div;
	}
	public double mult(double a, double b)
	{
		double mul  = a*b;
		return mul;
	}

}
