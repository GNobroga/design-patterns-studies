import java.math.BigDecimal;

public class AdapterWithComposition {
    
    // Client
    // Adapter
    // Adaptee
    // Target
    
    public static void main(String[] args) {
        ProcessorPagamento2 credito = new MeuPagamentoCredito2();
        credito.debitar(new BigDecimal("100"));
    }

}

interface ProcessorPagamento2 {
    
    void debitar(BigDecimal valor);
    
    void creditar(BigDecimal valor);
    
}


class MeuPagamentoCredito2 implements ProcessorPagamento2 {
    
    SdkPagamentoCredito2 sdkPagamentoCredito = new SdkPagamentoCredito2();
    
    // ..
    
    public void debitar(BigDecimal valor) {
        // ..        
        sdkPagamentoCredito.autorizar(valor);
        sdkPagamentoCredito.capturar(valor);
    }
    
    public void creditar(BigDecimal valor) {
        // ..        
        sdkPagamentoCredito.creditar(valor);
    }
    
}

class SdkPagamentoCredito2 { // .jar / lib no maven
    
    // posso até ter acesso, mas não convém alterar
    
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