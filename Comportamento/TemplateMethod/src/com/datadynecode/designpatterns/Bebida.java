package com.datadynecode.designpatterns;

public abstract class Bebida {

    public void preparar() {

        adicionarAgua();
        adicionarSubstrancia();

        if(colocarAcucar()) {
            adicionarAcucar();
        }

        mexer();
    }

    protected abstract void mexer();

    protected abstract boolean colocarAcucar();

    protected abstract void adicionarAcucar();

    protected abstract void adicionarSubstrancia();

    protected abstract void adicionarAgua();
}
