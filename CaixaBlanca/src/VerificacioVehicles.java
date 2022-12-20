import java.util.Date;
import java.util.ArrayList;

public class VerificacioVehicles {
  public static void main(String[] args) {
    // Creem un array amb els vehicles a verificar
    // L'algorisme ha de tenir un Array[] d'entrada amb tots els vehicles que s'han de verificar. Aquests vehicles tindran una matrícula, una data de matriculació i tipus de carburant GASOLINA | GASOIL.
    String [][]  Vehicle = 
    Vehicle[] vehicles = {
      new Vehicle("1234ABC", new Date(2020, 1, 1), "GASOLINA"),
      new Vehicle("5678DEF", new Date(2019, 5, 15), "DIESEL"),
      new Vehicle("9101GHI", new Date(2018, 8, 30), "GASOLINA"),
      new Vehicle("2345JKL", new Date(2009, 11, 1), "DIESEL"),
      new Vehicle("6789MNO", new Date(2007, 2, 15), "GASOLINA"),
      new Vehicle("9012PQR", new Date(2004, 5, 30), "DIESEL")
    };

    // Creem una llista per emmagatzemar els vehicles retirats
    ArrayList<Vehicle> vehiclesRetirats = new ArrayList<>();
    int count = 0;
    // Recorrem l'array de vehicles

    for (Vehicle v : vehicles) {
      // Verifiquem si el vehicle va ser matriculat abans de 2010
      if (v.getDataMatriculacio().before(new Date(2010, 0, 1)){
        // Contador qeu conta si el vehicle es matriculat avans del 2010
        count++;
      }
      // Verifiquem si el vehicle va ser matriculat abans de 2010 i funciona amb diesel
      if (v.getDataMatriculacio().before(new Date(2010, 0, 1)) && v.getTipusCarburant().equals("DIESEL")) {
        // Si és així, afegim el vehicle a la llista de vehicles retirats
        vehiclesRetirats.add(v);
      }
    }

    // Mostrem la llista de vehicles retirats
    System.out.println("Vehicles retirats:");
    for (Vehicle v : vehiclesRetirats) {
      System.out.println("- Matrícula: " + v.getMatricula() + ", Data de matriculació: " + v.getDataMatriculacio() + ", Tipus de carburant: " + v.getTipusCarburant());
    }
  }
}

class Vehicle {
  private String matricula;
  private Date dataMatriculacio;
  private String tipusCarburant;

  public Vehicle(String matricula, Date dataMatriculacio, String tipusCarburant) {
    this.matricula = matricula;
    this.dataMatriculacio = dataMatriculacio;
    this.tipusCarburant = tipusCarburant;
  }

  public String getMatricula() {
    return matricula;
  }

  public Date getDataMatriculacio() {
    return dataMatriculacio;
  }

  public String getTipusCarburant() {
    return tipusCarburant;
  }
}

