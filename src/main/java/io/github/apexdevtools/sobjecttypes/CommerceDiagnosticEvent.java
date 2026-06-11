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
public class CommerceDiagnosticEvent extends SObject {
	public static SObjectType$<CommerceDiagnosticEvent> SObjectType;
	public static SObjectFields$<CommerceDiagnosticEvent> Fields;

	public String B2bEdition;
	public String B2bVersion;
	public Integer BrowswerDeviceType;
	public String ContextId;
	public String ContextId2;
	public String ContextMap;
	public String CorrelationId;
	public Integer Count;
	public String EffectiveAccountId;
	public String ErrorCode;
	public String ErrorMessage;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Boolean IsRetry;
	public String Operation;
	public String OperationStage;
	public String OperationStatus;
	public String OperationTime;
	public Integer OsVersion;
	public String RelatedEventIdentifier;
	public String ReplayId;
	public String ServiceName;
	public String UserId;
	public String Username;
	public String WebStoreId;
	public String WebStoreType;

	public CommerceDiagnosticEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CommerceDiagnosticEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CommerceDiagnosticEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CommerceDiagnosticEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CommerceDiagnosticEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
