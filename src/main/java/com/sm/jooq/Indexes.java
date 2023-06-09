/*
 * This file is generated by jOOQ.
 */
package com.sm.jooq;


import com.sm.jooq.tables.Orders;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in product_management.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ORDERS_PRODUCT_ID = Internal.createIndex(DSL.name("product_id"), Orders.ORDERS, new OrderField[] { Orders.ORDERS.PRODUCT_ID }, false);
}
