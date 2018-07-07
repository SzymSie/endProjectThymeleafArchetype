package pl.sda.project.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class WorkersController {


    @Autowired
    private WorkerDao workerDao;


    @RequestMapping("/workers")
    public String getWorkers(Model model) {
        List<Worker> workers = workerDao.findAll();
        model.addAttribute("workers", workers);
        return "workers";

    }


    @RequestMapping("/newWorker")
    public String newWorker(Model model) {
        return "newWorker";

    }


    @RequestMapping(value = "/addWorker", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("worker")Worker worker,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        workerDao.save(worker);
        return "workers";
    }

}
