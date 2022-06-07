package com.example.appdomain.domain.product;

import com.example.appdomain.annotation.AggregateRoot;

@AggregateRoot(rootId = "product")
public class Product {

    private ProductName productName;
    private Categori categori;
    private BrandName brandName;
    private BarcodeNo barcodeNo;
    private ProductColor productColor;
    private Price price;
    private StockPiece stockPiece;
}
