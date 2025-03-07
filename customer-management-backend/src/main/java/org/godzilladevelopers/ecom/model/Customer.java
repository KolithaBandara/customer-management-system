package org.godzilladevelopers.ecom.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
    private String id;
    private String name;
    private String address;
    private String contact;
    private String email;
}
