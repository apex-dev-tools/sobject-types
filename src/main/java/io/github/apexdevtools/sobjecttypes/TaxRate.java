/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class TaxRate extends SObject {
	public static SObjectType$<TaxRate> SObjectType;
	public static SObjectFields$<TaxRate> Fields;

	public String ApplicationBasis;
	public String City;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EndDate;
	public Decimal FlatTaxAmount;
	public Id GeoCountryId;
	public GeoCountry GeoCountry;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LegalEntityId;
	public LegalEntity LegalEntity;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Integer Priority;
	public String ProductCode;
	public Decimal Rate;
	public String RateUsageType;
	public Date StartDate;
	public String State;
	public Datetime SystemModstamp;
	public String TaxCode;
	public String ZipCode;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public TaxRateShare[] Shares;

	public TaxRate clone$() {throw new java.lang.UnsupportedOperationException();}
	public TaxRate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TaxRate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TaxRate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TaxRate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
