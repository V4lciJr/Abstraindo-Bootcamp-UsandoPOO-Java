package br.com.desafioDio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao) {
        super(titulo, descricao);
        this.data = LocalDate.now();
    }

    @Override
    public double calculaXp() {
        return XP_PADRAO + 25d;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
