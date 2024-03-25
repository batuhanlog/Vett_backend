package dev.patika.VeterinaryManagementSystem.mapper;

import dev.patika.VeterinaryManagementSystem.dto.request.CustomerRequest;
import dev.patika.VeterinaryManagementSystem.dto.response.CustomerResponse;
import dev.patika.VeterinaryManagementSystem.entities.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer asEntity(CustomerRequest customerRequest) {
        if ( customerRequest == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.name( customerRequest.getName() );
        customer.phone( customerRequest.getPhone() );
        customer.mail( customerRequest.getMail() );
        customer.address( customerRequest.getAddress() );
        customer.city( customerRequest.getCity() );

        return customer.build();
    }

    @Override
    public CustomerResponse asOutput(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerResponse customerResponse = new CustomerResponse();

        customerResponse.setId( customer.getId() );
        customerResponse.setName( customer.getName() );
        customerResponse.setPhone( customer.getPhone() );
        customerResponse.setMail( customer.getMail() );
        customerResponse.setAddress( customer.getAddress() );
        customerResponse.setCity( customer.getCity() );

        return customerResponse;
    }

    @Override
    public List<CustomerResponse> asOutput(List<Customer> customer) {
        if ( customer == null ) {
            return null;
        }

        List<CustomerResponse> list = new ArrayList<CustomerResponse>( customer.size() );
        for ( Customer customer1 : customer ) {
            list.add( asOutput( customer1 ) );
        }

        return list;
    }

    @Override
    public void update(Customer entity, CustomerRequest request) {
        if ( request == null ) {
            return;
        }

        entity.setName( request.getName() );
        entity.setPhone( request.getPhone() );
        entity.setMail( request.getMail() );
        entity.setAddress( request.getAddress() );
        entity.setCity( request.getCity() );
    }
}
