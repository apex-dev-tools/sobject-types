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
public class HealthInsDataSyncJobRunChangeEvent extends SObject {
	public static SObjectType$<HealthInsDataSyncJobRunChangeEvent> SObjectType;
	public static SObjectFields$<HealthInsDataSyncJobRunChangeEvent> Fields;

	public Datetime BatchWindowEnd;
	public Datetime BatchWindowStart;
	public Object ChangeEventHeader;
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
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LastProcessedRecIdentifier;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Datetime StartDateTime;
	public String Status;
	public String StatusReason;
	public Integer SuccessCount;
	public Decimal Throughput;

	public HealthInsDataSyncJobRunChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRunChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRunChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRunChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthInsDataSyncJobRunChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
