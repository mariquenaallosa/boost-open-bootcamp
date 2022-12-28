package removeassign.good;

import removeassign.bad.Order;

public class Main {

    double calculateDiscount(Order order, double totalPrice) {
        double resultPrice = totalPrice;

        if (order == null || order.getPrice() == null) {   // programacion defensiva
            return resultPrice;
        }

        if (order.getPrice() > 100) {
            resultPrice += order.getPrice() * order.getOffer();
        }

        return resultPrice;
    }

}
