package cl.angecom.agriapp.lite.ui.web;

import java.util.Date;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.angecom.agriapp.lite.commands.api.SavePartyCommand;

@RestController
public class PartyController {

	@Autowired
	private CommandGateway commandGateWay;

	@RequestMapping("/")
	public String index() {
		return "Es mi primera prueba con spring boot";
	}

	@RequestMapping("/save")
	@ResponseBody
	public void saveParty() {
		SavePartyCommand savePartyCommand = new SavePartyCommand("001",
				"ACTIVO", new Date());
		commandGateWay.send(savePartyCommand);
	}
}
