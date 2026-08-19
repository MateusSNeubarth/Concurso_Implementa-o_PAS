public class App {

    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        var validadorEmail = new Validador(new ValidadorEmailStrategy());

        if (validadorEmail.valida(email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }

        String matricula = "55";
        var validadorMatricula = new Validador(new ValidadorMatriculaStrategy());

        if (validadorMatricula.valida(matricula)){
            System.out.println(matricula+" é uma matrícula válida!");
        } else {
            System.out.println(matricula+" não é uma matrícula válida!");
        }

        String inteiro = "456";
        var validadorInteiro = new Validador(new ValidadorInteiroStrategy());

        if (validadorInteiro.valida(inteiro)){
            System.out.println(inteiro+" é um inteiro válido!");
        } else {
            System.out.println(inteiro+" não é um inteiro válido!");
        }
    }
}
