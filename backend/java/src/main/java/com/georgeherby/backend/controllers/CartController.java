package com.georgeherby.backend.controllers;

import com.georgeherby.backend.models.ItemsResponse;
import com.georgeherby.backend.models.Product;
import com.georgeherby.backend.services.CartService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

  final CartService cartService;

  public CartController(CartService cartService) {
    this.cartService = cartService;
  }

  @GetMapping(path = "/items", produces = "application/json")
  public ResponseEntity<ItemsResponse> getShopItems() {
    return ResponseEntity.ok(
        new ItemsResponse(List.of(
            new Product("Apple", 60),
            new Product("Orange", 25)
        ))
    );
  }

  @PostMapping("/add")
  public double addItemsToShoppingCart(@RequestBody String[] items) {
    throw new RuntimeException("Not implemented");
  }

  @GetMapping("/total")
  public double getTotalPrice() {
    throw new RuntimeException("Not implemented");
  }

  @PostMapping("/remove")
  public double removeItemFromShoppingCart(@RequestBody String[] items) {
    throw new RuntimeException("Not implemented");
  }
}
