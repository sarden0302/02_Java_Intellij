package com.kh.CollectionEx.pack1.listEx;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
public class Snack {

    private String snackName;
    private int snackPrice;
    private int snackQuantity;

    @Override
    public String toString() {
        return "snackName=" + snackName + ", snackPrice=" + snackPrice + ", snackQuantity=" + snackQuantity;
    }


}
