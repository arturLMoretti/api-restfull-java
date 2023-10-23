package dio.santanderbootcampjavaangular.domain.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user_news")
public class News {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String description;
  private Date date;

  public void setId(String id) {
    this.id = id;
  }

  public String getId() {
    return id;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Date getDate() {
    return date;
  }
}
