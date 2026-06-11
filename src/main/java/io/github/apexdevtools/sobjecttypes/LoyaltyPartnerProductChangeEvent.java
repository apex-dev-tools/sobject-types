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
public class LoyaltyPartnerProductChangeEvent extends SObject {
	public static SObjectType$<LoyaltyPartnerProductChangeEvent> SObjectType;
	public static SObjectFields$<LoyaltyPartnerProductChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyPartnerId;
	public LoyaltyProgramPartner LoyaltyPartner;
	public String Name;
	public Id PartnerCategoryDerivedFieldId;
	public ProductCategory PartnerCategoryDerivedField;
	public Decimal PartnerProductCost;
	public Id ProductDerivedFieldId;
	public Product2 ProductDerivedField;
	public Id ProductId;
	public SObject Product;
	public String ReplayId;
	public Date StartDate;

	public LoyaltyPartnerProductChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProductChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProductChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
