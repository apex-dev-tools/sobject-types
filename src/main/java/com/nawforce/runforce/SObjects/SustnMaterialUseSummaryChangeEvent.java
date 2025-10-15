/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SustnMaterialUseSummaryChangeEvent extends SObject {
	public static SObjectType$<SustnMaterialUseSummaryChangeEvent> SObjectType;
	public static SObjectFields$<SustnMaterialUseSummaryChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal E5AntcpFinclEffMaterialRisks;
	public Decimal E5PctBiologicalMaterials;
	public Decimal E5PctWtScndReusedRecycCmpnt;
	public Decimal E5RateRecyclableCntntProducts;
	public Decimal E5RtRecyclableCntntPrdctPkg;
	public Decimal E5WtPrdctTechBiolMaterials;
	public Decimal E5WtScndReusedRecycComponents;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;

	public SustnMaterialUseSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustnMaterialUseSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustnMaterialUseSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustnMaterialUseSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustnMaterialUseSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
