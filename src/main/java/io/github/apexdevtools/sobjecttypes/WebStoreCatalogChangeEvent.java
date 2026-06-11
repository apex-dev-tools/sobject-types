/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WebStoreCatalogChangeEvent extends SObject {
	public static SObjectType$<WebStoreCatalogChangeEvent> SObjectType;
	public static SObjectFields$<WebStoreCatalogChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ProductCatalogId;
	public ProductCatalog ProductCatalog;
	public String ReplayId;
	public Id SalesStoreId;
	public WebStore SalesStore;

	public WebStoreCatalogChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebStoreCatalogChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebStoreCatalogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebStoreCatalogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebStoreCatalogChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
