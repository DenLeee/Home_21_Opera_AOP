package learnup.opera.repository;

import learnup.opera.model.Premiere;
import learnup.opera.model.Ticked;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public class Storage {
    private static int PRIMIERE_COUNT;
    private static int TICKET_COUNT;
    private ArrayList<Premiere> premiereList;
    private ArrayList<Ticked> tickedList;
    {
        premiereList = new ArrayList<>();
        premiereList.add(new Premiere(++PRIMIERE_COUNT, "ДОН ЖУАН", "«Дон Жуан» Моцарта в спектакле +", 16, 200));
        premiereList.add(new Premiere(++PRIMIERE_COUNT, "СПЯЩАЯ КРАСАВИЦА", "Во дворце короля Флорестана XIV празднуют рождение дочери — принцессы Авроры. ",
                6, 300));
        premiereList.add(new Premiere(++PRIMIERE_COUNT, "РОМЕО И ДЖУЛЬЕТТА", "Трагедия Уильяма Шекспира, о любви юноши и девушки из двух враждующих родов",
                12, 250));
        premiereList.add(new Premiere(++PRIMIERE_COUNT, "СПАРТАК", "Cкованных цепями пленников, обращенных в рабство, – Спартак и Фригия", 12, 200));
        tickedList = new ArrayList<>();
        tickedList.add(new Ticked(++TICKET_COUNT, premiereList.get(0), 800));
        tickedList.add(new Ticked(++TICKET_COUNT, premiereList.get(2), 1100));
        tickedList.add(new Ticked(++TICKET_COUNT, premiereList.get(1), 700));
        tickedList.add(new Ticked(++TICKET_COUNT, premiereList.get(0), 800));
    }

    public ArrayList<Premiere> getPremiereList() {
        return premiereList;
    }

    public Premiere getPremiereByNameOpera(String nameOpera) {
        for (int i = 0; i < premiereList.size(); i++) {
            if (premiereList.get(i).getNameOpera().equals(nameOpera))
                return premiereList.get(i);
        }
        return null;
    }

    public void addPremiere(Premiere premiere) {
        premiereList.add(premiere);
        System.out.println(premiere + " добавлена");
    }

    public Premiere updatePremiereByID(int id, Premiere premiere) {
        return premiereList.set(id-1, premiere);
    }

    public void deletePremiereByID(int id) {
        premiereList.remove(id);
    }

    public void deletePrimiereByNameOpera(String nameOpera) {
        for (int i = 0; i < premiereList.size(); i++) {
            if (nameOpera.equals(premiereList.get(i).getNameOpera())) {
                premiereList.remove(i);
                System.out.println("Прьмьера с именем " + nameOpera + " удалена!");
            }
        }
    }

    public ArrayList<Ticked> getTickedList() {
        return tickedList;
    }

    public Ticked getTickedByID(int id) {
        for (int i = 0; i < tickedList.size(); i++) {
            if (tickedList.get(i).getId() == id)
                return tickedList.get(i);
        }
        return null;
    }

    public void buyTicked(Ticked ticked) {
        tickedList.add(ticked);
    }

    public void deleteTickedById(int id) {
        tickedList.remove(id);
    }
}
