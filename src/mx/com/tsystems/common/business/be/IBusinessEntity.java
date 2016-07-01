/*
Autor:          Carlos Ernesto Guevara Aguilar.
F. Creación:    24 de Junio de 2016.
F. Cambio:      24 de Junio de 2016.
Comentarios:
                
*/
package mx.com.tsystems.common.business.be;

/**
 * Interfaz que agrupa las Entidades de Negocio.
 * @author caguevar
 */
public interface IBusinessEntity {
    
    // <editor-fold defaultstate="collapsed" desc="Métodos a ser implementados">
    
    /**
     * Operacion que valida la información almacenada por la entidad de negocio.
     * @return True si entidad de negocio válida, False de lo contrario.
     */
    boolean Validate ();
    
    // </editor-fold>
    
} // public interface IBusinessEntity {
