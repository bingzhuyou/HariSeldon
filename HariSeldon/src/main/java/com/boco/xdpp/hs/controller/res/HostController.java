package com.boco.xdpp.hs.controller.res;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.boco.xdpp.hs.controller.BocoBaseController;
import com.boco.xdpp.hs.domain.Quote;
import com.boco.xdpp.hs.service.res.HostService;

@Controller
@RequestMapping(value = "host.do")
public class HostController extends BocoBaseController {
	@Autowired
	private HostService hostService;

	@RequestMapping(method = RequestMethod.GET)
	public String getHost(ModelMap model) {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject(
				"http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		System.out.println(quote.toString());
		return "resource/host";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String getHostList(ModelMap model) {
		return "resource/host";
	}
}