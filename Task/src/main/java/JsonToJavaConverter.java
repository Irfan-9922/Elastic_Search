import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * All rights are reserved for diss.
 */

/**
 * @author i.shaikh
 *
 * @Date  Feb 22, 2018
 * @Time  6:07:57 PM
 */
	public class JsonToJavaConverter {

      
      
        public static void main(String args[]) throws JsonParseException
                                                    , JsonMappingException, IOException{

                JsonToJavaConverter converter = new JsonToJavaConverter();
              
                String json = "{\n" +
                "    \"name\": \"Garima\",\n" +
                "    \"surname\": \"Joshi\",\n" +
                "    \"phone\": 9832734651}";
              
                //converting JSON String to Java object
                System.out.println(converter.fromJson(json));
                
        }
      
      
        public Object fromJson(String json) throws JsonParseException
                                                   , JsonMappingException, IOException{
                User garima = new ObjectMapper().readValue(json, User.class);
              
              
                return garima;
        }
      
      
        public static class User{
                private String name;
                private String surname;
                private long phone;
              
                public String getName() {return name;}
                public void setName(String name) {this.name = name;}

                public String getSurname() {return surname;}
                public void setSurname(String surname) {this.surname = surname;}

                public long getPhone() {return phone;}
                public void setPhone(long phone) {this.phone = phone;}

                @Override
                public String toString() {
                        return "User [name=" + name + ", surname=" + surname + ", phone="
                                        + phone + "]";
                }
              
               
        
}



}
