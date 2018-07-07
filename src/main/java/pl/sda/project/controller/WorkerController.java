package pl.sda.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.sda.project.dao.WorkerDao;
import pl.sda.project.entity.Worker;
import pl.sda.project.repository.WorkerRepository;
import pl.sda.project.service.WorkerService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class WorkerController {

    @Autowired
    private WorkerDao workerDao;

    @RequestMapping("/workers")
    public String getAllWorkers(Model model) {
//        return workerService.getAllWorkers();

//        List<Worker> workers = new ArrayList<>();
//        workerRepository.findAll()
//                .forEach(workers::add);
//        return workers;

        List<Worker> workers = workerDao.findAll();
        model.addAttribute("workers", workers);
        return "workers";
    }

    @RequestMapping("/workers/{id}")
    public String getWorker(Model model, @PathVariable long id) {
//        return workerService.getWorker(id);

//        Optional<Worker> worker= workerDao.getById(id);
        Worker worker = workerDao.getById(id);
        model.addAttribute("worker", new Worker());
        return "worker";



//        model.addAttribute("greeting", new Worker());
//        return "greeting";
    }

    @RequestMapping(value="/addWorker", method= RequestMethod.POST)
    public String addWorker(@RequestBody Worker worker) {
//        return workerService.addWorker(worker);

//        return workerRepository.save(worker);
        return "asd";
    }

    @RequestMapping(method= RequestMethod.PUT, value="/workers/{id}")
    public void updateWorker(@RequestBody Worker worker, @PathVariable int id) {
//        workerRepository.save(worker);


    }

    @RequestMapping(method= RequestMethod.DELETE, value="/workers/{id}")
    public void deleteWorker(@PathVariable int id) {
//        workerService.deleteWorker(id);

//        workerRepository.deleteById(id);
    }

}



//    @Autowired
//    private WorkerDaoo workerDao;
//
//
//    @RequestMapping("/workers")
//    public String getWorkers(Model model) {
//        List<pl.sda.project.aworkers.Worker> workers = workerDao.findAll();
//        model.addAttribute("workers", workers);
//        return "aworkers";
//
//    }
//
//
//    @RequestMapping("/newWorker")
//    public String newWorker(Model model) {
//        return "newWorker";
//
//    }
//
//
//    @RequestMapping(value = "/addWorker", method = RequestMethod.POST)
//    public String submit(@Valid @ModelAttribute("worker") pl.sda.project.aworkers.Worker worker,
//                         BindingResult result, ModelMap model) {
//        if (result.hasErrors()) {
//            return "error";
//        }
//        workerDao.save(worker);
//        return "aworkers";
//    }