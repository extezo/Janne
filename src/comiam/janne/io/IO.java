package comiam.janne.io;

import static java.lang.System.out;

public class IO 
{
	public static final String ERROR = "JANNE ERROR";
	public static final String INFO = "JANNE INFO";
	public static final String DEBUG = "JANNE DEBUG";
	
	public static void log(boolean message)
	{
		log(message + "");
	}
	
	public static void log(double message)
	{
		log(message + "");
	}
	
	public static void log(float message)
	{
		log(message + "");
	}
	
	public static void log(byte message)
	{
		log(message + "");
	}
	
	public static void log(short message)
	{
		log(message + "");
	}
	
	public static void log(int message)
	{
		log(message + "");
	}
	
	public static void log(long message)
	{
		log(message + "");
	}
	
	public static void log(String tag, String message)
	{
		log(tag + ": " + message);
	}
	
	public static void log(String message)
	{
		out.println(message);
	}
	
	public static void debug(boolean message)
	{
		log(DEBUG, message + "");
	}
	
	public static void debug(double message)
	{
		log(DEBUG, message + "");
	}
	
	public static void debug(float message)
	{
		log(DEBUG, message + "");
	}
	
	public static void debug(byte message)
	{
		log(DEBUG, message + "");
	}
	
	public static void debug(short message)
	{
		log(DEBUG, message + "");
	}
	
	public static void debug(int message)
	{
		log(DEBUG, message + "");
	}
	
	public static void debug(long message)
	{
		log(DEBUG, message + "");
	}
	
	public static void debug(String message)
	{
		log(DEBUG, message);
	}
	
	public static void error(boolean message)
	{
		log(ERROR, message + "");
	}
	
	public static void error(double message)
	{
		log(ERROR, message + "");
	}
	
	public static void error(float message)
	{
		log(ERROR, message + "");
	}
	
	public static void error(byte message)
	{
		log(ERROR, message + "");
	}
	
	public static void error(short message)
	{
		log(ERROR, message + "");
	}
	
	public static void error(int message)
	{
		log(ERROR, message + "");
	}
	
	public static void error(long message)
	{
		log(ERROR, message + "");
	}
	
	public static void error(String message)
	{
		log(ERROR, message);
	}
	
	public static void info(boolean message)
	{
		log(INFO, message + "");
	}
	
	public static void info(double message)
	{
		log(INFO, message + "");
	}
	
	public static void info(float message)
	{
		log(INFO, message + "");
	}
	
	public static void info(byte message)
	{
		log(INFO, message + "");
	}
	
	public static void info(short message)
	{
		log(INFO, message + "");
	}
	
	public static void info(int message)
	{
		log(INFO, message + "");
	}
	
	public static void info(long message)
	{
		log(INFO, message + "");
	}
	
	public static void info(String message)
	{
		log(INFO, message);
	}
}
