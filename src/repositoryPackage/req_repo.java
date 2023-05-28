package repositoryPackage;

public class req_repo {
	
	public static String post_baseURI() {
		
		String baseURI="https://api.restful-api.dev";
				return baseURI;
	}
	
	public static String poost_resource() {
		
		String resource="/objects";
		return resource;
	}
	
	public static String post_requestBody() {
		
		String requestBody="{\r\n"
				+ "   \"name\": \"Apple MacBook Pro 16\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": 2019,\r\n"
				+ "      \"price\": 1849.99,\r\n"
				+ "      \"CPU_model\": \"Intel Core i9\",\r\n"
				+ "      \"Harddisk_size\": \"1 TB\"\r\n"
				+ "   }\r\n"
				+ "}";
		return requestBody;
	}
	
       public static String post_requestBody1() {
		
		String requestBody="{\r\n"
				+ "   \"name\": \"Google Pixel 6 Pro\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": 2020,\r\n"
				+ "      \"price\": 1049.99,\r\n"
				+ "      \"CPU model\": \"Intel Core i5\",\r\n"
				+ "      \"Hard disk size\": \"1.5 TB\"\r\n"
				+ "   }\r\n"
				+ "}";
		return requestBody;
	}


}
