package com.example.demo;

//import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendDataController {

    @PostMapping("/data")
    public void sendData(@RequestBody Data data) {
        //Create a new instance of the SendJSON class
        // Change the URL to the desired endpoint URL
        SendJon sender = new SendJon("http://localhost:8080/api/person");
        //Call the sendData method, passing in the values from the Data object
        sender.sendData(data.getName(), data.getAge()/* , data.getEmail(), data.getDato()*/);
    }
}

class Data {
    private String name;
    private int age;
   // private String email;
   // private Date dato;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
  /*   public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDato() {
        return dato;
    }
    public void setDato(Date dato) {
        this.dato = dato;
    }*/
}
