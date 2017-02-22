package example.Spring.web.controller;

import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import example.Spring.web.manager.OfferManager;
import example.Spring.web.model.Offer;

@Controller
public class OffersController {

	@Autowired
	@Qualifier("offerManager")
	private OfferManager offerManager;

	// @RequestMapping("/")
	/*
	 * public String showHome() { return "home"; }
	 */
	/*
	 * We can pass any parameters to this function showHome() as long as it is
	 * annotated with request mapping. Basically it can support many argument
	 * types
	 */
	// @RequestMapping("/")
	// public String showHome(HttpSession session) {
	// session.setAttribute("name", "Satyakrishna");
	// return "home";
	// }
	//
	// @RequestMapping("/")
	// public ModelAndView showHome() {
	// ModelAndView mav = new ModelAndView("home");
	// Map<String, Object> map = mav.getModel();
	// map.put("name", "s");
	// return mav;
	// }

	// @RequestMapping("/")
	// public String showhome(Model model) {
	// model.addAttribute("name", "Chimpu");
	// model.addAttribute("FootBall", "KAKA");
	// return "home";
	// }

	// @RequestMapping("/")
	// public String showHome(Model model) {
	// List<Offer> offerList = offerManager.getOffers();
	// model.addAttribute("offers", offerList);
	// return "home";
	// }

	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offerList = offerManager.getOffers();
		model.addAttribute("offers", offerList);
		return "offers";
	}
	
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		return "error";
	}
	
	
/*	@RequestMapping("/handleException")
	public String throwException(Model model) throws Exception {
		offerManager.throwException();
		return "offers";
	}*/

	@RequestMapping("/createOffer")
	public String createOffer(Model model) {
		model.addAttribute("offer", new Offer());
		return "createoffer";
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String showTest(Model model, @RequestParam("id") String id) {
		System.out.println("id " + id);
		return "offers";
	}

	@RequestMapping(value = "/doCreate", method = RequestMethod.GET)
	public String submitAForm(Model model,  @Valid Offer offer, BindingResult result) {
		System.out.println("OFFER : " + offer);
		if (result.hasErrors()) {
			System.out.println("Form doesn't valiidate");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError e : errors) {
				System.out.println(e.getDefaultMessage());
			}
			return "createoffer";
		} else {
			System.out.println("Form validated ...");
			if(offer.getId() == 0) {
				Random random = new Random(20000);
				offer.setId(random.nextInt());
			}
			offerManager.createOffer(offer);
		}
		return "offerCreated";
	}
}
