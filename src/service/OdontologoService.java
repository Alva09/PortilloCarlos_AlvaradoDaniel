// service/OdontologoService.java
package service;

import dao.OdontologoDAO;
import dao.impl.OdontologoDAOCollectionImpl;
import dao.impl.OdontologoDAOH2;
import dao.IDao;
import model.Odontologo;

public class OdontologoService {
    private OdontologoDAOH2 odontologoDAOH2;
    private OdontologoDAO odontologoDAOCollectionImpl;
    private IDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoDAOH2 = new OdontologoDAOH2();
        odontologoDAOCollectionImpl= new OdontologoDAOCollectionImpl();
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoDAOH2.guardar(odontologo);
    }
    public Odontologo buscarOdontologos(){
        return (Odontologo) odontologoDAOH2.buscarTodos();
    }
}
