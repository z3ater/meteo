package com.meteo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServerMeteo1 {

    @WebMethod
    public String getWeather(String city, String country) {
        if (city.equalsIgnoreCase("Alger") && country.equalsIgnoreCase("Algeria")) {
            return "الطقس في الجزائر: مشمس، 25°C";
        } else {
            return "لم يتم العثور على بيانات الطقس لهذه المدينة.";
        }
    }
}
