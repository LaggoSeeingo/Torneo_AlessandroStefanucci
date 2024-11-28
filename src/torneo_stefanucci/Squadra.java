/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo_stefanucci;

/**
 *
 * @author B045_14
 */

import java.util.Random;

public class Squadra implements Runnable{
    
    private int idSquadra;
    private int punti;
    private Random random; //Generatore di numeri casuali, verrà usato in futuro nello sviluppo
    private Arbitro arbitro;
    
    public Squadra(int idSquadra, Arbitro arbitro){
        this.idSquadra = idSquadra;
        punti = 0;
        this.arbitro = arbitro;
        random = new Random(); //Inizializzazione generatore numeri casuali
    }
    
    public int getIdSquadra(){
        return idSquadra;
    }
    
    public int getPunti(){
        return punti;
    }
    
    
    @Override
    public void run(){
        //codice
    }
}

