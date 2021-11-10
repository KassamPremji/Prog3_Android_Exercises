package org.premji.persist.modele;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.premji.persist.Sexe;

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
    public Enum<Sexe> sexeEnum;
}
