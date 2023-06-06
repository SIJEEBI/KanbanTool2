package com.projectkanban.kanbantool.KanbanTool2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projectkanban.kanbantool.KanbanTool2.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	User findByUsername(String username);//query for retrving user entity by its username
	User getById(Long id);//query method for reriving user entity by its id
	
	
}
