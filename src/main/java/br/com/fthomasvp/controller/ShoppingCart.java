package br.com.fthomasvp.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.fthomasvp.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

  private Payment paymentStrategy;
  private List<Movie> movieList = new ArrayList<Movie>();

  public Boolean addMovie(Movie movie) {
    if (movie == null)
      return false;

    this.movieList.add(movie);

    return true;
  }

  public Boolean removeMovie(Movie movie) {
    if (movie == null)
      return false;

    this.movieList.remove(movie);

    return true;
  }

  private Double _calculateSubTotal() {
    Double subTotal = 0.0;
    for (Movie movie : this.movieList) {
      subTotal += movie.getPrice();
    }

    return subTotal;
  }

  public void pay(Payment paymentStrategy) {
    paymentStrategy.pay(this._calculateSubTotal());
  }

}
