package com.sm.repo;

import com.sm.jooq.tables.pojos.Orders;
import com.sm.jooq.tables.pojos.Products;
import com.sm.jooq.tables.records.ProductsRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.sm.jooq.Tables.ORDERS;
import static com.sm.jooq.Tables.PRODUCTS;


@Repository
@RequiredArgsConstructor
public class ProductRepository {

    private final DSLContext dslContext;
//
//    public List<Product> findAll() {
//        return dslContext.selectFrom(PRODUCT).fetchInto(Product.class);
//    }
//
//    public Product findById(Long id) {
//        return dslContext.selectFrom(PRODUCT).where(PRODUCT.ID.eq(id)).fetchOneInto(Product.class);
//    }
//
//    public Product create(Product product) {
//        ProductRecord record = dslContext.newRecord(PRODUCT, product);
//        record.store();
//        return record.into(Product.class);
//    }
//
//    public Product update(Long id, Product product) {
//        ProductRecord record = dslContext.newRecord(PRODUCT, product);
//        record.setId(id);
//        record.update();
//        return record.into(Product.class);
//    }
//
//    public void delete(Long id) {
//        dslContext.deleteFrom(PRODUCT).where(PRODUCT.ID.eq(id)).execute();
//    }
//
//    public int count() {
//        return dslContext.fetchCount(PRODUCT);
//    }
//


//    public List<Products> getProductWithOrdersEagerly() {
//        Result<Record> records = dslContext.select().from(PRODUCTS).leftJoin(ORDERS).on(ORDERS.PRODUCT_ID.eq(PRODUCTS.ID)).orderBy(PRODUCTS.ID).fetch();
//
//        // record object will convert to pojo
//        Map<Products, List<Orders>> map = records.intoGroups(r -> r.into(PRODUCTS).into(Products.class), r -> r.into(ORDERS).into(Orders.class));
//
//        List<Products> users = new ArrayList<>();
//        for (Map.Entry<Products, List<Orders>> entry : map.entrySet()) {
//            Products product = entry.getKey();
//            List<Orders> orders = entry.getValue();
//            //product.setOrders(orders);
//            users.add(product);
//        }
//
//        return users;
//    }

//    public List<User> getUsersWithOrdersLazily() {
//        Result<Record> records = dsl.selectFrom(USERS)
//                .orderBy(USERS.ID)
//                .fetch();
//
//        Map<Long, User> userMap = new HashMap<>();
//        for (Record record : records) {
//            Long userId = record.get(USERS.ID);
//            User user = record.into(USERS).into(User.class);
//            userMap.put(userId, user);
//        }
//
//        Result<Record> orderRecords = dsl.selectFrom(ORDERS)
//                .where(ORDERS.USER_ID.in(userMap.keySet()))
//                .orderBy(ORDERS.ID)
//                .fetch();
//
//        for (Record record : orderRecords) {
//            Long userId = record.get(ORDERS.USER_ID);
//            Order order = record.into(ORDERS).into(Order.class);
//            userMap.get(userId).getOrders().add(order);
//        }
//
//        return new ArrayList<>(userMap.values());
//    }

}
