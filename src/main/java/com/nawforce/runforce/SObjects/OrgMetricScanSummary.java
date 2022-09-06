/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OrgMetricScanSummary extends SObject {
	public static SObjectType$<OrgMetricScanSummary> SObjectType;
	public static SObjectFields$<OrgMetricScanSummary> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorMessage;
	public Integer FeatureLimit;
	public Id Id;
	public String ImplementationEffort;
	public Boolean IsDeleted;
	public Integer ItemCount;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OrgMetricId;
	public OrgMetric OrgMetric;
	public Decimal PercentUsage;
	public Datetime ScanDate;
	public String Status;
	public Datetime SystemModstamp;
	public String Unit;

	public OrgMetricScanResult[] OrgMetricScanSummary;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public OrgMetricScanSummary clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanSummary clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanSummary clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanSummary clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
