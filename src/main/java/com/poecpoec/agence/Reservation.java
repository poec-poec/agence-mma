package com.poecpoec.agence;
/**
 * 
 * @author Administrateur
 *
 */

public class Reservation {

        private boolean confirmation;
        
        public Reservation(boolean confirmation) {
            this.setConfirmation(confirmation);
        }

        public boolean isConfirmation() {
            return confirmation;
        }

        public void setConfirmation(boolean confirmation) {
            this.confirmation = confirmation;
        }
}
