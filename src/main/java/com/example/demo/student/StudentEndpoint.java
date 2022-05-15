package com.example.demo.student;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.GetStudent;
import com.Student;
import com.GetResponse;

/* calling with content-type text/xml 
 * <?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
xmlns:std="http://www.bensypianskinamespace.com">
  <soap:Body>
    <std:getStudent>
      <id>2</id>
    </std:getStudent>
  </soap:Body>
</soap:Envelope>
 */

@Endpoint 
public class StudentEndpoint {
	
	private StudentService studentService;
	
	public StudentEndpoint(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PayloadRoot(namespace = "http://www.bensypianskinamespace.com", localPart = "getStudent")
	@ResponsePayload 
	public GetResponse getStudentById(@RequestPayload GetStudent getStudent) {
		Student studentById = studentService.getStudentsById(getStudent.getId());
		GetResponse getResponse = new GetResponse();
		getResponse.setStudent(studentById);
		return getResponse;
		
	}
}
