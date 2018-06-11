package cl.agriapp.lite.commandside.party.infraestructure.cuestionario.di;

import org.springframework.beans.factory.annotation.Autowired;

public class GatewayImpl implements IGateway{

    //TODO inject here
    private IService service;

    @Override
    public void someMethod() {
        service.someMethod();
    }
}
