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
public class PersnlBatchDecision extends SObject {
	public static SObjectType$<PersnlBatchDecision> SObjectType;
	public static SObjectFields$<PersnlBatchDecision> Fields;

	public String ActivationTriggerType;
	public String BatchStatus;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DataSpaceId;
	public DataSpace DataSpace;
	public String Description;
	public String DeveloperName;
	public String ErrorCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastRefresh;
	public Datetime LastSuccessfulRefresh;
	public Datetime LastViewedDate;
	public String LatestRefreshedStatus;
	public Id MarketSegmentId;
	public MarketSegment MarketSegment;
	public Integer ModelRevision;
	public Integer ModelVersion;
	public String Name;
	public String RefreshMode;
	public String Status;
	public Datetime SystemModstamp;

	public PersnlBatchDcsnKeyField[] PersnlBatchDcsnKeyFields;
	public PersnlBatchDcsnPersnlPoint[] PersnlBatchDcsnPersnlPoints;

	public PersnlBatchDecision clone$() {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDecision clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDecision clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDecision clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PersnlBatchDecision clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
