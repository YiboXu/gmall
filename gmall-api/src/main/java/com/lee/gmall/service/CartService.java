package com.lee.gmall.service;

import com.lee.gmall.bean.CartInfo;

import java.util.List;

public interface CartService {
    CartInfo ifCartExist(CartInfo cartInfo);

    void updateCart(CartInfo cartInfoDb);

    void insertCart(CartInfo cartInfo);

    void syncCache(String userId);

    List<CartInfo> getCartCache(String userId);

    void updateCartChecked(CartInfo cartInfo);
}