package com.capitalone.inventory.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "inventory")
public class InventoryItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;
    @Column(name = "product_code", nullable = false, unique = true)
    @Getter
    @Setter
    private String productCode;
    @Column(name = "quantity")
    @Getter
    @Setter
    private Integer availableQuantity = 0;
}
