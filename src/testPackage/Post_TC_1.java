package testPackage;

import java.io.IOException;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonPackage.API_commonFunction;
import commonPackage.utility_Function;
import io.restassured.path.json.JsonPath;
import repositoryPackage.req_repo;

public class Post_TC_1 {
	@Test
	public static void execute() throws IOException {
		
		// 
		String baseURI=req_repo.post_baseURI();
		String resource=req_repo.poost_resource();
		String requestBody=req_repo.post_requestBody();
		
		int statusCode=API_commonFunction.post_statusCode(baseURI, resource, requestBody);
		System.out.println(statusCode);
		
		String responseBody=API_commonFunction.post_responseBody(baseURI, resource, requestBody);
		System.out.println(responseBody);
		
		// fetch responsebody 
		JsonPath jspresp=new JsonPath(responseBody);
		String res_id=jspresp.getString("id");
		String res_name=jspresp.getString("name");
		String res_createdAt=jspresp.getString("createdAt");
		String res_year=jspresp.getString("data.year");
		String res_price=jspresp.getString("data.price");
		String res_CPU_model=jspresp.getString("data.CPU_model");
		String res_Harddisk_size=jspresp.getString("data.Harddisk_size");
		
		//parse request body
		JsonPath jspreq=new JsonPath(requestBody);
		String req_name=jspreq.getString("name");
		String req_year=jspreq.getString("data.year");
		String req_price=jspreq.getString("data.price");
		String req_CPU_model=jspreq.getString("data.CPU_model");
		String req_Harddisk_size=jspreq.getString("data.Harddisk_size");
		String currentdate=LocalDate.now().toString();
		
		//validate 
		Assert.assertEquals(statusCode, 200);
		Assert.assertEquals(res_name, req_name);
		Assert.assertEquals(res_year, req_year);
		Assert.assertEquals(res_price, req_price);
		Assert.assertEquals(res_CPU_model, req_CPU_model);
		Assert.assertEquals(res_Harddisk_size, req_Harddisk_size);
		Assert.assertEquals(res_createdAt.substring(0,10), currentdate);
		Assert.assertNotNull(res_id);
		
		utility_Function.evidencefilecreate("Post_TC_1", requestBody, responseBody);
		
	}
	 
}
