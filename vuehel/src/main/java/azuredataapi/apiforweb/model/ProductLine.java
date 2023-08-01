package azuredataapi.apiforweb.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_lines")
public class ProductLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "full_product_line")
    private String fullProductLine;

    @Column(name = "source_db_name")
    private String sourceDbName;

    @Column(name = "plant_code")
    private String plantCode;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "line_no")
    private String lineNo;

    @Column(name = "line_desc")
    private String lineDesc;

    @Column(name = "etl_creation_date")
    private LocalDateTime etlCreationDate;

    @Column(name = "etl_last_updated_date")
    private LocalDateTime etlLastUpdatedDate;

    public ProductLine() {
    }

    public ProductLine(String fullProductLine, String sourceDbName, String plantCode, String locationCode, String lineNo, String lineDesc, LocalDateTime etlCreationDate, LocalDateTime etlLastUpdatedDate) {
        this.fullProductLine = fullProductLine;
        this.sourceDbName = sourceDbName;
        this.plantCode = plantCode;
        this.locationCode = locationCode;
        this.lineNo = lineNo;
        this.lineDesc = lineDesc;
        this.etlCreationDate = etlCreationDate;
        this.etlLastUpdatedDate = etlLastUpdatedDate;
    }

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    public String getFullProductLine() {
        return fullProductLine;
    }

    public void setFullProductLine(String fullProductLine) {
        this.fullProductLine = fullProductLine;
    }

    public String getSourceDbName() {
        return sourceDbName;
    }

    public void setSourceDbName(String sourceDbName) {
        this.sourceDbName = sourceDbName;
    }

    public String getPlantCode() {
        return plantCode;
    }

    public void setPlantCode(String plantCode) {
        this.plantCode = plantCode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLineNo() {
        return lineNo;
    }

    public void setLineNo(String lineNo) {
        this.lineNo = lineNo;
    }

    public String getLineDesc() {
        return lineDesc;
    }

    public void setLineDesc(String lineDesc) {
        this.lineDesc = lineDesc;
    }

    public LocalDateTime getEtlCreationDate() {
        return etlCreationDate;
    }

    public void setEtlCreationDate(LocalDateTime etlCreationDate) {
        this.etlCreationDate = etlCreationDate;
    }

    public LocalDateTime getEtlLastUpdatedDate() {
        return etlLastUpdatedDate;
    }

    public void setEtlLastUpdatedDate(LocalDateTime etlLastUpdatedDate) {
        this.etlLastUpdatedDate = etlLastUpdatedDate;
    }

}
