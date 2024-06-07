package ar.com.turnos.iservice;


import ar.com.turnos.entities.TiposDoc;

import java.util.List;

public interface ITiposDocService {
        List<TiposDoc> getAll();
        List<TiposDoc> findByDescrip(String descrip);
        TiposDoc get(Integer id);
        void save(TiposDoc entity);
        String delete(TiposDoc entity);

}
