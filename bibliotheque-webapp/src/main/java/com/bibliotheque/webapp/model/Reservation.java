package com.bibliotheque.webapp.model;

import io.swagger.client.model.Livre;
import io.swagger.client.model.Utilisateur;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

@Getter
@Setter
public class Reservation {
    private Long id;
    private DateTime dateDebut;
    private DateTime dateFin;
    private Livre livre;
    private Utilisateur utilisateur;
    private boolean renouvelable;
    private boolean rendu;
}
