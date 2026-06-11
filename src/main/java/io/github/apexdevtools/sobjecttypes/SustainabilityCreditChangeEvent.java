/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SustainabilityCreditChangeEvent extends SObject {
	public static SObjectType$<SustainabilityCreditChangeEvent> SObjectType;
	public static SObjectFields$<SustainabilityCreditChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Decimal CostPerUnit;
	public Id CrbnCreditProjectId;
	public CrbnCreditProject CrbnCreditProject;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditsAllocated;
	public Decimal CreditsAvailable;
	public Date CreditsIssueDate;
	public Decimal CreditsPurchased;
	public Date CreditsRetiredDate;
	public String CreditsUnit;
	public String CurrencyIsoCode;
	public String Description;
	public String ExternalIdentifier;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Date PurchaseDate;
	public String ReplayId;
	public String Status;
	public Id SupplierId;
	public Supplier Supplier;
	public Id SustainabilityPurchaseId;
	public SustainabilityPurchase SustainabilityPurchase;
	public Decimal TotalCost;
	public String VintageYear;

	public SustainabilityCreditChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCreditChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCreditChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCreditChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityCreditChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
