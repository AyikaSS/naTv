package models;

import services.LorryService;

public class Lorry implements LorryService {
    private String model;
    private String size;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void stop() {

    }

    @Override
    public void carrying() {

    }
}
