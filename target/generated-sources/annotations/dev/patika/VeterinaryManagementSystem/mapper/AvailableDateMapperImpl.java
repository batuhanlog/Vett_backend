package dev.patika.VeterinaryManagementSystem.mapper;

import dev.patika.VeterinaryManagementSystem.dto.request.AvailableDateRequest;
import dev.patika.VeterinaryManagementSystem.dto.response.AvailableDateResponse;
import dev.patika.VeterinaryManagementSystem.entities.AvailableDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class AvailableDateMapperImpl implements AvailableDateMapper {

    @Override
    public AvailableDate asEntity(AvailableDateRequest availableDateRequest) {
        if ( availableDateRequest == null ) {
            return null;
        }

        AvailableDate.AvailableDateBuilder availableDate = AvailableDate.builder();

        availableDate.availableDate( availableDateRequest.getAvailableDate() );

        return availableDate.build();
    }

    @Override
    public List<AvailableDateResponse> asOutput(List<AvailableDate> availableDate) {
        if ( availableDate == null ) {
            return null;
        }

        List<AvailableDateResponse> list = new ArrayList<AvailableDateResponse>( availableDate.size() );
        for ( AvailableDate availableDate1 : availableDate ) {
            list.add( asOutput( availableDate1 ) );
        }

        return list;
    }

    @Override
    public void update(AvailableDate entity, AvailableDateRequest request) {
        if ( request == null ) {
            return;
        }

        entity.setAvailableDate( request.getAvailableDate() );
    }
}
