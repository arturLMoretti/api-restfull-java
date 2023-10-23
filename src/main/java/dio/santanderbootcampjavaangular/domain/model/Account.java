package dio.santanderbootcampjavaangular.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user_account")
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  
  @Column(unique = true)
  private String number;

  @Column(name = "account_limit",precision = 13, scale = 2)
  private BigDecimal balance;
  private BigDecimal limit;

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public BigDecimal getLimit() {
    return limit;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getNumber() {
    return number;
  }
}
