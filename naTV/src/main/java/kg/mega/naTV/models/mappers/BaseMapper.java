package kg.mega.naTV.models.mappers;

import java.util.List;

public interface BaseMapper <E,D>{

    E toEntity (D d);
    D toDto (E e);

    List<E> toEntities(List<D> ds);
    List<D> toDtos(List<E> es);
}
