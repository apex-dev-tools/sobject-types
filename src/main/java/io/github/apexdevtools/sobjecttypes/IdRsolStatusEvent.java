/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class IdRsolStatusEvent extends SObject {
	public static SObjectType$<IdRsolStatusEvent> SObjectType;
	public static SObjectFields$<IdRsolStatusEvent> Fields;

	public Decimal ConsolidationRate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Datetime EventCreationDate;
	public Datetime EventPublishDate;
	public String EventType;
	public String EventUuid;
	public String IdentityResolutionDevName;
	public String IdentityResolutionErrorCode;
	public String LastRunStatus;
	public Datetime LastRunStatusDateTime;
	public Long MatchCount;
	public String ReplayId;
	public String SchemaVersion;
	public Long SourceCount;
	public String StatusDetails;
	public Long TotalAnonymousRecords;
	public Long TotalNonAnonymousRecords;
	public Long UnifiedCount;

	public IdRsolStatusEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public IdRsolStatusEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public IdRsolStatusEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public IdRsolStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public IdRsolStatusEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
