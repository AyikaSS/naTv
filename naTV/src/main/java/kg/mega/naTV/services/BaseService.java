package kg.mega.naTV.services;

import java.util.List;

public interface BaseService <E>{

    E save (E e);
    E findById(Long id, int language);
    List<E> findAll();
}
