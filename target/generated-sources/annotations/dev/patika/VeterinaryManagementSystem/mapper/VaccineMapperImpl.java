package dev.patika.VeterinaryManagementSystem.mapper;

import dev.patika.VeterinaryManagementSystem.dto.request.VaccineRequest;
import dev.patika.VeterinaryManagementSystem.dto.response.VaccineResponse;
import dev.patika.VeterinaryManagementSystem.entities.Vaccine;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class VaccineMapperImpl implements VaccineMapper {

    @Override
    public Vaccine asEntity(VaccineRequest vaccineRequest) {
        if ( vaccineRequest == null ) {
            return null;
        }

        Vaccine.VaccineBuilder vaccine = Vaccine.builder();

        vaccine.name( vaccineRequest.getName() );
        vaccine.code( vaccineRequest.getCode() );
        vaccine.protectionStartDate( vaccineRequest.getProtectionStartDate() );
        vaccine.protectionFinishDate( vaccineRequest.getProtectionFinishDate() );

        return vaccine.build();
    }

    @Override
    public VaccineResponse asOutput(Vaccine vaccine) {
        if ( vaccine == null ) {
            return null;
        }

        VaccineResponse vaccineResponse = new VaccineResponse();

        vaccineResponse.setId( vaccine.getId() );
        vaccineResponse.setName( vaccine.getName() );
        vaccineResponse.setCode( vaccine.getCode() );
        vaccineResponse.setProtectionStartDate( vaccine.getProtectionStartDate() );
        vaccineResponse.setProtectionFinishDate( vaccine.getProtectionFinishDate() );
        vaccineResponse.setReportId( vaccine.getReportId() );

        return vaccineResponse;
    }

    @Override
    public List<VaccineResponse> asOutput(List<Vaccine> vaccines) {
        if ( vaccines == null ) {
            return null;
        }

        List<VaccineResponse> list = new ArrayList<VaccineResponse>( vaccines.size() );
        for ( Vaccine vaccine : vaccines ) {
            list.add( asOutput( vaccine ) );
        }

        return list;
    }

    @Override
    public void update(Vaccine entity, VaccineRequest request) {
        if ( request == null ) {
            return;
        }

        entity.setName( request.getName() );
        entity.setCode( request.getCode() );
        entity.setProtectionStartDate( request.getProtectionStartDate() );
        entity.setProtectionFinishDate( request.getProtectionFinishDate() );
    }
}
