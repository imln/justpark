package com.justpark.models.electronics;

import com.justpark.models.parking.interfaces.PaymentEnabled;
import com.justpark.models.parking.ticket.Ticket;

public class AutoExitPanel extends Electronics implements PaymentEnabled {
    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }
}
