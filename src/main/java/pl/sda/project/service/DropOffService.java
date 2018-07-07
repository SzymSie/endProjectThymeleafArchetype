package pl.sda.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.project.repository.DropOffRepository;
import pl.sda.project.entity.DropOff;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DropOffService {

    @Autowired
    private DropOffRepository dropOffRepository;

    public List<DropOff> getAllDropOffs() {
        List<DropOff> DropOffs = new ArrayList<>();
        dropOffRepository.findAll()
                .forEach(DropOffs::add);
        return DropOffs;
    }

    public DropOff getDropOff(int id) {
        Optional<DropOff> dropOff = dropOffRepository.findById(id);
        return dropOff.get();
    }

    public DropOff addDropOff(DropOff dropOff) {
        return dropOffRepository.save(dropOff);
    }

    public void updateDropOff(int id, DropOff dropOff) {
        dropOffRepository.save(dropOff);
    }

    public void deleteDropOff(int id) {
        dropOffRepository.deleteById(id);
    }
}
