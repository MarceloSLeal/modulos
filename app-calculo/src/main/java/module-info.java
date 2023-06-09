module app.calculo {
    requires transitive app.logging;
    exports br.com.marcelo.calculo;

//    exports br.com.marcelo.calculo.interno
//            to app.financeiro;

    opens br.com.marcelo.calculo to app.financeiro;

    requires app.api;
    provides br.com.marcelo.app.Calculadora
            with br.com.marcelo.calculo.CalculadoraImpl;
}