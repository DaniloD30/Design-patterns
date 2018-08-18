/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import interfaces.IAbstractFactory;
import interfaces.IChassi;
import interfaces.IMotor;
import interfaces.IPneu;
import java.util.ArrayList;
import java.util.List;
import products.Chassi;
import products.Motor;
import products.Pneu;

/**
 *
 * @author LEESE
 */
public class MyFactory implements IAbstractFactory {
    
    private MyFactory(){
        this.pneu = new ArrayList<>();
        this.chassi = new ArrayList<>();
        this.motor = new ArrayList<>();
        
    }
    
    public static MyFactory getInstance(int QtdPneu, int QtdChassi, int QtdMotor){
        MyFactory.qtdChassi = QtdChassi;
        MyFactory.qtdMotor = QtdMotor;
        MyFactory.qtdPneu = QtdPneu;
        if(MyFactory.instance == null)
            MyFactory.instance = new MyFactory();
        return MyFactory.instance;
    }

    @Override
    public IChassi createChassi() {
        if(this.chassi.size() < MyFactory.qtdChassi ){
            this.chassi.add(new Chassi());
            return this.chassi.get(this.chassi.size()-1);
        }
        if(this.countChassi == MyFactory.qtdChassi){
            this.countChassi = 0;
        }
        return this.chassi.get(this.countChassi++);
    }

    @Override
    public IMotor createMotor() {
        if(this.motor.size() < MyFactory.qtdMotor ){
            this.motor.add(new Motor());
            return this.motor.get(this.motor.size()-1);
        }
        if(this.countMotor == MyFactory.qtdMotor){
            this.countMotor = 0;
        }
        return this.motor.get(this.countMotor++);
    }

    @Override
    public IPneu createPneu() {
        if(this.pneu.size() < MyFactory.qtdPneu ){
            this.pneu.add(new Pneu());
            return this.pneu.get(this.pneu.size()-1);
        }
        if(this.countPneu == MyFactory.qtdPneu){
            this.countPneu = 0;
        }
        return this.pneu.get(this.countPneu++);
    }
    
    private static MyFactory instance = null;
    
    private static int qtdPneu;
    private static int qtdChassi;
    private static int qtdMotor;
    
    private List<IPneu> pneu;
    private List<IChassi> chassi;
    private List<IMotor> motor;
    
    private int countChassi = 0;
    private int countPneu = 0;
    private int countMotor = 0;
}
