package com.example.webservice;

import jakarta.xml.ws.Endpoint;

public  class Application  {
      public static void main(String[] args){
          String url ="http://0.0.0.0:8877/";
          Endpoint.publish (url, new WebService1());
          System.out.println("web service deployed at " +url);
      }
    }
