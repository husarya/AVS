package pl.coderslab.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pl.coderslab.entity.Client;
import pl.coderslab.entity.Status;
import pl.coderslab.entity.User;
import pl.coderslab.repository.ClientRepository;
import pl.coderslab.repository.StatusRepository;
import pl.coderslab.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	StatusRepository statusRepository;
	
//	@RequestMapping(value="/services/login", method=RequestMethod.POST)
//	public String loginFormPost(@RequestParam String login,	
//			                    @RequestParam String password,
//			                    HttpSession sess) {
//		User user = null;
//		user = userRepository.findByLogin(login);
//		if ( user != null) {
//			BCrypt.checkpw(password, user.getPassword());
//			sess.setAttribute("login", user);
//			return "redirect:/AVS";
//		}
//		return "redirect:/services/login";
//	}
	
	@RequestMapping(method = RequestMethod.POST,value="/login")
    public String userLogin(
    		                HttpSession session, 
    		                @RequestParam String login,
    		                @RequestParam String password) {
        List<User> users = userRepository.findAll();
        for(User userLog : users) {
           if(login.equals(userLog.getLogin()) && password.equals(userLog.getPassword())) {
            
                return "redirect:/user";
            }
            	
     }
        session.getServletContext();
        session.setAttribute("AUTHENTICATED", login);
        return "redirect:/login";
        
     }
	@RequestMapping(value = "/user/newRepair", method = RequestMethod.GET)
	public String newRepair(Model model, HttpSession ses) {
		Client client = new Client();
		model.addAttribute("client", client);
		
		return "newRepair";
	}
	@RequestMapping(value = "/user/newRepair", method = RequestMethod.POST)
    public String clientAdd(@ModelAttribute Client client, Model model, HttpSession ses ) {
        Status s = new Status();
        client.setStatus(statusRepository.findOne(1l));
		clientRepository.save(client);
        return "redirect:/user/inRepair";
    }
	
	@RequestMapping("/user/inRepair")
	public String inRepair(Model model) {
		List<Client> clients = clientRepository.findAll();
        model.addAttribute("clients", clients);
		return "inRepair";
	}
	
	
}

