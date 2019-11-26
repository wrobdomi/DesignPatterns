package com.dominik;

public interface Handler {
    void setNext(Handler h);
    void handle(MyRequeset mr);
}
