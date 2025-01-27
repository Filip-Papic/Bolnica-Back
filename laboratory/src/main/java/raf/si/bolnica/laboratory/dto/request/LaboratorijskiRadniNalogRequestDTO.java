package raf.si.bolnica.laboratory.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LaboratorijskiRadniNalogRequestDTO {
    String lbp;
    Timestamp odDatuma;
    Timestamp doDatuma;
}
