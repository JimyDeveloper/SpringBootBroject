package org.mvc.spring.repos;

import org.mvc.spring.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * 01.11.2019
 *
 * @author Jimy
 * @project FirstMVCProject
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
