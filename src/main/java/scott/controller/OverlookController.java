package scott.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import scott.entities.Profile;
import scott.services.ProfileCollectorService;

@Controller
public class OverlookController {

	@Autowired
	private ProfileCollectorService profileSvc;

	@RequestMapping("/getProfile")
	@ResponseBody
	public Profile showTestString(
			@RequestParam(value = "battletag", required = false, defaultValue = "") String battletag) throws IOException {
		return profileSvc.getProfileAverage(battletag);
	}

	@RequestMapping("/test")
	public String showTest() {
		return "Test";
	}
}
