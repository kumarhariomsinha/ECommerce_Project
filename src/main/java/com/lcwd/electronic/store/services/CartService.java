package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.AddItemToCartRequest;
import com.lcwd.electronic.store.dtos.CartDto;
import com.lcwd.electronic.store.entities.CartItem;

public interface CartService {

    //add items to cart

    //case1: cart for user not available : we will create cart and then add
    //case2: cart available add the items to cart

    CartDto addItemToCart(String userId, AddItemToCartRequest request);

    void removeItemFromCart(String userId,int  cartItem);
    //remove all items from cart
    void clearCart(String userId);
    CartDto getCartByUser(String userId);
}
