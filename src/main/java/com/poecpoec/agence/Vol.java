/**
 * 
 */
package com.poecpoec.agence;

/**
 * @author Administrateur
 *
 */
public class Vol {
    // Si le vol est fermé ou ouvert aux réservations.
    private boolean etat;

    /**
     * Constructeur par défaut initialisation de l'état à true pour ouvrir le
     * vol à la réservation.
     */
    public Vol() {
        this.etat = true;
    }

    /**
     * 
     * Constructeur prenant en parametre l'état de l'ouverture à la réservation.
     * 
     * @param etatVol
     */
    public Vol(boolean etatVol) {
        this.etat = etatVol;
    }

    /**
     * retourne un boolean informant si le vol est ouvert à la réservation.
     * 
     * @return
     */
    public boolean isEtat() {
        return etat;
    }

    /**
     * définit par le booleen passé en paramètre si le vol est ouvert à la
     * réservation.
     * 
     * @param etat
     */
    public void setEtat(boolean etat) {
        this.etat = etat;
    }

}
