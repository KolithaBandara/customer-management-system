package org.godzilladevelopers.ecom.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Order {
    private String oid;
    private String dat;
}
