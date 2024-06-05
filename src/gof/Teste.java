package gof;

import gof.facade.Facade;
import gof.single.SingletonEager;
import gof.single.SingletonLazy;
import gof.single.SingletonLazyHolder;
import gof.strategy.*;

public class Teste {
    public static void main(String[] args) {
        //testes referente ao pacote single
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //testes referent ao pacote strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgrecivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        //teste referente ao pacote facade
        Facade facade = new Facade();
        facade.migrarCliente("claudio","63.590-000");



    }
}
