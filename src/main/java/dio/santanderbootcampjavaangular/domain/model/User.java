package dio.santanderbootcampjavaangular.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "bank_users")
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_account", referencedColumnName = "id")
  private Account account;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_card", referencedColumnName = "id")
  private Card card;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "user_features", referencedColumnName = "id")
  private List<Feature> features;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "user_news", referencedColumnName = "id")
  private List<News> news;

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Account getAccount() {
    return account;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public Card getCard() {
    return card;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public List<Feature> getFeatures() {
    return features;
  }

  public void setNews(List<News> news) {
    this.news = news;
  }

  public List<News> getNews() {
    return news;
  }
}
