package com.company.untitled2.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "UNTITLED2_PRODUCT")
@Entity(name = "untitled2_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -939951943138486508L;

    @Column(name = "PRODUCTID", unique = true)
    private Integer productId;

    @Column(name = "PRODUCT_COMPANY")
    private String productCompany;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Column(name = "PRODUCTNAME")
    private String productName;


    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }
}