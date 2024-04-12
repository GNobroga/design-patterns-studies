import java.math.BigDecimal;

public class AdapterWithInheritance {
    
    public static void main(String[] args) {
        MeuPagamentoCredito3 credito = new MeuPagamentoCredito3();
        credito.debitar(new BigDecimal("100"));
    }
    
}

interface ProcessorPagamento3 {
    
    void debitar(BigDecimal valor);
    
    void creditar(BigDecimal valor);
    
}

class MeuPagamentoCredito3 extends SdkPagamentoCredito3 
                           implements ProcessorPagamento3 {

    // ...
    
    public void debitar(BigDecimal valor) {
        super.autorizar(valor);
        super.capturar(valor);
    }
    
    public void creditar(BigDecimal valor) {
        super.creditar(valor);
    }
    
//    @Override
//    void autorizar(BigDecimal valor) {
//        // mudou o comportamento - não é mais two-way
//    }
    
}

class SdkPagamentoCredito3 {
    
    void autorizar(BigDecimal valor) {
        // autoriza
    }
    
    void capturar(BigDecimal valor) {
        // captura
    }
    
    void creditar(BigDecimal valor) {
        // credita
    }
    
}