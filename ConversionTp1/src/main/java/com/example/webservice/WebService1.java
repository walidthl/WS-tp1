package com.example.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService (serviceName="tp1")
public class WebService1 {
    @WebMethod(operationName="conversionEurtoDh")
    public double conversion(@WebParam(name="montant") double mt) {
        return mt * 10.5;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name="code")int code){
        return new Compte(code, Math.random()*10000, new Date());
}
    @WebMethod
    public List<Compte> listcomptes() {
        return List.of(
                new Compte(1, Math.random()*10000, new Date()),
                new Compte(2, Math.random()*10000, new Date()),
                new Compte(3, Math.random()*10000, new Date())
        );
    }

}
