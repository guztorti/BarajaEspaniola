package barajaespaniola.enums;

public enum Numero {

    n1(1), n2(2), n3(3), n4(4), n5(5), n6(6), n7(7), n8(10), n9(11), n10(12);

    private Integer valor;

    private Numero(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

}
