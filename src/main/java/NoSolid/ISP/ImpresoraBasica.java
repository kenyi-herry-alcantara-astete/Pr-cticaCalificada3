package NoSolid.ISP;

class ImpresoraBasica implements Impresora {
    @Override
    public void printDocument() {
        System.out.println("La impresora basica imprime un documento.");
    }

   /*
    @Override
    public void sendFax(Fax typeFax) {
        Impresora.super.sendFax(typeFax);
        //throw new UnsupportedOperationException();
    }
    */

}
