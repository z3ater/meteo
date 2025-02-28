package com.client;

import com.meteo.ServerMeteo1Service;
import com.meteo.ServerMeteo1;

public class MeteoClient {
    public static void main(String[] args) {
        try {
            // إنشاء كائن خدمة SOAP
            ServerMeteo1Service service = new ServerMeteo1Service();
            ServerMeteo1 port = service.getServerMeteo1Port();

            // استدعاء الخدمة للحصول على بيانات الطقس
            String ville = "Alger";
            String pays = "Algeria";
            String response = port.getWeather(ville, pays);

            // طباعة النتيجة
            System.out.println("Météo pour " + ville + ", " + pays + ": " + response);
        } catch (Exception e) {
            System.err.println("Erreur lors de l'appel du service météo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
