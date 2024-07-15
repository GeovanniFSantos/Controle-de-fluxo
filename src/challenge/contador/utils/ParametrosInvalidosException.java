package challenge.contador.utils;
public class ParametrosInvalidosException extends Exception{
    public String pegarMensagem (){
        return "O segundo parâmetro deve ser maior que o primeiro";
    }
    
}