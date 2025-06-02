package model;

import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellResponse;
import model.excepcions.Excepcions;
import vista.Vista;

public class Model {

    String script = "New-ADUser -SamAccountName slopez";

    public static void executarComanda(PowerShell powerShell, String comanda) {
        try {
            PowerShellResponse response = powerShell.executeCommand(comanda);

            String missatge = response.getCommandOutput().trim();
            // TODO: Verficar que es mejor para lanzar la siguiente excepcion...
            if (missatge.contains("CommandNotFoundException")) throw new Excepcions.CommandNotFoundException(missatge);

            Vista.mostraComanda(missatge);
        } catch (Excepcions.CommandNotFoundException e) {
            System.out.println("Comanda no trobada. ");
        }

    }
}

// public class creaUsuaris(String samAcoountName, String nombre, String apellido) {
//     String.format("New-ADUser -SamAccountName %s -Name \"%s %s\"", samAccountName, nombre, apellido);
// }

