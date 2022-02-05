package com.datadynecode.designpatterns;

public class Cha extends Bebida{
    @Override
    protected void mexer() {
        System.out.println("Mexendo o Chá");
    }

    @Override
    protected boolean colocarAcucar() {
        return true;
    }

    @Override
    protected void adicionarAcucar() {

    }

    @Override
    protected void adicionarSubstrancia() {
        System.out.println("Adicionando substancia ao Chá");
    }

    @Override
    protected void adicionarAgua() {
        System.out.println("Adicionando água ao Chá");
    }
}
