package com.lcwd.electronic.store.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    private String cartId;
    private Date createdAt;

    @OneToOne
    private User user;
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<CartItem> items=new ArrayList<>();

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Cart cart;
}
