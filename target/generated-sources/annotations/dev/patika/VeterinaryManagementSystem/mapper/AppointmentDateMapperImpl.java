package dev.patika.VeterinaryManagementSystem.mapper;

import dev.patika.VeterinaryManagementSystem.dto.request.AppointmentDateRequest;
import dev.patika.VeterinaryManagementSystem.dto.response.AppointmentDateResponse;
import dev.patika.VeterinaryManagementSystem.entities.AppointmentDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class AppointmentDateMapperImpl implements AppointmentDateMapper {

    @Override
    public AppointmentDate asEntity(AppointmentDateRequest appointmentDateRequest) {
        if ( appointmentDateRequest == null ) {
            return null;
        }

        AppointmentDate.AppointmentDateBuilder appointmentDate = AppointmentDate.builder();

        appointmentDate.appointmentDate( appointmentDateRequest.getAppointmentDate() );

        return appointmentDate.build();
    }

    @Override
    public List<AppointmentDateResponse> asOutput(List<AppointmentDate> appointmentDate) {
        if ( appointmentDate == null ) {
            return null;
        }

        List<AppointmentDateResponse> list = new ArrayList<AppointmentDateResponse>( appointmentDate.size() );
        for ( AppointmentDate appointmentDate1 : appointmentDate ) {
            list.add( asOutput( appointmentDate1 ) );
        }

        return list;
    }

    @Override
    public void update(AppointmentDate entity, AppointmentDateRequest appointmentDateRequest) {
        if ( appointmentDateRequest == null ) {
            return;
        }

        entity.setAppointmentDate( appointmentDateRequest.getAppointmentDate() );
    }
}
