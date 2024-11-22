package JsonPathExpression;

public class Responce {
	
	public static String responce() {
		
		return "{\r\n"
				+ "    \"firstName\": \"John\",\r\n"
				+ "    \"lastName\": \"doe\",\r\n"
				+ "    \"age\": 26,\r\n"
				+ "    \"address\": {\r\n"
				+ "        \"streetAddress\": \"naist street\",\r\n"
				+ "        \"city\": \"Nara\",\r\n"
				+ "        \"postalCode\": \"630-0192\"\r\n"
				+ "    },\r\n"
				+ "    \"phoneNumbers\": [\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"iPhone\",\r\n"
				+ "            \"number\": \"0123-4567-8888\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"type\": \"home\",\r\n"
				+ "            \"number\": \"0123-4567-8910\"\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
	}

}
