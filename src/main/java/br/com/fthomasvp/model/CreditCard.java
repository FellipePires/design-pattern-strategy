package br.com.fthomasvp.model;

import br.com.fthomasvp.interfaces.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreditCard implements Payment {

  private String name;
  private String cardNumber;

  @Override
  public void pay(Double value) {
    Double tax = 0.015;
    Double total = value + (value * tax);

    System.out.print("Name: " + this.name);
    System.out.print("\tCard Number: " + this.cardNumber);
    System.out.printf("\tTotal = %.2f \n", total);
  }

}
