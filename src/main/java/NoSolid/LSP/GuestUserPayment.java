package NoSolid.LSP;
class GuestUserPayment implements Payment {
    String name;

    public GuestUserPayment() {
        this.name = "guest";
    }
    @Override
    public void previousPaymentInfo(){
        //Se pasa una exepción no operación no soportada (inválida).
        throw new UnsupportedOperationException();
    }
    @Override
    public void newPayment(){
        System.out.println("Procesando de "+name+ "pago actual request.");
    }

    @Override
    public String getType() {
        return "guest";
    }
}
