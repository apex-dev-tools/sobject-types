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
public class EngagementSignalMetric extends SObject {
	public static SObjectType$<EngagementSignalMetric> SObjectType;
	public static SObjectFields$<EngagementSignalMetric> Fields;

	public String AggregateFunction;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id EngagementSignalId;
	public EngagementSignal EngagementSignal;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Datetime SystemModstamp;

	public AttribModelStageMetric[] AttribModelStageMetrics;
	public EngagementSignalCmpndMetric[] EngagementSignalCmpndMtrcs;
	public EngagementSignalCmpndMetric[] EngagementSignalCmpndMtrcs;
	public AbnExperiment[] PrimaryMetrics;

	public EngagementSignalMetric clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalMetric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalMetric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementSignalMetric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
