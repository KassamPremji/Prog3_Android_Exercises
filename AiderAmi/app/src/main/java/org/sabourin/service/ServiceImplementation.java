package org.sabourin.service;

import org.sabourin.bd.BD;
import org.sabourin.modele.Personne;

public class ServiceImplementation{

    private static ServiceImplementation single_instance = null;
    private BD maBD;

    private ServiceImplementation (BD maBD){
        this.maBD = maBD;
    }

    public static ServiceImplementation getInstance(BD maBD)
    {
        if (single_instance == null)
            single_instance = new ServiceImplementation(maBD);

        return single_instance;
    }


    public void ajouterPersonne(Personne personne) {
        // Ajout
        maBD.monDao().insertPersonne(personne);
    }

    public boolean isValidZipCode(String zippy)
    {
        int nombreEspace = 0;
        int nombreDeNombre = 0;
        String[] partieEspace = zippy.split(" ");
        String[] partieTrait = zippy.split("-");
        String test = zippy.replaceAll("[0-9]", "!");

        for (char c : zippy.toCharArray())
        {
            if (c == ' ')
            {
                nombreEspace++;
            }
        }

        for (char c : test.toCharArray())
        {
            if (c == '!')
            {
                nombreDeNombre++;
            }
        }

        if (nombreEspace > 2 || (partieEspace.length == 1 && zippy.length() != 6) || nombreDeNombre != 3)
        {
            return false;
        }
        return true;
    }
}
