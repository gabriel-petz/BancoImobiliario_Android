package project.com.bancoimobiliariointerdisciplinar;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import project.com.bancoimobiliariointerdisciplinar.Interface.IJogador;
import project.com.bancoimobiliariointerdisciplinar.JDBC.JogadorJDBC;
import project.com.bancoimobiliariointerdisciplinar.ModelIn.Jogador;

@RunWith(AndroidJUnit4.class)
public class TestClass {

    private static Context appContext = InstrumentationRegistry.getTargetContext();

    private static JogadorJDBC jogadorJDBC = new JogadorJDBC(appContext);

    @Test
    public void test_insertjogador() {

        Context appContext = InstrumentationRegistry.getTargetContext();

        Jogador jog = new Jogador();

        jog.setJognome("root");
        jog.setJognick("rootplayer");
        jog.setJogsenha("rootpassword");

        jogadorJDBC.insertJogador(jog);

    }

    @Test
    public void test_getjogadornick() {

        Context appContext = InstrumentationRegistry.getTargetContext();

        jogadorJDBC.getJogador(10);

    }

    @Test
    public void test_alterJogador() {

        Context appContext = InstrumentationRegistry.getTargetContext();

        Jogador jog = new Jogador();

        jog.setJogid(10);
        jog.setJognome("root");
        jog.setJognick("root");

        jogadorJDBC.updateJogador(jog);
    }

    @Test
    public void test_getjogadornome() {

        Context appContext = InstrumentationRegistry.getTargetContext();

        jogadorJDBC.getJogador("root");

    }

    @Test
    public void test_updatesenha() {
        Context appContext = InstrumentationRegistry.getTargetContext();

        jogadorJDBC.updateSenha(10, "newrootpasswd");
    }

    @Test
    public void test_deletejogador() {
        Context appContext = InstrumentationRegistry.getTargetContext();

        jogadorJDBC.deleteJogador(10);
    }


}
