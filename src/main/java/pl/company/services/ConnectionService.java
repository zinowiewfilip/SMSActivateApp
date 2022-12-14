package pl.company.services;

import ru.sms_activate.SMSActivateApi;
import ru.sms_activate.error.base.SMSActivateBaseException;

import java.io.IOException;
import java.math.BigDecimal;

public class ConnectionService {
    BigDecimal balance;

    public String connect(String authKey) throws SMSActivateBaseException, IOException {


        SMSActivateApi smsActivateApi = new SMSActivateApi(authKey);
        balance = smsActivateApi.getBalance();
        return "Connected, actual balance:  " + balance;
    }

}
