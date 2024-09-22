package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Item {
    
    private Long id;

    @Size(max = 50, message = "最大50文字までです")
    @NotBlank(message = "{0}は必須項目です")
    private String itemName;

    @Positive(message = "")
    private int price;

    @Size(max = 100, message = "最大100文字までです")
    @NotBlank(message = "{0}は必須項目です")
    private String itemDescription;
}
