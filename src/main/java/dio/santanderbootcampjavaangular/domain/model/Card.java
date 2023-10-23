package dio.santanderbootcampjavaangular.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user_card")
public class Card {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;

  @Column(unique = true)
  private String number;

  @Column(name="card_limit", scale = 13, precision = 2)
  private BigDecimal limit;
}
