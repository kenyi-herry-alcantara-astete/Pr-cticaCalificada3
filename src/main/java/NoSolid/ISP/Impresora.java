package NoSolid.ISP;

interface Impresora {
    void printDocument();
    default void sendFax(Fax typeFax){
        System.out.println("I am a default send :)");
    };
}
