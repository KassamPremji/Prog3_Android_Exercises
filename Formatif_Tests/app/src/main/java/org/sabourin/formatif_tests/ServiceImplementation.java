package org.sabourin.formatif_tests;

import java.util.ArrayList;
import java.util.List;

public class ServiceImplementation {

    private List<Evaluation> evaluations = new ArrayList<Evaluation>();



    /* --------------
    MODIFIEZ UNIQUEMENT LES TESTS, PAS LE CODE
    -------------*/
    public void ajouterEvaluation(Evaluation v) throws EvaluationException {

        // nom
        if (v.nom == null) throw new EvaluationException();
        for (Evaluation e : evaluations) {
            if (v.nom.equals(e.nom)) throw new EvaluationException();
        }

        // note
        if (v.noteMax <= 0 || v.noteMax > 255) throw new EvaluationException();

        // poids
        if (v.poids > 100) throw new EvaluationException();

        // on ajoute, tout est ok
        evaluations.add(v);
    }
}
