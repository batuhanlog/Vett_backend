package dev.patika.VeterinaryManagementSystem.mapper;

import dev.patika.VeterinaryManagementSystem.dto.request.DoctorRequest;
import dev.patika.VeterinaryManagementSystem.dto.response.AvailableDateResponse;
import dev.patika.VeterinaryManagementSystem.dto.response.DoctorResponse;
import dev.patika.VeterinaryManagementSystem.entities.AvailableDate;
import dev.patika.VeterinaryManagementSystem.entities.Doctor;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Override
    public Doctor asEntity(DoctorRequest doctorRequest) {
        if ( doctorRequest == null ) {
            return null;
        }

        Doctor.DoctorBuilder doctor = Doctor.builder();

        doctor.name( doctorRequest.getName() );
        doctor.phone( doctorRequest.getPhone() );
        doctor.mail( doctorRequest.getMail() );
        doctor.address( doctorRequest.getAddress() );
        doctor.city( doctorRequest.getCity() );

        return doctor.build();
    }

    @Override
    public DoctorResponse asOutput(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorResponse doctorResponse = new DoctorResponse();

        doctorResponse.setId( doctor.getId() );
        doctorResponse.setName( doctor.getName() );
        doctorResponse.setPhone( doctor.getPhone() );
        doctorResponse.setMail( doctor.getMail() );
        doctorResponse.setAddress( doctor.getAddress() );
        doctorResponse.setCity( doctor.getCity() );
        doctorResponse.setAvailableDates( availableDateListToAvailableDateResponseList( doctor.getAvailableDates() ) );

        return doctorResponse;
    }

    @Override
    public List<DoctorResponse> asOutput(List<Doctor> doctor) {
        if ( doctor == null ) {
            return null;
        }

        List<DoctorResponse> list = new ArrayList<DoctorResponse>( doctor.size() );
        for ( Doctor doctor1 : doctor ) {
            list.add( asOutput( doctor1 ) );
        }

        return list;
    }

    @Override
    public void update(Doctor entity, DoctorRequest request) {
        if ( request == null ) {
            return;
        }

        entity.setName( request.getName() );
        entity.setPhone( request.getPhone() );
        entity.setMail( request.getMail() );
        entity.setAddress( request.getAddress() );
        entity.setCity( request.getCity() );
    }

    protected AvailableDateResponse availableDateToAvailableDateResponse(AvailableDate availableDate) {
        if ( availableDate == null ) {
            return null;
        }

        AvailableDateResponse availableDateResponse = new AvailableDateResponse();

        availableDateResponse.setId( availableDate.getId() );
        availableDateResponse.setAvailableDate( availableDate.getAvailableDate() );

        return availableDateResponse;
    }

    protected List<AvailableDateResponse> availableDateListToAvailableDateResponseList(List<AvailableDate> list) {
        if ( list == null ) {
            return null;
        }

        List<AvailableDateResponse> list1 = new ArrayList<AvailableDateResponse>( list.size() );
        for ( AvailableDate availableDate : list ) {
            list1.add( availableDateToAvailableDateResponse( availableDate ) );
        }

        return list1;
    }
}
