/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22anxoll
 */
public abstract class Ficha {

    public ArrayList<Cadrado> cadrados = new ArrayList();
    private Iterator<Cadrado> iterCadrados;
    public Xogo xogo;

    public Ficha(Xogo xogo) {
        this.xogo = xogo;
    }

    public boolean moverDereita() {
        System.out.println("True");
        boolean mover = true;
        Iterator<Cadrado> iter = cadrados.iterator();
        while (iter.hasNext()) {
            Cadrado cmover = iter.next();
            if (cmover.lblCadrado.getX() == xogo.MAX_X) {
                mover = false;
            }
        }
        return mover;
    }

    public boolean moverEsquerda() {
        boolean mover = true;
        Iterator<Cadrado> iter = cadrados.iterator();
        while (iter.hasNext()) {
            Cadrado cmover = iter.next();
            if (cmover.getX() == 0) {
                mover = false;
            }
        }
        return mover;
    }

    public boolean moverAbaixo() {
        System.out.println("bai");
        Iterator<Cadrado> iter = cadrados.iterator();
        while (iter.hasNext()) {
            Cadrado cmover = iter.next();
            cmover.lblCadrado.setLocation(cmover.getX(), cmover.getY() + xogo.LADOCADRADO);
            cmover.y += xogo.LADOCADRADO;
            System.out.print(cmover.getX() + " , " + "" + cmover.getY()+", ");
        }
        return true;
    }

    public abstract boolean rotar();
}
