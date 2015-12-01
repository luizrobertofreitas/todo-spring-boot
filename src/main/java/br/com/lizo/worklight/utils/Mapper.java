
package br.com.lizo.worklight.utils;

import java.io.Serializable;
import java.util.List;

/**
 * Mapper interface.
 * 
 * @author Luiz Jr.
 * @param <T>
 * @param <Req>
 * @param <Res>
 */
public interface Mapper<T extends Serializable, Req, Res> {
    
    Res mapsTToRes(final T t);
    
    List<Res> mapsListOfTToListOfRes(final List<T> ts);
    
    T mapsReqToT(final Req req);
}
