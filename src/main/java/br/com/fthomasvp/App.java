package br.com.fthomasvp;

import br.com.fthomasvp.controller.ShoppingCart;
import br.com.fthomasvp.model.CreditCard;
import br.com.fthomasvp.model.Movie;
import br.com.fthomasvp.model.PayPal;

public class App {
  public static void main(String[] args) {

    Movie avatar = new Movie(
      "Avatar",
      "2009-12-17",
      425000000.00,
      3.95
    );

    Movie johnCarter = new Movie(
      "John Carter",
      "2012-03-07",
      275000000.00,
      6.23
    );

    ShoppingCart shoppingCart = new ShoppingCart();

    shoppingCart.addMovie(avatar);
    shoppingCart.addMovie(johnCarter);

    shoppingCart.pay(new PayPal(
      "fellipecab@gmail.com",
      "01020304"
    ));

    System.out.println("----------------");

    shoppingCart.pay(new CreditCard(
      "Fellipe Thomas",
      "3457928301922289"
    ));

  }
}
