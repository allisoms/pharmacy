package com.system.remedios.requests;

import com.system.remedios.EnumsData.Laboratory;
import com.system.remedios.EnumsData.Via;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicinePostRequestBody {
    @NotEmpty(message = "the name cannot be empty")
    private String name;

    @Enumerated
    private Via via;


    private String lot;
    private int quantity;

    @Future
    private LocalDate validity;

    @Enumerated
    private Laboratory laboratory;

    private Boolean ativo = true;
}
