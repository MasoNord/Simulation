package org.example.geneticsimulation.entity;

import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> entities = new HashMap<>();

    public void setEntity(Coordinates coordinates, Entity entity) {
        entity.setCoordinates(coordinates);
        entities.put(coordinates, entity);
    }

}
