package com.javabasics.post;


public class Thief implements MailService {

    private int cost = 0;
    private int summaryCost = 0;

    public Thief (int cost) {
        this.cost = cost;
    }

    public int getStolenValue() {
        return this.summaryCost;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) return mail;
        else if (mail instanceof MailPackage){
             int price = ((MailPackage) mail).getContent().getPrice();
             String content = ((MailPackage) mail).getContent().getContent();
             if (price >= cost ) {
                 summaryCost += price;
                 Package stolen = new Package("stones instead of " + content, 0);
                 return new MailPackage(mail.getFrom(), mail.getTo(), stolen);
             }
             else return mail;
        }
        return mail;
    }
}
