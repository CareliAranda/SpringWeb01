package mx.gob.queretaro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ciudad")
public class CityController {

	@GetMapping("crear")
	public String crear(ModelMap model) {

		return "ciudad/crear";
	}

}
