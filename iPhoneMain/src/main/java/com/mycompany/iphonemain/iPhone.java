/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iphonemain;



public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet { 
        
    // Implementações dos métodos para ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    // Implementações dos métodos para AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Fazendo uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementações dos métodos para NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador");
    }
}