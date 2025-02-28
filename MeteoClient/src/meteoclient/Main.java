/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meteoclient;

import com.meteo.ServerMeteo1Service;
import com.meteo.ServerMeteo1;
/**
 *
 * @author amar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
   
            ServerMeteo1Service service = new ServerMeteo1Service();
            ServerMeteo1 port = service.getServerMeteo1Port();

          
            String ville = "Alger";
            String pays = "Algeria";
            String response = port.getWeather(ville, pays);

   
            System.out.println("Météo pour " + ville + ", " + pays + ": " + response);
        } catch (Exception e) {
            System.err.println("Erreur lors de l'appel du service météo: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
