/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.movies.model;

import edu.eci.arsw.movies.services.MicroserviceMoviesException;

/**
 *
 * @author 2104784
 */
public interface HttpConnection {
    /**
     * Obtiene los datos de una pelicula desde un api externo.
     * @param movie la pelicula a consultar
     * @param year el año
     * @return String que representa el JSON de los datos de la pelicula.
     * @throws MicroserviceMoviesException 
     */
    public String getMovie(String movie, String year) throws MicroserviceMoviesException;
}
