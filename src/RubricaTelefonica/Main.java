package RubricaTelefonica;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.addContact("Topo Gigio", "3334532987");
        rubrica.addContact("Mario Bros", "5679843287");
        rubrica.addContact("Luigi Bros", "3452309485");

        System.out.println("Contatti in rubrica:");
        rubrica.stampContacts();

        System.out.println("Numero di Topo Gigio: "+rubrica.searchNumber("Topo Gigio"));

        System.out.println("Il numero 5679843287 è di " + rubrica.searchName("5679843287"));

        rubrica.deleteContact("Topo Gigio");
        System.out.println("Nuova lista contatti:");
        rubrica.stampContacts();
    }
}