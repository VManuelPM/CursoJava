package com.amoelcodigo.patrones.decorator2.decorator;

import com.amoelcodigo.patrones.decorator2.Configurable;

public abstract class CafeDecorador implements Configurable {
    protected Configurable cafe;
    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
