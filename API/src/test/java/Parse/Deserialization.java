package Parse;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Deserialization {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		//int[] phoNos= {9999,565758,675758};
		//Employee emp=new Employee("keshava",001,false,phoNos);
		
		ObjectMapper objmap=new ObjectMapper();
		//objmap.readValue(new File("./jsonEmployee.json"), Employee.class);
	
		Employee empRead=objmap.readValue(new File("./jsonEmployee.json"), Employee.class);
		System.out.println(empRead.getEmpId());
		System.out.println(empRead.getEmpName());
		System.out.println(empRead.ismStatus());
			
	
	}
}

	
	


