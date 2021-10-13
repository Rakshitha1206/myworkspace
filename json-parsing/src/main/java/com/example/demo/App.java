package com.example.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyJsonParser parser = new MyJsonParser();
        Product obj = new Product(101,"sony tv",24500);
        String jsonResp = parser.javaToJson(obj);
        System.out.println(jsonResp);
        
       
        System.out.println(parser.jsonToJava(jsonResp));
        System.out.println( "== Convert From JSON to Java");
        
    }
}
