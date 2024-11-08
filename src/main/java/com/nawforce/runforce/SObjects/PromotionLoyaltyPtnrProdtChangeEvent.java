/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class PromotionLoyaltyPtnrProdtChangeEvent extends SObject {
	public static SObjectType$<PromotionLoyaltyPtnrProdtChangeEvent> SObjectType;
	public static SObjectFields$<PromotionLoyaltyPtnrProdtChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LoyaltyPartnerId;
	public LoyaltyProgramPartner LoyaltyPartner;
	public Id LoyaltyPartnerProductId;
	public LoyaltyPartnerProduct LoyaltyPartnerProduct;
	public Id LoyaltyProductId;
	public Product2 LoyaltyProduct;
	public String Name;
	public Id ProductCategoryId;
	public ProductCategory ProductCategory;
	public Id PromotionId;
	public Promotion Promotion;
	public String ReplayId;

	public PromotionLoyaltyPtnrProdtChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdtChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdtChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdtChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromotionLoyaltyPtnrProdtChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
