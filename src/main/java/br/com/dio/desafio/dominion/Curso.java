package br.com.dio.desafio.dominion;

import java.lang.reflect.Constructor;

public class Curso {

    private String tituloDoCurso;
    private String descricaoDoCurso;
    private int cargaHorariaDoCurso;

    public Curso() {

    }

    public String getTitulo() {
        return tituloDoCurso;
    }

    public void setTitulo(String titulo) {
        this.tituloDoCurso = titulo;
    }

    public String getDescricao() {
        return descricaoDoCurso;
    }

    public void setDescricao(String descricao) {
        this.descricaoDoCurso = descricao;
    }

    public int getCargaHoraria() {
        return cargaHorariaDoCurso;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHorariaDoCurso = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + tituloDoCurso + '\'' +
                ", descricao='" + descricaoDoCurso + '\'' +
                ", cargaHoraria=" + cargaHorariaDoCurso +
                '}';
    }
}
