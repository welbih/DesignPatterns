package com.datadynecode.designpatterns;

public class Suco extends Bebida{
    @Override
    protected void mexer() {
        System.out.println("Mexendo o suco");
    }

    @Override
    protected boolean colocarAcucar() {
        return true;
    }

    @Override
    protected void adicionarAcucar() {
        System.out.println("Adicionando Açucar ao suco");
    }

    @Override
    protected void adicionarSubstrancia() {
        System.out.println("Adicionando substancia ao suco");
    }

    @Override
    protected void adicionarAgua() {
        System.out.println("Adicionando água ao suco");
    }
}
