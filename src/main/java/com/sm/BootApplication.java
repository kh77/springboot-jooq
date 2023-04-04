package com.sm;

//import com.sm.jooq.tables.pojos.Product;

import com.sm.jooq.tables.daos.OrdersDao;
import com.sm.jooq.tables.daos.ProductsDao;
import com.sm.jooq.tables.pojos.Orders;
import com.sm.jooq.tables.pojos.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
@RequiredArgsConstructor
public class BootApplication implements CommandLineRunner {

    private final ProductsDao productsDao;
    private final OrdersDao ordersDao;

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (productsDao.count() == 0) {
            for (int i = 1; i < 100; i++) {
                productsDao.insert(new Products(null, "grocery", getAlphaNumericString(5), BigDecimal.TEN));
                ordersDao.insert(new Orders(null, (long)i, "order description " + i));
            }

        }
    }

    static String getAlphaNumericString(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }
}
