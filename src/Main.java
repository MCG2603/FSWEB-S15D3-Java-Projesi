import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employeesList = new LinkedList<>();
        Employee e = new Employee(1, "AHMET", "YILMAZ");
        Employee e1 = new Employee(1, "AHMET", "YILMAZ");
        Employee e2 = new Employee(3, "MEHMET", "YILMAZ");
        Employee e3 = new Employee(4, "MUSTAFA", "YILMAZ");
        Employee e4 = new Employee(5, "CENGİZ", "YILMAZ");
        Employee e5 = new Employee(6, "MURAT", "YILMAZ");
        Employee e6 = new Employee(7, "KEMAL", "YILMAZ");
        Employee e7 = new Employee(8, "CEMAL", "YILMAZ");
        Employee e8 = new Employee(8, "CEMAL", "YILMAZ");
        Employee e9 = new Employee(1, "AHMET", "YILMAZ");

        Employee e10 = new Employee(1, "AHMET", "YILMAZ");
        employeesList.add(e);
        employeesList.add(e1);
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);
        employeesList.add(e5);
        employeesList.add(e6);
        employeesList.add(e7);
        employeesList.add(e8);
        employeesList.add(e9);
        employeesList.add(e10);
        LinkedList<Employee> employeesListCopy = new LinkedList<>(employeesList);

        HashSet<Employee> list = new HashSet<>();
        Employee y;
        boolean b;
        int i = 0;
        HashMap<Integer, Employee> hasmap = new HashMap<Integer, Employee>();
        for (Employee f : employeesListCopy) {
            y = hasmap.put(f.id, f);
            if (y != null) {
                list.add(f);
                employeesList.remove(f);
            }


        }

        while (list.remove(null)) ;
        for (Employee g : list) {

            System.out.println(g);

        }

        for (Employee g : hasmap.values()) {
            System.out.println(g.firstName);
        }
        System.out.println("orjinal list geliyor");
        for (Employee g : employeesList) {
            System.out.println(g.firstName);
        }

        String s = "When the offensive resumed, the Turks received their first victory when the Greeks encountered stiff resistance in the battles of First and Second İnönü," +
                " due to İsmet Pasha's organization of an irregular militia into a regular army. " +
                " The two victories led to Allied proposals to amend the Treaty of Sèvres where both Ankara and Istanbul were represented, but Greece refused."
                + " With the conclusion of the Southern and Eastern fronts, Ankara was able to concentrate more forces on the West against the Greeks."
                + " They also began to receive support from Soviet Union, as well as France and Italy, who sought to check British influence in the Near East.\n"
                + " June–July 1921 saw heavy fighting in the Battle of Kütahya-Eskişehir. While it was an eventual Greek victory, the Turkish army withdrew in good order to the Sakarya river, their last line of defence." +
                " Mustafa Kemal Pasha replaced İsmet Pasha after the defeat as commander in chief as well as his political duties." +
                " The decision was made in the Greek military command to march on the nationalist capital of Ankara to force Mustafa Kemal to the negotiating table." +
                " For 21 days, the Turks and Greeks fought a pitched battle at the Sakarya river, which ended in Greek withdrawal." +
                " Almost of year of stalemate without much fighting followed, during which Greek moral and discipline faltered while Turkish strength increased." +
                " French and Italian forces evacuated from Anatolia. The Allies offered an armistice to the Turks, which Mustafa Kemal refused.";

        String[] terms = s.split("[\\s@&.?$+-:;']+");
        HashMap<String, String> hasmap2 = new HashMap<String, String>();
        String gg;
        String qq1;
        int u=0;
        for (String s5 : terms) {
            if(hasmap2.get(s5)==null) {
              hasmap2.put(s5, "1");
            }
            else{
                u=Integer.parseInt(hasmap2.get(s5));
                u+=1;
                qq1=Integer.toString(u);
                hasmap2.replace(s5,qq1);
            }

        }
        Iterator<String> itr = hasmap2.values().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("burasııııııııııııı");
        System.out.println(hasmap2.get("Turks"));
        System.out.println(hasmap2.put("Turks","1"));
        System.out.println(hasmap2.put("Turks","1"));
    }


}