import java.util.Scanner;

class QuizVeiculosJava {

    public static void main(String[] args) {

        System.out.println("   --*UNIFAN*--   ");
        System.out.println("Professor: Breno");
        System.out.println("Aluno: Luiz Gustavo da Silva Zuza");
        System.out.println("Data: 21/09/2024");
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("--------QUIZ_VEÍCULOS--------");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("                             --------->BEM-VINDO!<---------                             ");
        System.out.println("Você agora irá fazer um quiz contendo 15(quinze) questões, sobre 'VEÍCULOS AUTOMOTORES'.");
        System.out.println("Lembre-se, por favor, de responder cada questão com sua respectiva letra em MAIÚSCULA.");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
                "1. Qual é o combustível mais comum usado em carros?",
                "2. Qual é a marca de carro mais vendida no mundo?",
                "3. Qual é a função do catalisador em um veículo?",
                "4. Qual é a velocidade máxima permitida em rodovias no Brasil?",
                "5. Qual é o tipo de motor mais comum em motocicletas?",
                "6. Qual é a principal função do óleo do motor?",
                "7. Qual é a marca de carro conhecida pelo modelo 'Mustang'?",
                "8. Qual é a função do alternador em um veículo?",
                "9. Qual é o nome do sistema responsável pelo ato de freiar os veículos?",
                "10. Qual é a marca de carro conhecida pelo modelo 'Civic'?",
                "11. Qual é a função do sistema de freios ABS?",
                "12. Qual é o tipo de transmissão mais comum em carros automáticos?",
                "13. Qual é a marca de carro conhecida pelo modelo 'Corolla'?",
                "14. Qual é a função do radiador em um veículo?",
                "15. Qual é o tipo de pneu mais comum em carros de passeio?"
        };

        String[][] alternativas = {
                {"A. Diesel", "B. Gasolina", "C. Etanol", "D. Gás Natural", "E. Eletricidade"},
                {"A. Ford", "B. Toyota", "C. Volkswagen", "D. Honda", "E. Chevrolet"},
                {"A. Aumentar a potência", "B. Reduzir a emissão de poluentes", "C. Melhorar a eficiência do combustível", "D. Reduzir o ruído", "E. Aumentar a velocidade"},
                {"A. 80 km/h", "B. 100 km/h", "C. 110 km/h", "D. 120 km/h", "E. 130 km/h"},
                {"A. Motor a diesel", "B. Motor a gasolina", "C. Motor elétrico", "D. Motor a etanol", "E. Motor a gás"},
                {"A. Lubrificar o motor", "B. Resfriar o motor", "C. Limpar o motor", "D. Aumentar a potência", "E. Reduzir o consumo de combustível"},
                {"A. Chevrolet", "B. Ford", "C. Toyota", "D. Honda", "E. Nissan"},
                {"A. Fornecer energia elétrica", "B. Aumentar a potência do motor", "C. Reduzir a emissão de poluentes", "D. Melhorar a eficiência do combustível", "E. Reduzir o ruído"},
                {"A. Sistema de frenagem", "B. Catalisador", "C. Sistema de exaustão", "D. Sistema de injeção", "E. Sistema de ignição"},
                {"A. Ford", "B. Toyota", "C. Volkswagen", "D. Honda", "E. Chevrolet"},
                {"A. Aumentar a potência", "B. Reduzir a emissão de poluentes", "C. Melhorar a eficiência do combustível", "D. Evitar o travamento das rodas", "E. Reduzir o ruído"},
                {"A. Manual", "B. CVT", "C. Automática", "D. Semi-automática", "E. Dual-clutch"},
                {"A. Ford", "B. Toyota", "C. Volkswagen", "D. Honda", "E. Chevrolet"},
                {"A. Lubrificar o motor", "B. Resfriar o motor", "C. Limpar o motor", "D. Aumentar a potência", "E. Reduzir o consumo de combustível"},
                {"A. Pneu radial", "B. Pneu diagonal", "C. Pneu de corrida", "D. Pneu de neve", "E. Pneu de trator"}
        };

        char[] respostasCorretas = {'B', 'B', 'B', 'D', 'B', 'A', 'B', 'A', 'A', 'D', 'D', 'B', 'B', 'B', 'A'};

        int acertos = 0;
        int erros = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            for (int j = 0; j < alternativas[i].length; j++) {
                System.out.println(alternativas[i][j]);
            }
            System.out.print("Sua resposta: ");
            char resposta = scanner.next().charAt(0);

            if (resposta == respostasCorretas[i]) {
                System.out.println("Resposta correta!\n");
                acertos++;
            } else {
                System.out.println("Resposta incorreta! A resposta correta é: " + respostasCorretas[i] + "\n");
                erros++;
            }
        }

        double porcentagemAcertos = (acertos / (double) perguntas.length) * 100;

        System.out.println("Quiz finalizado!");
        System.out.println("Total de acertos: " + acertos);
        System.out.println("Total de erros: " + erros);
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagemAcertos) + "%");

        scanner.close();
    }
}