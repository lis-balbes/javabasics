package com.javabasics.FinalTask;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    private Map<String, List<T>> mailBox;

    MailService () {
        this.mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                //Better to use Collections.emptyList()
                if(!containsKey(key)) return new ArrayList<>();
                else return super.get(key);
            }
        };
    }

    @Override
    public void accept(Sendable<T> message) {
        /* Эталонное решение
        List<T> ts = messagesMap.get(sendable.getTo());
        if (ts.size() == 0) {
            ts = new ArrayList<>();
        }
        ts.add(sendable.getContent());
        messagesMap.put(sendable.getTo(), ts);

        После того, как переопределили get, здесь всё будет работать

        */


        List<T> list = new ArrayList<>();
        if(mailBox.get(message.getTo()) != null) {
            list = mailBox.get(message.getTo());
        }
        list.add(message.getContent());
        mailBox.put(message.getTo(), list);
    }

    public Map<String, List<T>> getMailBox() {
        return this.mailBox;
    }
}
