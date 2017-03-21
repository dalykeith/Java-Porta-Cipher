package ie.gmit.sw;
import java.io.*;
//import java.net.MalformedURLException;
import java.net.*;
//BufferedReader

public class Parse {
	
	public static BufferedReader runParse(String location){
		BufferedReader br = null;
		try{
			if(location.contains("www.") || location.contains("http"))
			{
				URL url = new URL(location);
				br = new BufferedReader (new InputStreamReader(url.openStream()));
			}
			else
			{
				br = new BufferedReader (new FileReader(location));
			}
		}
		catch(IOException e)
		{
		System.out.println("File or URL Not Found");
	}
		return br;
	}
	public static void writeToFile(String location, String keyword) //datastructuresandalgorithims key
	{
		BufferedReader br = runParse(location);
		int s;
		
		try{}catch(FileNotFoundException e){}
	}
}
