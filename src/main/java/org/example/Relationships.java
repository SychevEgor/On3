package org.example;

import java.util.List;
import java.util.Objects;

public class Relationships   {
    public void showRelations(  List<String> rolls, List<People> famaly) {
        for (int i = 0; i < rolls.size(); i++) {
            for (int j = 0; j < famaly.size(); j++) {
                 famaly.get(i).setStatus(rolls.get(i));
            }
        }
    }
}






