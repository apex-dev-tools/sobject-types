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
public class OrgMetricScanResult extends SObject {
	public static SObjectType$<OrgMetricScanResult> SObjectType;
	public static SObjectFields$<OrgMetricScanResult> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime Date;
	public Integer Flags;
	public Id Id;
	public Boolean IsDeleted;
	public String ItemStatus;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String Object;
	public Id OrgMetricScanSummaryId;
	public OrgMetricScanSummary OrgMetricScanSummary;
	public Integer Profile;
	public Integer Quantity;
	public Datetime SystemModstamp;
	public String Type;
	public String Url;
	public String User;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public OrgMetricScanResult clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanResult clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanResult clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetricScanResult clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
