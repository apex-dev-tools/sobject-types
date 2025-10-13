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
public class EngagementSignalCmpndMetric extends SObject {
	public static SObjectType$<EngagementSignalCmpndMetric> SObjectType;
	public static SObjectFields$<EngagementSignalCmpndMetric> Fields;

	public String CompoundMetricFormula;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DenomEngmtSignalMetricId;
	public EngagementSignalMetric DenomEngmtSignalMetric;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id NumerEngmtSignalMetricId;
	public EngagementSignalMetric NumerEngmtSignalMetric;
	public String Operator;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public AbnExperiment[] PrimaryMetrics;
	public EngagementSignalCmpndMetricShare[] Shares;

	public EngagementSignalCmpndMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalCmpndMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalCmpndMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalCmpndMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalCmpndMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
