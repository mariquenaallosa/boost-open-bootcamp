package removeassign.bad;

public class Main {

    double calculateDiscount(Order order, double totalPrice) {
        if (order == null || order.getPrice() == null) {   //programacion defensiva
            return totalPrice;
        }

        // fn impura -> modifica los valores que recibe
        if (order.getPrice() > 100) {
            totalPrice += order.getPrice() * order.getOffer(); // sobreescribe totalPrice
        }
        return totalPrice;
    }

}
