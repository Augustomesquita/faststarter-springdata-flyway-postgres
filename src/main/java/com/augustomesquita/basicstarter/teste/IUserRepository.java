/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.augustomesquita.basicstarter.teste;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author augusto
 */
public interface IUserRepository extends CrudRepository<JUser, Long> {
    List<JUser> findByName(String name);
}
