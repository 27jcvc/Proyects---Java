import com.profesorfalken.jpowershell.PowerShell;
import com.profesorfalken.jpowershell.PowerShellNotAvailableException;
import model.Model;
import vista.Vista;

import java.util.Scanner;


public class Controlador {
    public static void main(String[] args) throws PowerShellNotAvailableException {


        PowerShell powershell = PowerShell.openSession();

        try {
            Scanner scan = new Scanner(System.in);
            String intrSel;
            do {

                Vista.mostrarMenuPrincipal();
                intrSel = scan.nextLine();
                switch (intrSel) {
                    case "1":
                        String comanda1 = "Get-LocalUser";
                        Model.executarComanda(powershell, comanda1);
                        break;
                    case "2":
                        String comanda2 = "Get-ADUser -Filter *";
                        Model.executarComanda(powershell, comanda2);
                        break;
                    case "3":
                        String comanda3 = "Get-Date";
                        Model.executarComanda(powershell, comanda3);
                        break;
                    default:
                        System.out.print(intrSel.equals("0") ? "...\nTancant programa" : "Entrada incorrecte\n");
                }
            } while (!intrSel.equals("0"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (powershell != null) powershell.close();
        }

    }

}