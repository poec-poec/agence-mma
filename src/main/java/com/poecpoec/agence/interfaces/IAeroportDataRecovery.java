/**
 * 
 */
package com.poecpoec.agence.interfaces;

import java.util.List;

import com.poecpoec.agence.model.Aeroport;

/**
 * @author Seme
 *
 */
public interface IAeroportDataRecovery
{
    /**
     * 
     * @return
     */
    public abstract List<Aeroport> findAll();        
}
