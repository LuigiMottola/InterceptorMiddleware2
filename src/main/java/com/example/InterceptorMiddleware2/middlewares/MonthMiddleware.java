package com.example.InterceptorMiddleware2.middlewares;

import com.example.InterceptorMiddleware2.services.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MonthMiddleware {

    //logica di controllo prima di eseguire la request dal controller e sarà il middleware a chiamare il service
    //è un layer aggiuntivo

    @Autowired
    private MonthService monthService;


    // public Month getMonth(Integer monthNumber){    }


}