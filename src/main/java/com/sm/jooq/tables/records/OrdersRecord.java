/*
 * This file is generated by jOOQ.
 */
package com.sm.jooq.tables.records;


import com.sm.jooq.tables.Orders;
import com.sm.jooq.tables.interfaces.IOrders;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrdersRecord extends UpdatableRecordImpl<OrdersRecord> implements Record3<Long, Long, String>, IOrders {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>product_management.orders.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>product_management.orders.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>product_management.orders.product_id</code>.
     */
    @Override
    public void setProductId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>product_management.orders.product_id</code>.
     */
    @Override
    public Long getProductId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>product_management.orders.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>product_management.orders.description</code>.
     */
    @Override
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Orders.ORDERS.ID;
    }

    @Override
    public Field<Long> field2() {
        return Orders.ORDERS.PRODUCT_ID;
    }

    @Override
    public Field<String> field3() {
        return Orders.ORDERS.DESCRIPTION;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getProductId();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getProductId();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public OrdersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public OrdersRecord value2(Long value) {
        setProductId(value);
        return this;
    }

    @Override
    public OrdersRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public OrdersRecord values(Long value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IOrders from) {
        setId(from.getId());
        setProductId(from.getProductId());
        setDescription(from.getDescription());
    }

    @Override
    public <E extends IOrders> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrdersRecord
     */
    public OrdersRecord() {
        super(Orders.ORDERS);
    }

    /**
     * Create a detached, initialised OrdersRecord
     */
    public OrdersRecord(Long id, Long productId, String description) {
        super(Orders.ORDERS);

        setId(id);
        setProductId(productId);
        setDescription(description);
    }
}