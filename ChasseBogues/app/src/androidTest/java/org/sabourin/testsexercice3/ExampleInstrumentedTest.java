package org.sabourin.testsexercice3;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest
{
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("org.sabourin.testsexercice3", appContext.getPackageName());
    }

    @Test
    public void nombrePlusGrand10OK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String phraseActual = testeMoi.comparerDix(11);
        String phraseAttendu = "notre " + 11 + "est plus grand que 10";

        assertEquals(phraseActual , phraseAttendu);
    }

    @Test
    public void nombrePlusPetit10OK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String phraseActual = testeMoi.comparerDix(7);
        String phraseAttendu = "notre " + 7 + "est plus petit que 10";

        assertEquals(phraseActual , phraseAttendu);
    }

    @Test
    public void nombreEgale10OK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String phraseActual = testeMoi.comparerDix(10);
        String phraseAttendu = "notre " + 10 + "est égal à 10";

        assertEquals(phraseActual , phraseAttendu);
    }

    @Test
    public void egaliteRvsROK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("roche", "roche");
        String Attendu = "Égalité";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void egalitePvsPOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("papier", "papier");
        String Attendu = "Égalité";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void egaliteGvsGOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("gnocchi", "gnocchi");
        String Attendu = "Égalité";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void deuxRvsPOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("roche", "papier");
        String Attendu = "Joueur 2 gagne";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void unRvsGOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("roche", "gnocchi");
        String Attendu = "Joueur 1 gagne";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void unPvsROK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("papier", "roche");
        String Attendu = "Joueur 1 gagne";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void unPvsGOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("papier", "gnocchi");
        String Attendu = "Joueur 2 gagne";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void unGvsPOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("gnocchi", "papier");
        String Attendu = "Joueur 1 gagne";

        assertEquals(Actual , Attendu);
    }
    @Test
    public void unGvsROK()
    {
        TesteMoi testeMoi = new TesteMoi();

        String Actual = testeMoi.rochePapierGnocchi("gnocchi", "roche");
        String Attendu = "Joueur 2 gagne";

        assertEquals(Actual , Attendu);
    }

    @Test
    public void calculateVideOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        int Acutal = testeMoi.calculate("");
        int Attendu = 0;

        assertEquals(Attendu,Acutal);
    }

    @Test
    public void calculateEspaceSeulementOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        int Acutal = testeMoi.calculate("  ");
        int Attendu = 0;

        assertEquals(Attendu,Acutal);
    }

    @Test
    public void calculateUnChiffreOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        int Acutal = testeMoi.calculate("2");
        int Attendu = 2;

        assertEquals(Attendu,Acutal);
    }

    @Test
    public void calculatePlusieursChiffresOK()
    {
        TesteMoi testeMoi = new TesteMoi();

        int Acutal = testeMoi.calculate("12");
        int Attendu = 3;

        assertEquals(Attendu,Acutal);
    }
}