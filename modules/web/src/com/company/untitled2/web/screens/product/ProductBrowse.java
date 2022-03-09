package com.company.untitled2.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled2.entity.Product;

@UiController("untitled2_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}