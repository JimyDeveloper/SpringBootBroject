package org.mvc.spring.repos;

import org.mvc.spring.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 01.11.2019
 *
 * @author Jimy
 * @project FirstMVCProject
 */
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByActivationCode(String code);
}
