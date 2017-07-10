/**
 * 
 */
package com.poecpoec.agence.interfaces;

import java.util.List;

import com.poecpoec.agence.model.Client;

/**
 * @author Seme
 *
 */
public interface IClientDataRecovery {
    /**
     * 
     * @return
     */
    public abstract List<Client> findAll();
}
