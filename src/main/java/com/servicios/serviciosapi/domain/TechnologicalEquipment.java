package com.servicios.serviciosapi.domain;

public class TechnologicalEquipment {
    public int technologicalEquipmentId;
    public int brandId;
    public int modelId;
    public String technologicalEquipment;
    public String serial;
    public Brand brand;
    public Model model;

    public int getTechnologicalEquipmentId() {
        return technologicalEquipmentId;
    }

    public void setTechnologicalEquipmentId(int technologicalEquipmentId) {
        this.technologicalEquipmentId = technologicalEquipmentId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getTechnologicalEquipment() {
        return technologicalEquipment;
    }

    public void setTechnologicalEquipment(String technologicalEquipment) {
        this.technologicalEquipment = technologicalEquipment;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
