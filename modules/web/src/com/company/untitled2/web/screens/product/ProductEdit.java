package com.company.untitled2.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled2.entity.Product;

@UiController("untitled2_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}