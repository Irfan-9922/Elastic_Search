package com.example.hhhh;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadvalueFromJsonFile {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		demo d=new demo();
		// Convert JSON string from file to Object
		demo staff = mapper.readValue(new File("D:\\file.json"), demo.class);
		System.out.println(staff);

		

	}

}
