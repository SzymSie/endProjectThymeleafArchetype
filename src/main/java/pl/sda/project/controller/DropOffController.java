package pl.sda.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.sda.project.service.DropOffService;
import pl.sda.project.entity.DropOff;

import java.util.List;

@RestController
public class DropOffController {

    @Autowired
    private DropOffService dropOffService;

    @RequestMapping("/dropOffs")
    public List<DropOff> getAllDropOffs() {
        return dropOffService.getAllDropOffs();
    }

    @RequestMapping("/dropOffs/{id}")
    public DropOff getDropOffs(@PathVariable int id) {
        return dropOffService.getDropOff(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/dropOffs")
    public DropOff addDropOff(@RequestBody DropOff dropOff) {
        return dropOffService.addDropOff(dropOff);
    }

    @RequestMapping(method= RequestMethod.PUT, value="/dropOff/{id}")
    public void updateReturn(@RequestBody DropOff dropOff, @PathVariable int id) {
        dropOff.setId(id);
        dropOffService.updateDropOff(id, dropOff);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/dropOff/{id}")
    public void deleteDropOff(@PathVariable int id) {
        dropOffService.deleteDropOff(id);
    }
}
