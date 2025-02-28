package com.meteo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerMeteo1 {

    @WebMethod
    public String getWeather(String city, String country) {
        if (city.equalsIgnoreCase("Alger") && country.equalsIgnoreCase("Algeria")) {
            return "36";
        } else {
            return "not found";
        }
    }
}
