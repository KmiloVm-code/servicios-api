package com.servicios.serviciosapi.percistence.mapper;

import com.servicios.serviciosapi.domain.TechnicalService;
import com.servicios.serviciosapi.percistence.entity.Servicio;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    @Mappings({
            @Mapping(source = "idServicio", target = "serviceId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "idEquipo", target = "technologicalEquipmentId"),
            @Mapping(source = "idUsuarioRecibe", target = "userReceivesId"),
            @Mapping(source = "fRecibido", target = "dateReceived"),
            @Mapping(source = "idUsuarioEntrega", target = "userDeliversId"),
            @Mapping(source = "fEntregado", target = "dateDelivery"),
            @Mapping(source = "entregado", target = "delivered"),
            @Mapping(source = "observacion", target = "observation"),
            @Mapping(source = "reporteTecnico", target = "technicalReport"),
            @Mapping(target = "client", ignore = true),
            @Mapping(target = "equipment", ignore = true),
            @Mapping(target = "userDelivers", ignore = true),
            @Mapping(target = "userReceives", ignore = true)
    })
    TechnicalService toService(Servicio servicio);
    List<TechnicalService> toServices(List<Servicio> servicios);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "clientesByIdCliente", ignore = true),
            @Mapping(target = "equiposByIdEquipo", ignore = true),
            @Mapping(target = "usuariosByIdUsuarioRecibe", ignore = true),
            @Mapping(target = "usuariosByIdUsuarioEntrega", ignore = true)
    })
    Servicio toServicio(TechnicalService technicalService);
}
