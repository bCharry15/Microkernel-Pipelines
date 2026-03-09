package co.unicauca.microkernel.plugins.argentina;

import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;
/*
 * Plugin para envios a Argentina
 * @author Brayan
 */
public class ArgentinaDeliveryPlugin implements IDeliveryPlugin {

    @Override
    public double calculateCost(Delivery delivery) {

        Product product = delivery.getProduct();

        double cost;

        if (product.getWeight() <= 2) {

            cost = 6;

        } else {
            
            cost = 6 + (product.getWeight() - 2) * 0.6;

        }

        return cost;
    }
}