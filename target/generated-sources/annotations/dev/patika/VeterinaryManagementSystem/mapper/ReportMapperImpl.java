package dev.patika.VeterinaryManagementSystem.mapper;

import dev.patika.VeterinaryManagementSystem.dto.request.ReportRequest;
import dev.patika.VeterinaryManagementSystem.dto.response.ReportResponse;
import dev.patika.VeterinaryManagementSystem.entities.Report;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ReportMapperImpl implements ReportMapper {

    @Override
    public Report asEntity(ReportRequest reportRequest) {
        if ( reportRequest == null ) {
            return null;
        }

        Report report = new Report();

        report.setTitle( reportRequest.getTitle() );
        report.setDiagnosis( reportRequest.getDiagnosis() );
        report.setPrice( reportRequest.getPrice() );

        return report;
    }

    @Override
    public ReportResponse asOutput(Report report) {
        if ( report == null ) {
            return null;
        }

        ReportResponse reportResponse = new ReportResponse();

        reportResponse.setId( report.getId() );
        reportResponse.setTitle( report.getTitle() );
        reportResponse.setDiagnosis( report.getDiagnosis() );
        reportResponse.setPrice( report.getPrice() );
        reportResponse.setAppointmentId( report.getAppointmentId() );

        return reportResponse;
    }

    @Override
    public List<ReportResponse> asOutput(List<Report> reports) {
        if ( reports == null ) {
            return null;
        }

        List<ReportResponse> list = new ArrayList<ReportResponse>( reports.size() );
        for ( Report report : reports ) {
            list.add( reportToReportResponse1( report ) );
        }

        return list;
    }

    @Override
    public void update(Report entity, ReportRequest request) {
        if ( request == null ) {
            return;
        }

        entity.setTitle( request.getTitle() );
        entity.setDiagnosis( request.getDiagnosis() );
        entity.setPrice( request.getPrice() );
    }

    @Override
    public ReportResponse reportToReportResponse(Report report) {
        if ( report == null ) {
            return null;
        }

        ReportResponse reportResponse = new ReportResponse();

        reportResponse.setId( report.getId() );
        reportResponse.setTitle( report.getTitle() );
        reportResponse.setDiagnosis( report.getDiagnosis() );
        reportResponse.setPrice( report.getPrice() );
        reportResponse.setAppointmentId( report.getAppointmentId() );

        return reportResponse;
    }

    protected ReportResponse reportToReportResponse1(Report report) {
        if ( report == null ) {
            return null;
        }

        ReportResponse reportResponse = new ReportResponse();

        reportResponse.setId( report.getId() );
        reportResponse.setTitle( report.getTitle() );
        reportResponse.setDiagnosis( report.getDiagnosis() );
        reportResponse.setPrice( report.getPrice() );
        reportResponse.setAppointmentId( report.getAppointmentId() );

        return reportResponse;
    }
}
