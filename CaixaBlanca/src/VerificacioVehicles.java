import java.util.Date;

import javax.swing.text.View;

import java.util.ArrayList;

public class VerificacioVehicles {
  public static void main(String[] args) {
    // Creem un array amb els vehicles a verificar
    // L'algorisme ha de tenir un Array[] d'entrada amb tots els vehicles que s'han
    // de verificar.
    // Aquests vehicles tindran una matrícula, una data de matriculació i tipus de
    // carburant GASOLINA | GASOIL.

    // Array de vehicles
    Object[][] vehicles = {
        // , Name, Phone
        { "1234ABC", "2020-01-01", "GASOLINA" },
        { "1234ABC", "2002-5-15", "DIESEL" },
        { "1234ABC", "2018-8-30", "DIESEL" },
        { "1234ABC", "2009-11-01", "GASOLINA" },
        { "1234ABC", "2007-2-15", "GASOLINA" },
        { "1234ABC", "2004-5-30", "DIESEL" }

    };

    int cont2010= 0;
    // Creem una llista per emmagatzemar els vehicles retirats
    int retirats = 1;
    Object[][] vehiclesRetirats = new Object[retirats][3];
    
    for (int i = 0; i < vehicles.length; i++) {
      
      // Obtenim la data de matriculació del vehicle
      String dataMatriculacio = (String) vehicles[i][1];
      // Obtenim els primers 4 caràcters de la data de matriculació
      String anyMatriculacio = dataMatriculacio.substring(0, 4);
      // Convertim els primers 4 caràcters de la data de matriculació a un enter
      int anyMatriculacioInt = Integer.parseInt(anyMatriculacio);
      // Comprovem anterior del 2010
      if (anyMatriculacioInt < 2010) {
        cont2010=cont2010+1;
        // Comprovem anterior i si es de diesel
        if (vehicles[i][2] == "DIESEL"){
          // Si es del 2010 o anterior i es de diesel, el guardem a la llista de
          // vehicles retirats
          for (int j = 0; j < vehiclesRetirats.length; j++) {
            retirats++;
            vehiclesRetirats[j][0] = vehicles[i][0];
            vehiclesRetirats[j][1] = vehicles[i][1];
            vehiclesRetirats[j][2] = vehicles[i][2];
            System.out.println(
            "Vehicle retirat: " + vehiclesRetirats[j][0] + " " + vehiclesRetirats[j][1] + " " + vehiclesRetirats[j][2]);
          }
        }

      }
    }
  }
}
