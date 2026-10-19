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
public class HealthInsDataSyncJobRun extends SObject {
	public static SObjectType$<HealthInsDataSyncJobRun> SObjectType;
	public static SObjectFields$<HealthInsDataSyncJobRun> Fields;

	public Datetime BatchWindowEnd;
	public Datetime BatchWindowStart;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal Duration;
	public Datetime EarliestNextRunTime;
	public Datetime EndDateTime;
	public Integer FailedCount;
	public Id HealthInsDataSyncDefnId;
	public HealthInsDataSyncDefn HealthInsDataSyncDefn;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastProcessedRecIdentifier;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime StartDateTime;
	public String Status;
	public String StatusReason;
	public Integer SuccessCount;
	public Datetime SystemModstamp;
	public Decimal Throughput;

	public HealthInsDataSyncJobRunShare[] Shares;

	public HealthInsDataSyncJobRun clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRun clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRun clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRun clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRun clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
