package com.javabasics.post;


public class UntrustworthyMailWorker implements MailService{
    MailService[] services;
    RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] services) {
        this.services = services.clone();
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for(MailService service: services) {
            service.processMail(mail);
        }
        realMailService.processMail(mail);
        return mail;
    }
}
