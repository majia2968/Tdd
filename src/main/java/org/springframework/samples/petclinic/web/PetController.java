package org.springframework.samples.petclinic.web;

import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/owners/{ownerId}")
public class PetController {
	//Using constructor injection to avoid dependency check.
    private final ClinicService clinicService;

    @Autowired
	public PetController(ClinicService clinicService) {
		this.clinicService = clinicService;
	}
    
    @ModelAttribute("types")
    public Collection<PetType> populatePetTypes() {
        return this.clinicService.findPetTypes();
    }
    
    @ModelAttribute("owner")
    public Owner findOwner(@PathVariable("ownerId") int ownerId) {
    	Owner owner = this.clinicService.findOwnerById(ownerId);
        return owner;
    }
    
    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
    
    @InitBinder("pet")
    public void initPetBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(new PetValidator());
    }
    
    @RequestMapping(value = "/pets/new", method = RequestMethod.GET)
    public String initCreationForm(Map<String, Object> model) {
        Pet pet = new Pet();
        model.put("pet", pet);
        return "pets/createOrUpdatePetForm";
    }

    @RequestMapping(value = "/pets/new", method = RequestMethod.POST)
    public String processCreationForm(Owner owner, @Valid Pet pet, BindingResult result, ModelMap model) {
        if (StringUtils.hasLength(pet.getName()) && pet.isNew() && owner.getPet(pet.getName(), true) != null){
            result.rejectValue("name", "duplicate", "already exists");
        }
        if (result.hasErrors()) {
            model.put("pet", pet);
            return "pets/createOrUpdatePetForm";
        } else {
            owner.addPet(pet);
            this.clinicService.savePet(pet);
            return "redirect:/owners/{ownerId}";
        }
    }
    
    @RequestMapping(value="/pets/{petId}", method = RequestMethod.GET)
    public ModelAndView showPet(@PathVariable("petId") int petId) {
        ModelAndView mav = new ModelAndView("pets/petDetails");
        mav.addObject(clinicService.findPetById(petId));
    	return mav;
    }
}
    
    
