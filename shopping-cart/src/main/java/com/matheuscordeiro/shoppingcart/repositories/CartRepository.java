package com.matheuscordeiro.shoppingcart.repositories;

import com.matheuscordeiro.shoppingcart.models.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository <Cart, Integer>{
    Cart findByCustomerId(Integer customerId);
}