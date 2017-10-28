package comiam.janne.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastScanner 
{
	BufferedReader br;
	StringTokenizer stok;

	FastScanner(InputStream is) 
	{
		br = new BufferedReader(new InputStreamReader(is));
	}

	String nextToken() throws IOException 
	{
		while (stok == null || !stok.hasMoreTokens()) 
		{
			String s = br.readLine();
			if (s == null) 
			{
				return null;
			}
			stok = new StringTokenizer(s);
		}
		return stok.nextToken();
	}

	int nextInt() throws IOException 
	{
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException 
	{
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException 
	{
		return Double.parseDouble(nextToken());
	}

	char nextChar() throws IOException 
	{
		return (char) (br.read());
	}

	String nextLine() throws IOException 
	{
		return br.readLine();
	}
}
