package org.premji.persist.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class PersistPersonne
{
    @PrimaryKey
    public long id;

    @ColumnInfo
    public String nom;

    @ColumnInfo
    public Date dateNaissance;

    @ColumnInfo
    public enum sexe {
        Homme,
        Femme,
        Complexe
    }
}
