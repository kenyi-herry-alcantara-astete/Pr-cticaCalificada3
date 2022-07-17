package NoSolid.ISP;

// import java.util.ArrayList;
// import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Cliente {
    public static void main(String[] args) {

        List<Impresora> impresoras = new ArrayList<Impresora>();
        impresoras.add(new ImpresoraAvanzada());
        impresoras.add(new ImpresoraBasica());

        Fax lanfax = new LanFax();
        Fax efax = new EFax();

        //Utilizando expreciones lamda
        impresoras.forEach((dispositivo)->{
            dispositivo.printDocument();
            dispositivo.sendFax(lanfax);
            dispositivo.sendFax(efax);
        });
    }
}

 /*
        System.out.println("Demostracion sin ISP");
        Impresora impresora = new ImpresoraAvanzada();
        impresora.printDocument();
        impresora.sendFax();

        impresora = new ImpresoraBasica();
        impresora.printDocument();
        impresora.sendFax();// Lanza un error
*/
