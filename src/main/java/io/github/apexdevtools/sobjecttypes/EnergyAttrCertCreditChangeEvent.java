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
public class EnergyAttrCertCreditChangeEvent extends SObject {
	public static SObjectType$<EnergyAttrCertCreditChangeEvent> SObjectType;
	public static SObjectFields$<EnergyAttrCertCreditChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CleanEnergyProjectId;
	public CleanEnergyProject CleanEnergyProject;
	public String CleanEnergyType;
	public Decimal CostPerUnit;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CreditsAllocatedInMwh;
	public Decimal CreditsAvailableInMwh;
	public Date CreditsIssueDate;
	public Decimal CreditsPurchasedInMwh;
	public Date CreditsRetiredDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id EnergyAttrCertPurchaseId;
	public EnergyAttrCertPurchase EnergyAttrCertPurchase;
	public String ExternalIdentifier;
	public Id Id;
	public Boolean IsRetired;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Date PurchaseDate;
	public String ReplayId;
	public Id SupplierId;
	public Supplier Supplier;
	public Decimal TotalCost;
	public String VintagePeriod;

	public EnergyAttrCertCreditChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCreditChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCreditChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCreditChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertCreditChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
