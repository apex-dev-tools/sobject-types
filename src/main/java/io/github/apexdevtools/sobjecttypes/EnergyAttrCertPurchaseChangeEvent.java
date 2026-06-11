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
public class EnergyAttrCertPurchaseChangeEvent extends SObject {
	public static SObjectType$<EnergyAttrCertPurchaseChangeEvent> SObjectType;
	public static SObjectFields$<EnergyAttrCertPurchaseChangeEvent> Fields;

	public String CertifiedBy;
	public Object ChangeEventHeader;
	public Id CleanEnergyProjectId;
	public CleanEnergyProject CleanEnergyProject;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Date EndDate;
	public Decimal ExpectedAnnualPowerGnrn;
	public String ExternalIdentifier;
	public Id Id;
	public String InvoiceNumber;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Decimal PlannedAnnualPowerGnrn;
	public String ProjRegistryIdentifier;
	public String PurchaseOrderNumber;
	public String PurchaseType;
	public String ReplayId;
	public Date StartDate;
	public Decimal TotEnrgyAttrCrAllocMwh;
	public Decimal TotEnrgyAttrCrAvlMwh;
	public Decimal TotEnrgyAttrCrPurchMwh;
	public Decimal TotalSpend;
	public String TradeLocation;

	public EnergyAttrCertPurchaseChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchaseChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchaseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchaseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EnergyAttrCertPurchaseChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
