package NoSolid.LSP;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {
    List<Payment> payments = new ArrayList<Payment>();

    public void addUser(Payment user){
        payments.add(user);
    }
    public void showPreviousPayments() {
        for (Payment payment: payments) {
            //Verificamos si esta registrado para mostrar los detalles de su pagos anteriores
            if (payment.getType().equals("registered")){
                payment.previousPaymentInfo();
                System.out.println("------");
            }
        }
    }
    public void processNewPayments()  {
        for (Payment payment: payments) {
            payment.newPayment();
            System.out.println("------");
        }
    }
}
