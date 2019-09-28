package br.com.fthomasvp.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.fthomasvp.model.Movie;

public class ShoppingCartTest {

  @Test
  public void givenMovieWhenAddMovieThenCreateMovieTrue() {
    ShoppingCart shoppingCart = new ShoppingCart();

    Movie movie = new Movie(
      "Movie Test",
      "2019-04-09",
      1230.00,
      4.93
    );

    assertEquals("Movie object is null", true, shoppingCart.addMovie(movie));
  }

  @Test
  public void givenMovieWhenRemoveMovieThenDeleteMovieTrue() {
    ShoppingCart shoppingCart = new ShoppingCart();

    Movie movie = new Movie(
      "Movie Test",
      "2019-04-09",
      1230.00,
      4.93
    );

    assertEquals("Movie object is null", true, shoppingCart.removeMovie(movie));
  }

}
