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
public class LoyaltyPartnerProduct extends SObject {
	public static SObjectType$<LoyaltyPartnerProduct> SObjectType;
	public static SObjectFields$<LoyaltyPartnerProduct> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LoyaltyPartnerId;
	public LoyaltyProgramPartner LoyaltyPartner;
	public String Name;
	public Id PartnerCategoryDerivedFieldId;
	public ProductCategory PartnerCategoryDerivedField;
	public Decimal PartnerProductCost;
	public Id ProductDerivedFieldId;
	public Product2 ProductDerivedField;
	public Id ProductId;
	public Name Product;
	public Date StartDate;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public LoyaltyPartnerProductHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PromotionLoyaltyPtnrProdt[] PromotionLoyaltyPartnerProduct;

	public LoyaltyPartnerProduct clone$() {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProduct clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProduct clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProduct clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LoyaltyPartnerProduct clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
