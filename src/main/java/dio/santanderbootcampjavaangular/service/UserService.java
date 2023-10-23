package dio.santanderbootcampjavaangular.service;

import dio.santanderbootcampjavaangular.domain.model.User;

public interface UserService {
  User findById (Long id);

  User create(User user);
}
