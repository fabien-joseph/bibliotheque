package com.bibliotheque.api.consumer;

import com.bibliotheque.api.model.Livre;
import com.bibliotheque.api.model.Reservation;
import com.bibliotheque.api.model.Utilisateur;
import org.joda.time.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query("SELECT r \n" +
            "FROM Reservation r \n" +
            "WHERE (:livre IS NULL OR r.livre = :livre) \n" +
            "AND (:utilisateur IS NULL OR r.utilisateur = :utilisateur )" +
            " \n" +
            "AND r.dateDebut <= :date" +
    " AND r.rendu = false ")
    List<Reservation> findActualReservationsWithLivre(@Param("livre") Livre livre, @Param("utilisateur") Utilisateur utilisateur, @Param("date") DateTime date);
}
