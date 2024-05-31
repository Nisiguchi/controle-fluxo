public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        String resultado = nota >= 7 ? "APROVADO" : nota > 5 && nota <7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println(resultado);
    
    }

}