package org.vital.telegrambot.dataBase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class OrderRepository {

    @Autowired
    private EntityManager entityManager;

}
