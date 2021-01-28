package com.servicios.serviciosapi.domain;

import java.sql.Timestamp;

public class TechnicalService {

    public int serviceId;
    public int clientId;
    public int technologicalEquipmentId;
    public int userReceivesId;
    public Timestamp dateReceived;
    public int userDeliversId;
    public Timestamp dateDelivery;
    public boolean delivered;
    public String observation;
    public String technicalReport;
    public Client client;
    public TechnologicalEquipment equipment;
    public User userReceives;
    public User userDelivers;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getTechnologicalEquipmentId() {
        return technologicalEquipmentId;
    }

    public void setTechnologicalEquipmentId(int technologicalEquipmentId) {
        this.technologicalEquipmentId = technologicalEquipmentId;
    }

    public int getUserReceivesId() {
        return userReceivesId;
    }

    public void setUserReceivesId(int userReceivesId) {
        this.userReceivesId = userReceivesId;
    }

    public Timestamp getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Timestamp dateReceived) {
        this.dateReceived = dateReceived;
    }

    public int getUserDeliversId() {
        return userDeliversId;
    }

    public void setUserDeliversId(int userDeliversId) {
        this.userDeliversId = userDeliversId;
    }

    public Timestamp getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Timestamp dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getTechnicalReport() {
        return technicalReport;
    }

    public void setTechnicalReport(String technicalReport) {
        this.technicalReport = technicalReport;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public TechnologicalEquipment getEquipment() {
        return equipment;
    }

    public void setEquipment(TechnologicalEquipment equipment) {
        this.equipment = equipment;
    }

    public User getUserReceives() {
        return userReceives;
    }

    public void setUserReceives(User userReceives) {
        this.userReceives = userReceives;
    }

    public User getUserDelivers() {
        return userDelivers;
    }

    public void setUserDelivers(User userDelivers) {
        this.userDelivers = userDelivers;
    }
}
