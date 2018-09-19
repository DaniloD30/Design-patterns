/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import concrete.Arrocha;
import concrete.BandaAcustica;
import concrete.BandaEletrica;
import concrete.Pagode;
import interfaces.IMusica;

/**
 *
 * @author LEESE
 */
public class Run {

    public static void main(String[] args) {
        IMusica musicaPagode = new Pagode(new BandaAcustica());
        musicaPagode.play();
        musicaPagode = new Pagode(new BandaEletrica());
        musicaPagode.play();

        IMusica musicaArrocha = new Arrocha(new BandaAcustica());
        musicaArrocha.play();
        musicaArrocha = new Arrocha(new BandaEletrica());
        musicaArrocha.play();

    }
}
