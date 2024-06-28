package lk.ijse.gdse66.payment_service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PaymentDTO {

    private String paymentId;

    @NotBlank(message = "ticket number can not be null")
    private String ticketNum;

    @DecimalMin(value = "0.0", inclusive = false, message = "payment amount must be greater than zero")
    private double amount;

    @JsonFormat(pattern = "yyyyMMdd")
    private Date purchasedDate;

    private String paymentType;
}
