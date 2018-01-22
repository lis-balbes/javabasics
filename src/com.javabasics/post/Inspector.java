package com.javabasics.post;



public class Inspector implements MailService{

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            Package currentPackage = ((MailPackage) mail).getContent();
            if(currentPackage.getContent().contains(WEAPONS) || currentPackage.getContent().contains(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if(currentPackage.getContent().contains("stones")) {
                throw new StolenPackageException();
            }
            else return mail;
        }
        else return mail;


    }
}
