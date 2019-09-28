package br.com.fthomasvp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

  private String title;
  private String releaseDate;
  private Double budgetProduction;
  private Double price;

}
