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
public class PayPal implements Payment {

  private String email;
  private String password;

  @Override
  public void pay(Double value) {
    Double total = value;

    System.out.print("Email: " + this.email);
    System.out.printf("\tTotal = %.2f \n", total);
  }

}
