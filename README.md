# SpringBootSoapService

A simple soap webservice for the purpose of being consumed by https://github.com/sypianBS/SoapConsuming

Code based mainly on https://github.com/bykowski/springboot-soap-example but extented with additional endpoints

example request's body - student's details:
```
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
xmlns:std="http://www.bensypianskinamespace.com">
  <soap:Body>
    <std:getStudentRequest>
      <id>1</id>
    </std:getStudentRequest>
  </soap:Body>
</soap:Envelope>
```

example request's body - total number of students:

```
<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
xmlns:std="http://www.bensypianskinamespace.com">
  <soap:Body>
    <std:getNumberOfStudentsRequest>
    </std:getNumberOfStudentsRequest>
  </soap:Body>
</soap:Envelope>
```
