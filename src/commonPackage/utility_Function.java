package commonPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class utility_Function {
	
	public static void evidencefilecreate(String filename , String requestBody, String responseBody ) throws IOException {
		
		File newfile=new File("G:\\restFile\\electronics\\"+filename+".txt");
		System.out.println("a new file is creating to save electonic list :"+newfile.getName());
		
		FileWriter datawrite=new FileWriter(newfile);
		datawrite.write("request body "+requestBody+"\n\n");
		datawrite.write("response body "+responseBody);
		datawrite.close();
		System.out.println("request and responsebody saved into a file :"+newfile.getName());
		
	}

}
