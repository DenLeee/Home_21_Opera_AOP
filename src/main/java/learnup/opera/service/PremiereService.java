package learnup.opera.service;

import learnup.opera.model.Premiere;
import learnup.opera.repository.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PremiereService {
    private final Storage storage;

    public PremiereService(Storage storage) {
        this.storage = storage;
    }

    public void addPremiere (Premiere premiere) {
        storage.addPremiere(premiere);
    }

    public void deletePremiereByID(int id) {
        storage.deletePremiereByID(id);
    }

    public void deletePremiereByNameOpera(String nameOpera) {
        storage.deletePrimiereByNameOpera(nameOpera);
    }

    public Premiere updatePremireByID(int id, Premiere premiere) {
        return storage.updatePremiereByID(id, premiere);
    }

    public ArrayList<Premiere> getPremiereList() {
        return storage.getPremiereList();
    }

    public Premiere getPremiereByName(String nameOpera) {
        return storage.getPremiereByNameOpera(nameOpera);
    }


}
