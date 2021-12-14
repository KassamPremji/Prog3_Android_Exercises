package org.sabourin.formatif_tests;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    /* -------------- ÉCRIRE VOS TESTS ICI -------------*/


    public ServiceImplementation service;

    @Test
    public void exemple(){
        assertTrue(true);
    }

    @Test
    public void ajoutEvalutationOKService()
    {
        try
        {
            Evaluation evaluation = new Evaluation("Kanye",1, 2);
            service.ajouterEvaluation(evaluation);
        }
        catch (EvaluationException e)
        {

        }
    }

    @Test
    public void evaluationExceptionNomPasUnique()
    {
        try
        {
            Evaluation evaluation1 = new Evaluation("oui",10, 22);
            service.ajouterEvaluation(evaluation1);
        }
        catch (EvaluationException e)
        {

        }

        try
        {
            Evaluation evaluation2 = new Evaluation("oui",11, 21);
            service.ajouterEvaluation(evaluation2);
        }
        catch (EvaluationException e)
        {

        }
    }

}