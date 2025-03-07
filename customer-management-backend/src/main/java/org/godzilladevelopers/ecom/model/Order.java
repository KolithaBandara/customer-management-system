package org.godzilladevelopers.ecom.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Order {
    private String id;
    private String cid;
    private String bid;
    private String data;
    private String contact;
}
