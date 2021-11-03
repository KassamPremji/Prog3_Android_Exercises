package org.premji.persist.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import org.premji.persist.modele.PersistPersonne;

import java.util.List;

@Dao
public interface PersistDAO
{
    @Insert
    Long insertPersonne(PersistPersonne personne);

    @Query("SELECT * FROM PersistPersonne")
    List<PersistPersonne> listPersonnes();
}
