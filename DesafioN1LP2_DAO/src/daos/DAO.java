/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;
import basis.Entidade;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author cliente
 */
public abstract class DAO <E extends Entidade>{
     protected Class<E> entityClass;

    public DAO(Class<E> entityClass){
        this.entityClass = entityClass;
    }
    
    public abstract E seleciona(int id);
    public abstract E localiza(String codigo) throws SQLException;
    public abstract ArrayList<E> lista() throws SQLException;
    public abstract boolean cadastra(int id);
    public abstract void deletar(String id) throws SQLException;
    protected E getInstanceOfE()
    {
        try
        {
            return entityClass.newInstance();
        }
        catch (IllegalAccessException | InstantiationException e)
        {
            // Oops, no default constructor
            throw new RuntimeException(e);
        }
    }
}
