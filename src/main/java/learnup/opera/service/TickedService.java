package learnup.opera.service;

import learnup.opera.model.Ticked;
import learnup.opera.repository.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TickedService {
    @Autowired
    private Storage storage;

    public ArrayList<Ticked> getTickedList() {
        return storage.getTickedList();
    }

    public Ticked getTickedByID(int id) {
        return storage.getTickedByID(id);
    }

    public void buyTicked (Ticked ticked) {
        storage.buyTicked(ticked);
    }

    public void deleteTickedByID(int id) {
        storage.deleteTickedById(id);
    }
}
