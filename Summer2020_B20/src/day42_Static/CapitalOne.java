package day42_Static;

public class CapitalOne {
    public static void main(String[] args) {

        Tester[] testers = { new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Aalia", 'F', 15111L, "Lead Tester", 180000);
        testers[1].setInfo("Naz", 'F', 15221L, "Tester", 180000);
        testers[2].setInfo("Kalbinur", 'F', 15333L, "Tester", 210000);

        Developer[] developers = { new Developer(), new Developer(), new Developer(), new Developer(), new Developer()};
        developers[0].setInfo("Wagar", 'M', 2111L, "Dev Lead", 450000);
        developers[1].setInfo("Roza", 'F', 2171L, "Dev Lead", 250000);
        developers[2].setInfo("Burak", 'M', 21511L, "Dev Lead", 150000);
        developers[3].setInfo("Virginia", 'F', 2121L, "Dev Lead", 180000);
        developers[4].setInfo("Akbar", 'M', 2191L, "Dev Lead", 145000);


        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Ramazan", "Hamit", "Ismail");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);

        System.out.println("=============================================================================");
        for(Tester each : team1.testers){
            System.out.println(each.name + " : $" + each.salary);
        }

        System.out.println("==============================================================================");
        for(Developer each : team1.developers) {
            System.out.println(each.name + " : " + each.salary);
        }

        System.out.println("==============================================================================");
        team1.removeDeveloper(21511L);
        team1.removeTester(15221L);
        team1.removeDeveloper(2121L);
        System.out.println(team1);

        System.out.println("==============================================================================");
        Developer dev1 = new Developer();
        dev1.setInfo("luisa", 'f', 2113L, "Dev Lead", 500000);

        team1.addDeveloper(dev1);

        ScrumTeam[] scrumTeams = {team1, new ScrumTeam(),new ScrumTeam()};
        System.out.println(team1);



    }
}
