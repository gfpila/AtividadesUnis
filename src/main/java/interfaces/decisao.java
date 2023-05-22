package interfaces;

public interface decisao {
    
    public void decidir();
    
    default String excelente()
    {
        return "Parabéns, você atingiu todos os indicadores de avaliação com excelência.";
    }
    default String satisfatorio()
    {
        return "Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação.";
    }
    default String reprovado()
    {
        return "Você não atingiu o mínimo esperado para aprovação.";
    }
    
}