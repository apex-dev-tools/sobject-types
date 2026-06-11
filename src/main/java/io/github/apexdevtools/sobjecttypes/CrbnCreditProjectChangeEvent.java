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
public class CrbnCreditProjectChangeEvent extends SObject {
	public static SObjectType$<CrbnCreditProjectChangeEvent> SObjectType;
	public static SObjectFields$<CrbnCreditProjectChangeEvent> Fields;

	public String AdditionalBenefits;
	public Object ChangeEventHeader;
	public String Country;
	public String CrbnCrMethodology;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DeveloperAccountId;
	public Supplier DeveloperAccount;
	public String ExternalIdentifier;
	public String FundedBy;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MitigationType;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ProjRegistryIdentifier;
	public String ProjectType;
	public String ProjectUrl;
	public String Region;
	public String ReplayId;
	public String StandardsAgencyName;
	public Decimal TotalCrbnCrAllocInTco2e;
	public Decimal TotalCrbnCrAvlInTco2e;
	public Decimal TotalCrbnCrPurchInTco2e;
	public Decimal TotalSpend;
	public String VerifiedBy;
	public String VoluntaryRegistryName;

	public CrbnCreditProjectChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProjectChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CrbnCreditProjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
