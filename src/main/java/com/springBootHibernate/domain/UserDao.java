package com.springBootHibernate.domain;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by fionalyn.ping.fu on 2/22/2017.
 */

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param email the user email.
     */
    User findByEmail(String email);

    User findById(long id);

    @Modifying(clearAutomatically = true)
    @Query("update User as U set U.email = :email where U.id = :id")
    @Transactional
    void emFactoryUpdate(@Param("email") String email, @Param("id") long id);



}