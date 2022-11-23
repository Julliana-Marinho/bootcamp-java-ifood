class RodarAplicacao {
    public static void main(String[] args) throws Exception {
    
    Funcionario funcionario = new Funcionario();

    //upcasts implícitos
    Funcionario gerente = new Gerente();
    Funcionario vendedor = new Vendedor();
    Funcionario faxineiro = new Faxineiro();

    //downcast explícito - dá erro, deve ser evitado

    /*Vendedor vendedor_ = (Vendedor) new Funcionario();*/

    
    }
}
