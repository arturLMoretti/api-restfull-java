package dio.santanderbootcampjavaangular.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "user_features")
public class Feature {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String description;
  private String name;

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

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
