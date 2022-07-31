package telegrambot.telegrambot.dataBase;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


@Service
public record MenuRepository(EntityManager entityManager) {

    public MenuItem getByName(String name) {

        TypedQuery<MenuItem> query = entityManager.createQuery("SELECT mi FROM MenuItem mi WHERE mi.name=:name", MenuItem.class);
        query.setParameter("name", name);
        return query.getSingleResult();
    }
}
