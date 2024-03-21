/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
