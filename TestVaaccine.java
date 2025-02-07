package Tutorial5;

import java.util.Random;

public class TestVaaccine {
    public static void main(String[] args) {

        LinkList list = new LinkList() ;

        CovidVaccine person1 = new CovidVaccine("672115042", "Ranticha", "Chumjai") ;
        person1.previousVaccines.add("Pfizer") ;
        person1.previousVaccines.add("Moderna") ;
        list.insert(person1);

        CovidVaccine preson2 = new CovidVaccine("672115037", "Phutawan", "Mueangma") ;
        preson2.previousVaccines.add("Moderna") ;
        preson2.previousVaccines.add("Sinovac") ;
        list.insert(preson2);

        CovidVaccine person3 = new CovidVaccine("672115024", "Tat", "Putjorn") ;
        person3.previousVaccines.add("AstraZeneca") ;
        person3.previousVaccines.add("Sinopharm") ;
        list.insert(person3);

        CovidVaccine person4 = new CovidVaccine("672115016", "Natthapat", "Jagkhuruang") ;
        person4.previousVaccines.add("Johnson & Johnson") ;
        person4.previousVaccines.add("Sinovac") ;
        list.insert(person4);

        CovidVaccine person5 = new CovidVaccine("672115039", "Metavee", "Aeinjang") ;
        person5.previousVaccines.add("Moderna") ;
        person5.previousVaccines.add("AstraZeneca") ;
        list.insert(person5);

        CovidVaccine person6 = new CovidVaccine("672115045", "Virawit", "Kongthong") ;
        person6.previousVaccines.add("Pfizer") ;
        person6.previousVaccines.add("Johnson & Johnson") ;
        list.insert(person6);

        CovidVaccine person7 = new CovidVaccine("672115019", "Thinnapop", "Srisomboon") ;
        person7.previousVaccines.add("Sinopharm") ;
        person7.previousVaccines.add("Johnson & Johnson") ;
        list.insert(person7);

        CovidVaccine person8 = new CovidVaccine("672115013", "Natthan", "Champathip") ;
        person8.previousVaccines.add("Moderna") ;
        person8.previousVaccines.add("Sinovac") ;
        list.insert(person8);

        CovidVaccine person9 = new CovidVaccine("672115010", "Natanon", "Somboon") ;
        person9.previousVaccines.add("Johnson & Johnson") ;
        person9.previousVaccines.add("Pfizer") ;
        list.insert(person9);

        CovidVaccine person10 = new CovidVaccine("672115044", "Vichayada", "Abhicharttibutra") ;
        person10.previousVaccines.add("Sinovac") ;
        person10.previousVaccines.add("Sinopharm") ;
        list.insert(person10);

        System.out.println("Initial list of all applicants");
        list.traversal() ;

        System.out.println("Remaining applicants after random deletion") ;
        

        Random rand = new Random();

        for(int i = 0; i < 2; i++) {
            int randomIndex = rand.nextInt(list.getSize());
            Node current = list.head;
            for(int j = 0; j < randomIndex; j++) {
                current = current.next;
            }
            CovidVaccine removed = (CovidVaccine) current.data;
            list.delete(removed.getSID());
            System.out.println("Removed: " + removed.toString());
        }

        System.out.println();

        list.traversal() ;
        System.out.println("Size: " + list.getSize());

        System.out.println("Deleting all applicants") ;
        list.deleteAll();

        System.out.println("Remaining applicants after deleting all") ;

        System.out.println("Final size: " + list.getSize());
    }

}
