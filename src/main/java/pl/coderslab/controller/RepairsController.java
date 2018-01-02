package pl.coderslab.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.coderslab.entity.Client;
import pl.coderslab.entity.Repairs;
import pl.coderslab.entity.Status;
import pl.coderslab.repository.ClientRepository;
import pl.coderslab.repository.RepairsRepository;
import pl.coderslab.repository.StatusRepository;


@Controller
@RequestMapping
public class RepairsController {

	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	StatusRepository statusRepository;
	
	@Autowired
	RepairsRepository repairsRepository;
	
	
	@RequestMapping(value = "/user/repairing", method = RequestMethod.GET)
	public String finRepair(Model model, HttpSession ses) {
		Repairs repairs  = new Repairs();
		model.addAttribute("repairs", repairs);
		
		return "repairing";	}
	@RequestMapping(value = "/user/repairing", method = RequestMethod.POST)
    public String repairAdd(
    		@ModelAttribute Repairs repairs, 
    		BindingResult br,
    		Model model, HttpSession ses) {
		Client client = clientRepository.findOne(repairs.getClient().getId());
		client.setStatus(repairs.getStatus());
		repairsRepository.save(repairs);
		clientRepository.save(client);
		
        return "redirect:/user/repaired";
    }
	
	@ModelAttribute("client")
	public List<Client> getClients() {
		return clientRepository.findAll();
	}
	
	@ModelAttribute("clients")
	public List<Client> getInRepair() {
		return clientRepository.findByInRepair();
	}
	
	@ModelAttribute("status")
	public List<Status> getStatus() {
		return statusRepository.findAll();
	}
	
	@RequestMapping("/user/repaired")
	public String inRepair(Model model) {
		List<Client> clients = clientRepository.findByStatus();
        model.addAttribute("clients", clients);
		return "repaired";
	}
	
	@ModelAttribute("test")
	public List<Repairs> getRepairs(){
		return repairsRepository.findByRepaired();
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		List<Repairs> repairz = repairsRepository.findAll();
		model.addAttribute("repairz", repairz);
		return "test";
	}
	
	@RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
    public String editBrand(Model model,
                            HttpSession ses,
                            @PathVariable Long id){
        Client client = clientRepository.findOne(id);
        model.addAttribute("client", client);
      model.addAttribute("id", id);
        return "editNewRepair";
    }

    @RequestMapping(value = "/user/edit/{id}", method = RequestMethod.POST)
    public String saveEditBrand(Model model,
                                HttpSession ses,
                                @ModelAttribute Client client){
    	
        clientRepository.save(client);
        return "redirect:/user/inRepair";
    }
	
    @RequestMapping("/user/del/{id}")
    public String delete(@PathVariable("id") Long id){
        Client client = clientRepository.findOne(id);
        clientRepository.delete(client);
        return "redirect:/user/inRepair";
    }
	
}
