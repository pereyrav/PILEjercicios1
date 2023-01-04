package main.java.com.pil.moby.evaluacion_tecnica.segundo_cuestionario;


import main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo.Candidato;
import main.java.com.pil.moby.evaluacion_tecnica.modelo.pojo.Tecnologia;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EvaluacionTecnicaPil2 {

    /**
     * <b>TEMAS:</b><p>
     * - Arreglos y ordenamiento.<p>
     * - POO.<p>
     * - Buenas prácticas + Utilización del IDE.<p>
     * - Java 5, 6, 7 y 8 (<i>Streams, Optionals, Generics, Functional Interfaces</i>).<p>
     */
    public static void main(String[] args) {

        imprimirBienvenidaEvaluacionTecnica();

        imprimirMensajePunto(1);

        // Desarrollo de la consigna 1.
        inicializarCandidatos();


        imprimirMensajePunto(2);

        // Desarrollo de la consigna 2.
        resolverPunto2();

        imprimirMensajePunto(3);

        // Desarrollo de la consigna 3.
        resolverPunto3();

        imprimirMensajePunto(4);

        // Desarrollo de la consigna 3.
        resolverPunto4();

        imprimirMensajePunto(5);

        // Desarrollo de la consigna 3.
        resolverPunto5();

    }

    private static void resolverPunto1() {
        inicializarCandidatos();
    }

    private static void resolverPunto2() {
        imprimirCandidatosPorId();
    }

    private static void resolverPunto3() {
        imprimirPorPretensionSalarial();
    }

    private static void resolverPunto4() {
        imprimirCandidatoMasExperimentado();

    }

    private static void resolverPunto5() {
        imprimirCandidatoConMasTecnologias();
    }

    public static void Tecnologias() {
        List<Tecnologia> listaTecnologias = new ArrayList<>();
        Tecnologia tecnologia = new Tecnologia(1L, "Java");
        Tecnologia tecnologia1 = new Tecnologia(2L, "Angular");
        Tecnologia tecnologia2 = new Tecnologia(3L, "SQL");
        Tecnologia tecnologia3 = new Tecnologia(4L, "NoSQL");
        Tecnologia tecnologia4 = new Tecnologia(5L, "Vue");
        Tecnologia tecnologia5 = new Tecnologia(6L, ".NET");
        Tecnologia tecnologia6 = new Tecnologia(7L, "MongoDB");
        Tecnologia tecnologia7 = new Tecnologia(8L, "NodeJS");
        listaTecnologias.add(tecnologia);
        listaTecnologias.add(tecnologia1);
        listaTecnologias.add(tecnologia2);
        listaTecnologias.add(tecnologia3);
        listaTecnologias.add(tecnologia4);
        listaTecnologias.add(tecnologia5);
        listaTecnologias.add(tecnologia6);
        listaTecnologias.add(tecnologia7);
    }

    public static void Candidatos() {
        ArrayList<Candidato> listaCandidatos = new ArrayList();
        Candidato candidato = new Candidato(3L, "Jhon", "Doe", 5000D, 2, "Java, SQL");
        Candidato candidato1 = new Candidato(7L, "Matias", "Otamendi", 3000D, 9, "NodeJS, Java, SQL");
        Candidato candidato2 = new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, "MongoDB, NoSQL");
        Candidato candidato3 = new Candidato(4L, "Gaston", "Mac Allister", 5000.50D, 1, "Vue, SQL, Java");
        Candidato candidato4 = new Candidato(5L, "Pablo", "De Paul", 9000.50D, 4, "Java");
        Candidato candidato5 = new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, "Java, Angular, SQL");
        Candidato candidato6 = new Candidato(10L, "Lionel", "Messi", 10000.10D, 10, "SQL, Vue, Java");
        Candidato candidato7 = new Candidato(9L, "Julian", "Alvarez", 5000D, 3, "NoSQL, MongoDB, SQL, Java");
        Candidato candidato8 = new Candidato(8L, "Lula", "Martinez", 1000D, 2, ".NET, Java");
        Candidato candidato9 = new Candidato(6L, "Agustin", "Dybala", 1000D, 2, "Java, .NET, Angular");
        listaCandidatos.add(candidato);
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);
        listaCandidatos.add(candidato4);
        listaCandidatos.add(candidato5);
        listaCandidatos.add(candidato6);
        listaCandidatos.add(candidato7);
        listaCandidatos.add(candidato8);
        listaCandidatos.add(candidato9);
    }
    public static void inicializarCandidatos() {
        ArrayList<Candidato> listaCandidatos = new ArrayList();
        Candidato candidato = new Candidato(3L, "Jhon", "Doe", 5000D,2, "Java, SQL");
        Candidato candidato1 = new Candidato(7L, "Matias", "Otamendi", 3000D, 9,"NodeJS, Java, SQL");
        Candidato candidato2 = new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, "MongoDB, NoSQL");
        Candidato candidato3 = new Candidato(4L, "Gaston", "Mac Allister", 5000.50D, 1, "Vue, SQL, Java");
        Candidato candidato4 = new Candidato(5L, "Pablo", "De Paul", 9000.50D, 4, "Java");
        Candidato candidato5 = new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, "Java, Angular, SQL");
        Candidato candidato6 = new Candidato(10L, "Lionel", "Messi", 10000.10D, 10, "SQL, Vue, Java");
        Candidato candidato7 = new Candidato(9L, "Julian", "Alvarez", 5000D, 3, "NoSQL, MongoDB, SQL, Java");
        Candidato candidato8 = new Candidato(8L, "Lula", "Martinez", 1000D, 2,".NET, Java");
        Candidato candidato9 = new Candidato( 6L, "Agustin", "Dybala", 1000D, 2, "Java, .NET, Angular");
        listaCandidatos.add(candidato);
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);
        listaCandidatos.add(candidato4);
        listaCandidatos.add(candidato5);
        listaCandidatos.add(candidato6);
        listaCandidatos.add(candidato7);
        listaCandidatos.add(candidato8);
        listaCandidatos.add(candidato9);

        listaCandidatos.forEach(System.out::println);
    }

        public static void imprimirCandidatosPorId() {
            ArrayList<Candidato> listaCandidatos = new ArrayList();
            Candidato candidato = new Candidato(3L, "Jhon", "Doe", 5000D,2, "Java, SQL");
            Candidato candidato1 = new Candidato(7L, "Matias", "Otamendi", 3000D, 9,"NodeJS, Java, SQL");
            Candidato candidato2 = new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, "MongoDB, NoSQL");
            Candidato candidato3 = new Candidato(4L, "Gaston", "Mac Allister", 5000.50D, 1, "Vue, SQL, Java");
            Candidato candidato4 = new Candidato(5L, "Pablo", "De Paul", 9000.50D, 4, "Java");
            Candidato candidato5 = new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, "Java, Angular, SQL");
            Candidato candidato6 = new Candidato(10L, "Lionel", "Messi", 10000.10D, 10, "SQL, Vue, Java");
            Candidato candidato7 = new Candidato(9L, "Julian", "Alvarez", 5000D, 3, "NoSQL, MongoDB, SQL, Java");
            Candidato candidato8 = new Candidato(8L, "Lula", "Martinez", 1000D, 2,".NET, Java");
            Candidato candidato9 = new Candidato( 6L, "Agustin", "Dybala", 1000D, 2, "Java, .NET, Angular");
            listaCandidatos.add(candidato);
            listaCandidatos.add(candidato1);
            listaCandidatos.add(candidato2);
            listaCandidatos.add(candidato3);
            listaCandidatos.add(candidato4);
            listaCandidatos.add(candidato5);
            listaCandidatos.add(candidato6);
            listaCandidatos.add(candidato7);
            listaCandidatos.add(candidato8);
            listaCandidatos.add(candidato9);

            listaCandidatos.sort(((o1, o2) -> o1.compareTo(o2)));
            listaCandidatos.forEach(System.out::println);
        }

    public static void imprimirPorPretensionSalarial() {
        ArrayList<Candidato> listaCandidatos = new ArrayList();
        Candidato candidato = new Candidato(3L, "Jhon", "Doe", 5000D,2, "Java, SQL");
        Candidato candidato1 = new Candidato(7L, "Matias", "Otamendi", 3000D, 9,"NodeJS, Java, SQL");
        Candidato candidato2 = new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, "MongoDB, NoSQL");
        Candidato candidato3 = new Candidato(4L, "Gaston", "Mac Allister", 5000.50D, 1, "Vue, SQL, Java");
        Candidato candidato4 = new Candidato(5L, "Pablo", "De Paul", 9000.50D, 4, "Java");
        Candidato candidato5 = new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, "Java, Angular, SQL");
        Candidato candidato6 = new Candidato(10L, "Lionel", "Messi", 10000.10D, 10, "SQL, Vue, Java");
        Candidato candidato7 = new Candidato(9L, "Julian", "Alvarez", 5000D, 3, "NoSQL, MongoDB, SQL, Java");
        Candidato candidato8 = new Candidato(8L, "Lula", "Martinez", 1000D, 2,".NET, Java");
        Candidato candidato9 = new Candidato( 6L, "Agustin", "Dybala", 1000D, 2, "Java, .NET, Angular");
        listaCandidatos.add(candidato);
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);
        listaCandidatos.add(candidato4);
        listaCandidatos.add(candidato5);
        listaCandidatos.add(candidato6);
        listaCandidatos.add(candidato7);
        listaCandidatos.add(candidato8);
        listaCandidatos.add(candidato9);

        listaCandidatos.stream().sorted(Comparator.comparingDouble(Candidato::getPretensionSalarial).reversed())
                .forEach(System.out::println);
    }

    public static void imprimirCandidatoMasExperimentado() {
        ArrayList<Candidato> listaCandidatos = new ArrayList();
        Candidato candidato = new Candidato(3L, "Jhon", "Doe", 5000D,2, "Java, SQL");
        Candidato candidato1 = new Candidato(7L, "Matias", "Otamendi", 3000D, 9,"NodeJS, Java, SQL");
        Candidato candidato2 = new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, "MongoDB, NoSQL");
        Candidato candidato3 = new Candidato(4L, "Gaston", "Mac Allister", 5000.50D, 1, "Vue, SQL, Java");
        Candidato candidato4 = new Candidato(5L, "Pablo", "De Paul", 9000.50D, 4, "Java");
        Candidato candidato5 = new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, "Java, Angular, SQL");
        Candidato candidato6 = new Candidato(10L, "Lionel", "Messi", 10000.10D, 10, "SQL, Vue, Java");
        Candidato candidato7 = new Candidato(9L, "Julian", "Alvarez", 5000D, 3, "NoSQL, MongoDB, SQL, Java");
        Candidato candidato8 = new Candidato(8L, "Lula", "Martinez", 1000D, 2,".NET, Java");
        Candidato candidato9 = new Candidato( 6L, "Agustin", "Dybala", 1000D, 2, "Java, .NET, Angular");
        listaCandidatos.add(candidato);
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);
        listaCandidatos.add(candidato4);
        listaCandidatos.add(candidato5);
        listaCandidatos.add(candidato6);
        listaCandidatos.add(candidato7);
        listaCandidatos.add(candidato8);
        listaCandidatos.add(candidato9);

        System.out.println(listaCandidatos.stream().sorted().findFirst());
    }

    public static void imprimirCandidatoConMasTecnologias() {
        ArrayList<Candidato> listaCandidatos = new ArrayList();
        Candidato candidato = new Candidato(3L, "Jhon", "Doe", 5000D, 2, "Java, SQL");
        Candidato candidato1 = new Candidato(7L, "Matias", "Otamendi", 3000D, 9, "NodeJS, Java, SQL");
        Candidato candidato2 = new Candidato(1L, "Joaquin", "Tagliafico", 2000D, 6, "MongoDB, NoSQL");
        Candidato candidato3 = new Candidato(4L, "Gaston", "Mac Allister", 5000.50D, 1, "Vue, SQL, Java");
        Candidato candidato4 = new Candidato(5L, "Pablo", "De Paul", 9000.50D, 4, "Java");
        Candidato candidato5 = new Candidato(2L, "Lucas", "Di Maria", 6000D, 7, "Java, Angular, SQL");
        Candidato candidato6 = new Candidato(10L, "Lionel", "Messi", 10000.10D, 10, "SQL, Vue, Java");
        Candidato candidato7 = new Candidato(9L, "Julian", "Alvarez", 5000D, 3, "NoSQL, MongoDB, SQL, Java");
        Candidato candidato8 = new Candidato(8L, "Lula", "Martinez", 1000D, 2, ".NET, Java");
        Candidato candidato9 = new Candidato(6L, "Agustin", "Dybala", 1000D, 2, "Java, .NET, Angular");
        listaCandidatos.add(candidato);
        listaCandidatos.add(candidato1);
        listaCandidatos.add(candidato2);
        listaCandidatos.add(candidato3);
        listaCandidatos.add(candidato4);
        listaCandidatos.add(candidato5);
        listaCandidatos.add(candidato6);
        listaCandidatos.add(candidato7);
        listaCandidatos.add(candidato8);
        listaCandidatos.add(candidato9);

        Collections.sort(listaCandidatos);
        System.out.println(listaCandidatos.stream().findFirst());
    }
    /**
     * Saludo de bienvenida, ignore el método.
     */
    private static void imprimirBienvenidaEvaluacionTecnica() {
        System.out.println("\n*******************************************");
        System.out.println("Bienvenidos a la segunda Evaluación Técnica." + "\n" + "Les deseamos muchos éxitos!");
        System.out.println("*******************************************\n");
    }

    /**
     * Separa de manera bonita cada punto a resolver, ignore el método.
     */
    private static void imprimirMensajePunto(int numeroPunto) {
        System.out.println("\n*******");
        System.out.println("PUNTO " + numeroPunto);
        System.out.println("*******\n");
    }
}