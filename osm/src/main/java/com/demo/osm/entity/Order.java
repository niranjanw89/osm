package com.demo.osm.entity;


import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "VERSION")
    private int version;

    @Column(name = "EVENT_ID")
    private String eventId;

    @Column(name = "TIME")
    private Date time;

    @Column(name = "QUEUE_ID")
    private String queueId;

    @Column(name = "ORDER_STATUS")
    private String orderStatus;

    @Column(name = "ENTITY_SCHEMA")
    private String entitySchema;

    @Column(name = "ORDER_CLOB_DATA")
    private String orderClobData;

    @Column(name = "TRADE_DATE")
    private Date tradeDate;

    public Order(){

    }

    public Order(String orderId, int version, String eventId, Date time, String queueId, String orderStatus, String entitySchema, String orderClobData, Date tradeDate) {
        this.orderId = orderId;
        this.version = version;
        this.eventId = eventId;
        this.time = time;
        this.queueId = queueId;
        this.orderStatus = orderStatus;
        this.entitySchema = entitySchema;
        this.orderClobData = orderClobData;
        this.tradeDate = tradeDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getEntitySchema() {
        return entitySchema;
    }

    public void setEntitySchema(String entitySchema) {
        this.entitySchema = entitySchema;
    }

    public String getOrderClobData() {
        return orderClobData;
    }

    public void setOrderClobData(String orderClobData) {
        this.orderClobData = orderClobData;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
}
