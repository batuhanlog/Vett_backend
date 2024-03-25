package dev.patika.VeterinaryManagementSystem.mapper;

import dev.patika.VeterinaryManagementSystem.dto.request.AnimalRequest;
import dev.patika.VeterinaryManagementSystem.dto.response.AnimalResponse;
import dev.patika.VeterinaryManagementSystem.entities.Animal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class AnimalMapperImpl implements AnimalMapper {

    @Override
    public Animal asEntity(AnimalRequest animalRequest) {
        if ( animalRequest == null ) {
            return null;
        }

        Animal.AnimalBuilder animal = Animal.builder();

        animal.name( animalRequest.getName() );
        animal.species( animalRequest.getSpecies() );
        animal.breed( animalRequest.getBreed() );
        animal.gender( animalRequest.getGender() );
        animal.colour( animalRequest.getColour() );
        animal.dateOfBirth( animalRequest.getDateOfBirth() );

        return animal.build();
    }

    @Override
    public AnimalResponse asOutput(Animal animal) {
        if ( animal == null ) {
            return null;
        }

        AnimalResponse animalResponse = new AnimalResponse();

        animalResponse.setId( animal.getId() );
        animalResponse.setName( animal.getName() );
        animalResponse.setSpecies( animal.getSpecies() );
        animalResponse.setBreed( animal.getBreed() );
        animalResponse.setGender( animal.getGender() );
        animalResponse.setColour( animal.getColour() );
        animalResponse.setDateOfBirth( animal.getDateOfBirth() );

        return animalResponse;
    }

    @Override
    public List<AnimalResponse> asOutput(List<Animal> animal) {
        if ( animal == null ) {
            return null;
        }

        List<AnimalResponse> list = new ArrayList<AnimalResponse>( animal.size() );
        for ( Animal animal1 : animal ) {
            list.add( asOutput( animal1 ) );
        }

        return list;
    }

    @Override
    public void update(Animal entity, AnimalRequest request) {
        if ( request == null ) {
            return;
        }

        entity.setName( request.getName() );
        entity.setSpecies( request.getSpecies() );
        entity.setBreed( request.getBreed() );
        entity.setGender( request.getGender() );
        entity.setColour( request.getColour() );
        entity.setDateOfBirth( request.getDateOfBirth() );
    }
}
