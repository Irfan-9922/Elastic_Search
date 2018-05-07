package com.example.hhhh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WriteDatatoFileinjson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		
		ObjectMapper mapper=new ObjectMapper();
		/*List<demo> l=new ArrayList<demo>();
		l.add(new demo(2,"nisar"));
		l.add(new demo(2,"nisar"));
		l.add(new demo(2,"nisar"));
		l.add(new demo(2,"nisar"));
		l.add(new demo(2,"nisar"));
		l.add(new demo(2,"nisar"));
		
	 mapper.writeValue(new File("D:\\writer.json"), l);*/
		
		List dk=mapper.readValue(new File("D:\\file.json"), List.class);
		System.out.println(dk);
		
	}

}
