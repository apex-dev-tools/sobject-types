/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OrgMetric extends SObject {
	public static SObjectType$<OrgMetric> SObjectType;
	public static SObjectFields$<OrgMetric> Fields;

	public String Category;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String FeatureType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LatestOrgMetricScanSummaryId;
	public OrgMetricScanSummary LatestOrgMetricScanSummary;
	public String Name;
	public Datetime SystemModstamp;

	public OrgMetricScanSummary[] OrgMetric;

	public OrgMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
