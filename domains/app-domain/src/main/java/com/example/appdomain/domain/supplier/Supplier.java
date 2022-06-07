package com.example.appdomain.domain.supplier;

import com.example.appdomain.annotation.AggregateRoot;

@AggregateRoot( rootId = "supplier")

public class Supplier {
    private CompanName companName;
    private Address address;
    private TaxAdministrationNo taxAdministrationNo;
    private CargoCompany cargoCompany;

}
