/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AssetCancelInitiatedEvent extends SObject {
	public static SObjectType$<AssetCancelInitiatedEvent> SObjectType;
	public static SObjectFields$<AssetCancelInitiatedEvent> Fields;

	public AssetCancelErrorDtlEvent[] AssetCancelErrorDetailEvents;
	public String CancellationRecordId;
	public String CorrelationIdentifier;
	public String EventUuid;
	public Boolean HasErrors;
	public String ReplayId;
	public String RequestIdentifier;

	public AssetCancelInitiatedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AssetCancelInitiatedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AssetCancelInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AssetCancelInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AssetCancelInitiatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
