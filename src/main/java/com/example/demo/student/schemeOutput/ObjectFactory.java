//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2022.05.22 um 11:54:00 AM CEST 
//


package com.example.demo.student.schemeOutput;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.studentSchemeOutput.xjc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.studentSchemeOutput.xjc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetStudentRequest }
     * 
     */
    public GetStudentRequest createGetStudentRequest() {
        return new GetStudentRequest();
    }

    /**
     * Create an instance of {@link GetNumberOfStudentsResponse }
     * 
     */
    public GetNumberOfStudentsResponse createGetNumberOfStudentsResponse() {
        return new GetNumberOfStudentsResponse();
    }

    /**
     * Create an instance of {@link GetNumberOfStudentsRequest }
     * 
     */
    public GetNumberOfStudentsRequest createGetNumberOfStudentsRequest() {
        return new GetNumberOfStudentsRequest();
    }

}
