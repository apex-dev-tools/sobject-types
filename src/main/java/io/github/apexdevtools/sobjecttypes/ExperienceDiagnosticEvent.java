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
public class ExperienceDiagnosticEvent extends SObject {
	public static SObjectType$<ExperienceDiagnosticEvent> SObjectType;
	public static SObjectFields$<ExperienceDiagnosticEvent> Fields;

	public Integer BrowserDeviceType;
	public String ContextId;
	public String ContextId2;
	public String ContextMap;
	public String CorrelationId;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorMessage;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Integer InputCount;
	public Boolean IsRetry;
	public String NetworkId;
	public String Operation;
	public String OperationStage;
	public String OperationStatus;
	public Integer OperationTime;
	public Integer OsVersion;
	public String RelatedEventIdentifier;
	public String ReplayId;
	public Integer ResultCount;
	public String ServiceName;
	public Id UserId;
	public User User;
	public String Username;

	public ExperienceDiagnosticEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExperienceDiagnosticEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExperienceDiagnosticEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExperienceDiagnosticEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExperienceDiagnosticEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
