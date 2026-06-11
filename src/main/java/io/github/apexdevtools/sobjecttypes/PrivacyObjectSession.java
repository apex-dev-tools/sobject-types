/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class PrivacyObjectSession extends SObject {
	public static SObjectType$<PrivacyObjectSession> SObjectType;
	public static SObjectFields$<PrivacyObjectSession> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CurrentEntity;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LastPosition;
	public String Name;
	public String ObjectFailureLog;
	public String ObjectStatus;
	public Id OwnerId;
	public Name Owner;
	public String PolicyNode;
	public Integer Position;
	public Id PrivacyJobSessionObjectId;
	public PrivacyJobSession PrivacyJobSessionObject;
	public String ProcessType;
	public Integer ProcessedFailures;
	public Integer ProcessedSuccesses;
	public Integer ProcessedTotal;
	public String Processor;
	public String Queue;
	public Integer QueueLength;
	public Integer RecordsAffected;
	public Integer Retry;
	public Datetime SystemModstamp;
	public Datetime TraversalEndTime;
	public Datetime TraversalStartTime;
	public String UniqueConstraint;

	public PrivacySessionRecordFailure[] PrivacySessionRecordFailures;
	public PrivacyObjectSessionShare[] Shares;

	public PrivacyObjectSession clone$() {throw new java.lang.UnsupportedOperationException();}
	public PrivacyObjectSession clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyObjectSession clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyObjectSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PrivacyObjectSession clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
