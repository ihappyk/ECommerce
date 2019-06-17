package com.org.shopping.cart.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable
{
    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "unit_price")
    private Double unitPrice;

    public Product ()
    {
    }

    public Product (String name, String description, Integer quantity, Double unitPrice)
    {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public Long getId ()
    {
        return id;
    }

    public void setId (Long id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public Integer getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (Integer quantity)
    {
        this.quantity = quantity;
    }

    public Double getUnitPrice ()
    {
        return unitPrice;
    }

    public void setUnitPrice (Double unitPrice)
    {
        this.unitPrice = unitPrice;
    }
}
