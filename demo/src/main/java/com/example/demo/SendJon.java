package com.example.demo;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import org.json.JSONObject;

// Change the url variable to the desired URL in the constructor for the desired Endpoubt
public class SendJon {
    private String url;

    public SendJon(String url) {
        this.url = url;
    }

    public void sendData(Data data) {
        try {
            // Create the JSON object to send
            JSONObject json = new JSONObject();
            json.put("name", data.getName());
            json.put("Age ", data.getAge());
          //  json.put("email", data.getEmail());
          //  json.put("dato", new SimpleDateFormat("yyyy-MM-dd").format(data.getDato()));

            // Open a connection to the specified URL
            URL url = new URL(this.url);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Set the request method to POST and add the JSON to the request body
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes(json.toString());
            out.flush();
            out.close();

            // Read the response from the server
            // You can add code here to handle the response if needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendData(String name, int email/*, String email, Date dato*/) {
    }
}



