package extractvarible.good;

import extractvarible.bad.Order;

public class Main {

    void printProductPrice(Order order) {
        //calcular precio total

        //1. precio de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        //2. descuento
        Double offerPrice = order.getPrice() * order.getOffer();

        //3. calcular precio de productos con descuento incluido
        Double productPrice = quantityPrice - offerPrice;

        //4. envio
        Double shippingCost = 0.0;
        if (productPrice < 50) {
            shippingCost = 2.99;
        }

        // 5. costo total
        Double totalPrice = productPrice + shippingCost;

        System.out.println(totalPrice);
    }

}
