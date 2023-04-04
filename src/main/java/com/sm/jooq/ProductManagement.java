/*
 * This file is generated by jOOQ.
 */
package com.sm.jooq;


import com.sm.jooq.tables.Orders;
import com.sm.jooq.tables.Products;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductManagement extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>product_management</code>
     */
    public static final ProductManagement PRODUCT_MANAGEMENT = new ProductManagement();

    /**
     * The table <code>product_management.orders</code>.
     */
    public final Orders ORDERS = Orders.ORDERS;

    /**
     * The table <code>product_management.products</code>.
     */
    public final Products PRODUCTS = Products.PRODUCTS;

    /**
     * No further instances allowed
     */
    private ProductManagement() {
        super("product_management", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Orders.ORDERS,
            Products.PRODUCTS);
    }
}
