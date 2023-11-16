package com.varun.BatchExample.config;

import com.varun.BatchExample.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {
    @Override
    public Product process(Product item) throws Exception {
        try {
//            put the percentage logic
            System.out.println(item.getDescription());
            int discountPer = Integer.parseInt(item.getDiscount().trim());
            double originalPrice = Double.parseDouble(item.getPrice().trim());
            double discount = (discountPer/100.0) * originalPrice;
            double finalPrice = originalPrice - discount;
            item.setDiscountedPrice(String.valueOf(finalPrice));
        } catch (
                NumberFormatException ex
        ) {
            ex.printStackTrace();
        }

        return item;
    }
}