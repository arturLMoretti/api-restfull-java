package dio.santanderbootcampjavaangular.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.santanderbootcampjavaangular.domain.model.User;
import dio.santanderbootcampjavaangular.domain.repository.UserRepository;
import dio.santanderbootcampjavaangular.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  public void UserRepositoryImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
  @Override
  public User findById(Long id) {
    return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
  }

  @Override
  public User create(User user) {
    if (userRepository.existsById(user.getId())) {
      throw new IllegalArgumentException("This user exists");
    }
    return userRepository.save(user);
  }
  
}
