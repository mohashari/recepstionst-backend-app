package com.kodaskrip.receptionist;

import java.util.List;

public interface GustService {
    void create();
    List<Guest> getAll();
    Guest get(String id);
}
