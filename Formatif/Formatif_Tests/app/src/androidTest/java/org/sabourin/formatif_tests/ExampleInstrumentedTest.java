package org.sabourin.formatif_tests;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


    /* -------------- ÉCRIRE VOS TESTS ICI -------------*/

    @Test
    public void exemple(){
        assertTrue(true);
    }

    @Test
    public void ajoutUneEvalutation()
    {
        Evaluation evaluation = new Evaluation("Kanye",1, 2);
    }

    @Test
    public void evaluationExceptionNomPasUnique()
    {
        Evaluation evaluation = new Evaluation("Kanye",1, 2);
    }

}